import { useState } from 'react';
import { shortenUrl } from '../services/api';
import '../styles/UrlShortener.css';

function UrlShortener() {
  const [url, setUrl] = useState('');
  const [shortUrl, setShortUrl] = useState('');
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');
  const [copied, setCopied] = useState(false);

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError('');
    setShortUrl('');
    setCopied(false);
    setLoading(true);

    try {
      const response = await shortenUrl(url);
      setShortUrl(`http://localhost:8095/${response.data.shortenCode}`);
    } catch {
      setError('Something went wrong. Please try again.');
    } finally {
      setLoading(false);
    }
  };

  const copyToClipboard = () => {
    navigator.clipboard.writeText(shortUrl);
    setCopied(true);
  };

  return (
    <div className="page">
      <div className="card">
        <div className="logo">🔗 ShortLink</div>
        <div className="subtitle">
          Paste a long URL and get a short one instantly
        </div>

        <form className="form" onSubmit={handleSubmit}>
          <input
            className="input"
            type="url"
            placeholder="https://example.com"
            value={url}
            onChange={(e) => setUrl(e.target.value)}
            required
          />
          <button className="button" disabled={loading}>
            {loading ? 'Shortening...' : 'Shorten'}
          </button>
        </form>

        {shortUrl && (
          <div className="result">
            <a href={shortUrl} target="_blank" rel="noreferrer">
              {shortUrl}
            </a>
            <br />
            <button className="copy-btn" onClick={copyToClipboard}>
              {copied ? 'Copied!' : 'Copy'}
            </button>
          </div>
        )}

        {error && <div className="error">{error}</div>}
      </div>
    </div>
  );
}

export default UrlShortener;

import { useState } from 'react';
import { shortenUrl } from '../services/api';
import '../styles/UrlShortener.css';
const API_BASE_URL = import.meta.env.VITE_API_BASE_URL;

function UrlShortener() {
  const [url, setUrl] = useState('');
  const [shortUrl, setShortUrl] = useState('');
  const [loading, setLoading] = useState(false);
  const [copied, setCopied] = useState(false);

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);
    setCopied(false);

    const res = await shortenUrl(url);
    setShortUrl(`${API_BASE_URL}${res.data.shortenCode}`);
    setLoading(false);
  };

  return (
    <div className="hero">
      <h1>Shorten your links. Instantly.</h1>
      <p>Simple, fast, and reliable URL shortener.</p>

      <form onSubmit={handleSubmit} className="form">
        <input
          type="url"
          placeholder="Paste your long URL here"
          value={url}
          onChange={(e) => setUrl(e.target.value)}
          required
        />
        <button disabled={loading}>
          {loading ? 'Working...' : 'Shorten'}
        </button>
      </form>

      {shortUrl && (
        <div className="result">
          <a href={shortUrl} target="_blank">{shortUrl}</a>
          <button
            onClick={() => {
              navigator.clipboard.writeText(shortUrl);
              setCopied(true);
            }}
          >
            {copied ? 'Copied!' : 'Copy'}
          </button>
        </div>
      )}
    </div>
  );
}

export default UrlShortener;

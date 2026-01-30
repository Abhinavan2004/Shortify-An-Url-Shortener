import { useState } from 'react';
import { shortenUrl } from '../services/api';

function UrlShortener() {
  const [url, setUrl] = useState('');
  const [shortUrl, setShortUrl] = useState('');
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError('');
    setShortUrl('');
    setLoading(true);

    try {
      const response = await shortenUrl(url);
      setShortUrl(`http://localhost:8095/${response.data.shortenCode}`);
    } catch (err) {
      setError('Failed to shorten URL');
    } finally {
      setLoading(false);
    }
  };

  return (
    <div style={styles.container}>
      <h2>🔗 URL Shortener</h2>

      <form onSubmit={handleSubmit} style={styles.form}>
        <input
          type="url"
          placeholder="Enter your long URL"
          value={url}
          onChange={(e) => setUrl(e.target.value)}
          required
          style={styles.input}
        />

        <button type="submit" style={styles.button}>
          {loading ? 'Shortening...' : 'Shorten'}
        </button>
      </form>

      {shortUrl && (
        <p>
          Short URL:  
          <a href={shortUrl} target="_blank"> {shortUrl}</a>
        </p>
      )}

      {error && <p style={{ color: 'red' }}>{error}</p>}
    </div>
  );
}

const styles = {
  container: {
    maxWidth: '400px',
    margin: '100px auto',
    padding: '20px',
    background: '#fff',
    borderRadius: '8px',
    boxShadow: '0 0 10px rgba(0,0,0,0.1)'
  },
  form: {
    display: 'flex',
    gap: '10px'
  },
  input: {
    flex: 1,
    padding: '10px'
  },
  button: {
    padding: '10px 15px',
    cursor: 'pointer'
  }
};

export default UrlShortener;

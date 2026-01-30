import '../styles/navbar.css';

function Navbar({ theme, toggleTheme }) {
  return (
    <nav className="navbar">
      <div className="logo">🔗 ShortLink</div>

      <button className="theme-btn" onClick={toggleTheme}>
        {theme === 'light' ? '🌙 Dark' : '☀️ Light'}
      </button>
    </nav>
  );
}

export default Navbar;

import { useState } from 'react';
import Navbar from './components/NavBar';
import UrlShortener from './components/UrlShortener';
import Footer from './components/Footer';

function App() {
  const [theme, setTheme] = useState('light');

  const toggleTheme = () => {
    const newTheme = theme === 'light' ? 'dark' : 'light';
    setTheme(newTheme);
    document.documentElement.setAttribute('data-theme', newTheme);
  };

  return (
    <div style={{ minHeight: '100vh', display: 'flex', flexDirection: 'column' }}>
      <Navbar theme={theme} toggleTheme={toggleTheme} />

      {/* Main content grows */}
      <div style={{ flex: 1 }}>
        <UrlShortener />
      </div>

      <Footer />
    </div>
  );
}

export default App;

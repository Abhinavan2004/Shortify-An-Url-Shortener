import axios from 'axios';

const API_BASE_URL = import.meta.env.VITE_API_BASE_URL;

export const shortenUrl = (url) => {
  return axios.post(`${API_BASE_URL}/api/shorten`, { url });
};

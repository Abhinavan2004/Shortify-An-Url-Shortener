import axios from 'axios';

const API_BASE_URL = 'http://localhost:8095/api';

export const shortenUrl = (url) => {
  return axios.post(`${API_BASE_URL}/shorten`, { url });
};

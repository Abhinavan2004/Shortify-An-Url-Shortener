import axios from 'axios';

const API_BASE_URL = 'http://localhost:8095';

export const shortenUrl = async (originalUrl) => {
  return axios.post(`${API_BASE_URL}/api/shorten`, {
    url: originalUrl
  });
};

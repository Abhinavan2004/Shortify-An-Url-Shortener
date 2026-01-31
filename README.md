
🔗 Shortify – Full-Stack URL Shortener
======================================

Shortify is a high-performance, full-stack URL shortener that converts long, bulky URLs into clean, shareable links. This project demonstrates a complete end-to-end development lifecycle, featuring a React frontend, a Spring Boot REST API, and a Cloud-hosted PostgreSQL database.

🚀 Live Demo
------------

*   Frontend: [https://shortify-an-url-shortener-ui.onrender.com/](https://shortify-an-url-shortener-ui.onrender.com/)
    
*   Backend API: [https://shortify-an-url-shortener.onrender.com](https://shortify-an-url-shortener.onrender.com)
    

✨ Features
----------

*   Instant Shortening: Generates unique, shortened codes for any valid URL.
    
*   Fast Redirection: High-speed redirection using HTTP 301/302 status codes.
    
*   Clipboard Integration: One-click "Copy to Clipboard" functionality.
    
*   Persistent Storage: All data is securely stored in a PostgreSQL database.
    
*   Responsive UI: Fully optimized for mobile, tablet, and desktop views.
    
*   Production Ready: Built with CORS security, environment variable management, and cloud-scaling in mind.
    

🛠️ Tech Stack
--------------

### Frontend

*   React (Vite): Modern UI development with fast HMR.
    
*   CSS3: Custom styling with a focus on UX/UI.
    
*   Axios: For robust API communication.
    

### Backend

*   Java 17 / Spring Boot 3.9: Enterprise-grade backend framework.
    
*   Spring Data JPA: For seamless database interactions.
    
*   Hibernate: Managing ORM and schema transitions.
    

### Database & DevOps

*   Neon PostgreSQL: Serverless cloud database.
    
*   Render: Automated CI/CD deployment for both web services and static sites.
    
*   Git/GitHub: Version control and source management.
    

🏗️ System Architecture
-----------------------

1.  Client: User enters a URL on the React frontend.
    
2.  API Layer: The request is sent to the Spring Boot /api/shorten endpoint.
    
3.  Service Layer: The backend generates a unique hash and saves the mapping.
    
4.  Database: Neon PostgreSQL stores the shortCode and longUrl.
    
5.  Redirect: When the short link is clicked, the backend fetches the original URL and performs a 301 redirect.
    


🧩 Challenges & Solutions
-------------------------

*   CORS Security: Resolved cross-origin resource sharing issues by implementing a global CorsConfig to allow secure communication between the UI and API.
    
*   Database Migration: Successfully transitioned from local MySQL to Cloud PostgreSQL (Neon), handling driver-specific nuances and SSL connection requirements (sslmode=require).
    
*   Deployment Sync: Synchronized environment variables (VITE\_API\_BASE\_URL) across Render platforms to ensure the production build pointed to the live backend rather than localhost.
    

⚙️ Installation & Local Setup
-----------------------------

1.  Clone the projectgit clone [https://github.com/Abhinavan2004/Shortify-An-Url-Shortener.git](https://www.google.com/search?q=https://github.com/Abhinavan2004/Shortify-An-Url-Shortener.git)
    
2.  Backend Setup
    
    *   Navigate to the backend folder.
        
    *   Configure application-local.properties with your database credentials.
        
    *   Run ./mvnw spring-boot:run
        
3.  Frontend Setup
    
    *   Navigate to frontend/url-shortener.
        
    *   Run npm install and then npm run dev.
        

👤 Author
---------

Abhinavan2004: [https://github.com/Abhinavan2004](https://github.com/Abhinavan2004)

import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import 'bootstrap/dist/css/bootstrap.min.css'; // Bootstrap CSS
import 'owl.carousel/dist/assets/owl.carousel.min.css'; // Owl Carousel CSS
import 'owl.carousel/dist/assets/owl.theme.default.min.css'; // Owl Carousel theme CSS
import 'jquery-nice-select/css/nice-select.css'; // Nice Select CSS
import 'bootstrap/dist/js/bootstrap.bundle.min'; // Bootstrap JS với Popper


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

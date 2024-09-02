import React, { useEffect } from 'react';
import Header from '../Header/Header';
import Footer from '../Footer/Footer';
import FoodSection from '../Section/FoodSection';


const HomePage = () => {
    useEffect(() => {
        // Khởi tạo carousel khi component mount
        const carouselElement = document.getElementById('customCarousel1');
        if (carouselElement) {
            new window.bootstrap.Carousel(carouselElement, {
                interval: 5000, // Thay đổi thời gian tự động chuyển slide
                wrap: true
            });
        }
    }, []);

    return (
        <div>
            <Header />
            <main>
                <FoodSection />
            </main>
            <Footer />
        </div>
    );
}

export default HomePage;

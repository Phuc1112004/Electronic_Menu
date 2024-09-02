import React, { useEffect } from 'react';
import $ from 'jquery';
import 'owl.carousel';

const SliderSection = () => {
    useEffect(() => {
        // Khởi tạo Owl Carousel
        $('#customCarousel1').owlCarousel({
            items: 1,
            loop: true,
            nav: true,
            dots: true,
            autoplay: true,
            autoplayTimeout: 5000
        });
    }, []);

    return (
        <section className="slider_section">
            <div id="customCarousel1" className="owl-carousel">
                {/* Các item carousel */}
                <div className="item">
                    <h1>Fast Food Restaurant</h1>
                    <p>
                        Doloremque, itaque aperiam facilis rerum, commodi, temporibus sapiente ad mollitia laborum quam quisquam esse error unde.
                    </p>
                    <a href="" className="btn1">Order Now</a>
                </div>
                {/* Thêm các item khác */}
            </div>
        </section>
    );
};

export default SliderSection;

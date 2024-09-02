import React from 'react';

const FoodSection = () => {
  return (
    <>
      <section className="offer_section layout_padding-bottom">
        <div className="offer_container">
          <div className="container">
            <div className="row">
              <div className="col-md-6">
                <div className="box">
                  <div className="img-box">
                    <img src="images/o1.jpg" alt="Tasty Thursdays" />
                  </div>
                  <div className="detail-box">
                    <h5>Tasty Thursdays</h5>
                    <h6><span>20%</span> Off</h6>
                    <a href="#" className="no-underline">
                      Order Now
                      <svg
                        version="1.1"
                        id="Capa_1"
                        xmlns="http://www.w3.org/2000/svg"
                        xmlnsXlink="http://www.w3.org/1999/xlink"
                        viewBox="0 0 456.029 456.029"
                        xmlSpace="preserve"
                      >
                        <g>
                          <path d="M345.6,338.862c-29.184,0-53.248,23.552-53.248,53.248c0,29.184,23.552,53.248,53.248,53.248 c29.184,0,53.248-23.552,53.248-53.248C398.336,362.926,374.784,338.862,345.6,338.862z" />
                        </g>
                        <g>
                          <path d="M439.296,84.91c-1.024,0-2.56-0.512-4.096-0.512H112.64l-5.12-34.304C104.448,27.566,84.992,10.67,61.952,10.67H20.48 C9.216,10.67,0,19.886,0,31.15c0,11.264,9.216,20.48,20.48,20.48h41.472c2.56,0,4.608,2.048,5.12,4.608l31.744,216.064 c4.096,27.136,27.648,47.616,55.296,47.616h212.992c26.624,0,49.664-18.944,55.296-45.056l33.28-166.4 C457.728,97.71,450.56,86.958,439.296,84.91z" />
                        </g>
                        <g>
                          <path d="M215.04,389.55c-1.024-28.16-24.576-50.688-52.736-50.688c-29.696,1.536-52.224,26.112-51.2,55.296 c1.024,28.16,24.064,50.688,52.224,50.688h1.024C193.536,443.31,216.576,418.734,215.04,389.55z" />
                        </g>
                      </svg>
                    </a>
                  </div>
                </div>
              </div>
              <div className="col-md-6">
                <div className="box">
                  <div className="img-box">
                    <img src="images/o2.jpg" alt="Pizza Days" />
                  </div>
                  <div className="detail-box">
                    <h5>Pizza Days</h5>
                    <h6><span>15%</span> Off</h6>
                    <a href="#"  className="no-underline">
                      Order Now
                      <svg
                        version="1.1"
                        id="Capa_1"
                        xmlns="http://www.w3.org/2000/svg"
                        xmlnsXlink="http://www.w3.org/1999/xlink"
                        viewBox="0 0 456.029 456.029"
                        xmlSpace="preserve"
                      >
                        <g>
                          <path d="M345.6,338.862c-29.184,0-53.248,23.552-53.248,53.248c0,29.184,23.552,53.248,53.248,53.248 c29.184,0,53.248-23.552,53.248-53.248C398.336,362.926,374.784,338.862,345.6,338.862z" />
                        </g>
                        <g>
                          <path d="M439.296,84.91c-1.024,0-2.56-0.512-4.096-0.512H112.64l-5.12-34.304C104.448,27.566,84.992,10.67,61.952,10.67H20.48 C9.216,10.67,0,19.886,0,31.15c0,11.264,9.216,20.48,20.48,20.48h41.472c2.56,0,4.608,2.048,5.12,4.608l31.744,216.064 c4.096,27.136,27.648,47.616,55.296,47.616h212.992c26.624,0,49.664-18.944,55.296-45.056l33.28-166.4 C457.728,97.71,450.56,86.958,439.296,84.91z" />
                        </g>
                        <g>
                          <path d="M215.04,389.55c-1.024-28.16-24.576-50.688-52.736-50.688c-29.696,1.536-52.224,26.112-51.2,55.296 c1.024,28.16,24.064,50.688,52.224,50.688h1.024C193.536,443.31,216.576,418.734,215.04,389.55z" />
                        </g>
                      </svg>
                    </a>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section className="food_section layout_padding">
        <div className="container">
          <div className="heading_container heading_center">
            <h2>Our Menu</h2>
          </div>

          <ul className="filters_menu">
            <li className="active" data-filter="*">All</li>
            <li data-filter=".burger">Burger</li>
            <li data-filter=".pizza">Pizza</li>
            <li data-filter=".pasta">Pasta</li>
            <li data-filter=".fries">Fries</li>
          </ul>

          <div className="filters-content">
            <div className="row grid">
              <div className="col-sm-6 col-lg-4 all pizza">
                <div className="box">
                  <div>
                    <div className="img-box">
                      <img src="images/f1.png" alt="Delicious Pizza" />
                    </div>
                    <div className="detail-box">
                      <h5>Delicious Pizza</h5>
                      <p>
                        Veniam debitis quaerat officiis quasi cupiditate quo, quisquam velit, magnam voluptatem repellendus sed eaque
                      </p>
                      <div className="options">
                        <h6>$20</h6>
                        <a href="#" className="no-underline">
                          <svg
                            version="1.1"
                            id="Capa_1"
                            xmlns="http://www.w3.org/2000/svg"
                            xmlnsXlink="http://www.w3.org/1999/xlink"
                            viewBox="0 0 456.029 456.029"
                            xmlSpace="preserve"
                          >
                            <g>
                              <path d="M345.6,338.862c-29.184,0-53.248,23.552-53.248,53.248c0,29.184,23.552,53.248,53.248,53.248 c29.184,0,53.248-23.552,53.248-53.248C398.336,362.926,374.784,338.862,345.6,338.862z" />
                              <path d="M439.296,84.91c-1.024,0-2.56-0.512-4.096-0.512H112.64l-5.12-34.304C104.448,27.566,84.992,10.67,61.952,10.67H20.48 C9.216,10.67,0,19.886,0,31.15c0,11.264,9.216,20.48,20.48,20.48h41.472c2.56,0,4.608,2.048,5.12,4.608l31.744,216.064 c4.096,27.136,27.648,47.616,55.296,47.616h212.992c26.624,0,49.664-18.944,55.296-45.056l33.28-166.4 C457.728,97.71,450.56,86.958,439.296,84.91z" />
                              <path d="M215.04,389.55c-1.024-28.16-24.576-50.688-52.736-50.688c-29.696,1.536-52.224,26.112-51.2,55.296 c1.024,28.16,24.064,50.688,52.224,50.688h1.024C193.536,443.31,216.576,418.734,215.04,389.55z" />
                            </g>
                          </svg>
                        </a>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              {/* Add more items as needed */}
            </div>
          </div>
        </div>
      </section>
    </>
  );
};

export default FoodSection;

import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import { Link } from "react-router-dom";

import "./styles.css";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <Link to={"/"}>
            <h1>DSMovie by Tiago</h1>
          </Link>

          <a href="https://github.com/tiagogomes187/dsmovie.git">
            <div className="dsmovie-contact-container">
              <GithubIcon />
              <p className="dsmovie-contact-link">/tiagogomes187</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;

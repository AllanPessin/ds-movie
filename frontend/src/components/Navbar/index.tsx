import { Link } from 'react-router-dom'
import { ReactComponent as GithubIcon } from '../../assets/img/github.svg'
import './styles.css'

export default function Navbar() {
  return (
    <header>
      <nav className='container'>
        <div className='dsmovie-nav-content'>
          <Link to="/">
            <h1>DS Movie</h1>
          </Link>
          <a href="https://github.com/AllanPessin">
            <div className='dsmovie-contact-container'>
              <GithubIcon></GithubIcon>
              <p className='dsmovie-contact-link'>/AllanPessin</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  )
}
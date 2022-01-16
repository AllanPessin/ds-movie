import { ReactComponent as GithubIcon } from '../../assets/img/github.svg'
import './styles.css'

export default function Navbar() {
  return (
    <header>
      <nav className='container'>
        <div className='dsmovie-nav-content'>
          <h1>DS Movie</h1>
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
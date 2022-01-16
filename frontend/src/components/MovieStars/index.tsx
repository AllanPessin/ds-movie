import { FaRegStar, FaStarHalfAlt, FaStar } from "react-icons/fa";
import "./styles.css"

export default function MovieStars() {
  return (
    <div className="dsmovie-stars-container">
      <FaStar />
      <FaStar />
      <FaStar />
      <FaStarHalfAlt />
      <FaRegStar />      
    </div>
  )
}
import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    <nav className="flex justify-between border-b-2 border-blue-400 pb-2 my-2">
      <h1>Car Plate</h1>
      <div className="flex gap-x-1">
        <Link to="/">Home</Link>
        <Link to="/about">About</Link>
      </div>
    </nav>
  );
}

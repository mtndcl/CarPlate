import Navbar from "../components/Navbar";
import SearchBar from "../components/SearchBar";
import PlateCard from "../components/PlateCard";
import { useState, useEffect } from "react";

export default function Home() {
  const [data, setData] = useState<any[]>();
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetch(`http://localhost:8080/api/plate/allPlate`)
      .then((res) => res.json())
      .then((data) => setData(data))
      .catch((error) => console.log("An error occurred in Home page", error));
  }, []);
  return (
    <div>
      <Navbar />

      <div className="flex justify-center">
        <SearchBar />
      </div>

      <h1 className="mb-4">Home Page</h1>

      <div className="flex gap-4">
        {data?.map((plate) => (
          <PlateCard plateNumber={plate.plateNumber} key={plate.id} />
        ))}
      </div>
    </div>
  );
}

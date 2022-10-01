import Navbar from "../components/Navbar";
import SearchBar from "../components/SearchBar";
import PlateCard from "../components/PlateCard";
import { useState, useEffect } from "react";

export type Comment={
    id:number,
    text:string,
    star:number;
}
export  type Plate={
    id:number,
    plateNumber:string,
    commentList:Comment[];

}

export default function Home() {
  const [plates, setPlates] = useState<Plate[]>();
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetch(`http://localhost:8080/api/plate/allPlate`)
      .then((res) => res.json())
      .then((data) => setPlates(data))
      .catch((error) => console.log("An error occurred in Home page", error));
  }, []);
  return (
    <div>
      <Navbar />

      <div className="flex justify-center">
        <SearchBar />
      </div>

      <h1 className="mb-4">Home Page</h1>

      <div className="grid grid-cols-3" >
        {plates?.map((plate) => (
          <PlateCard plate={plate} key={plate.id}  />
        ))}
      </div>
    </div>
  );
}

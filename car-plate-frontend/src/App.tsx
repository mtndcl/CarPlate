import {BrowserRouter, Route, Routes} from "react-router-dom";
import About from "./pages/About";
import Home from "./pages/Home";
import Plates from "./pages/Plates";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path="about" element={<About/>}/>
                <Route path="plates" element={<Plates/>}/>
            </Routes>
        </BrowserRouter>
    );
}

export default App;

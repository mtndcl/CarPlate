import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import  "./index.css";

const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
root.render(
  <React.StrictMode>
    <div className="w-1/2 mx-auto">
      <App />
    </div>
  </React.StrictMode>
);

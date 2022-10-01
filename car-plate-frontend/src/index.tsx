import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import  "./index.css";

const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
root.render(
  <React.StrictMode>
    <div className="w-4/5 mx-auto">
      <App />
    </div>
  </React.StrictMode>
);

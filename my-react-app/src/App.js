import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import LoginPage from './Components/LoginPage';
import RegistrationForm from './Components/RegistrationForm';

function App() {

  return (

    <Router>

      <Routes>

        <Route path="/register" element={<RegistrationForm />} />

        <Route path="/" element={<LoginPage />} />

      </Routes>

    </Router>

  );

}

export default App;
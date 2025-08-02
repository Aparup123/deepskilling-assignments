import { useState } from 'react';
import './App.css';
import Greeting from './components/Greeting';
import LoginButton from './components/LoginButton';
import LogoutButton from './components/LogoutButton';
function App() {
  const [isLoggedIn, setIsLoggedIn]=useState(false);
  const handleLogout=()=>setIsLoggedIn(false);
  const handleLogin=()=>setIsLoggedIn(true);
  return (
    <div className="App">
      <Greeting isLoggedIn={isLoggedIn}/>
      {isLoggedIn?<LogoutButton onClick={handleLogout}/>:<LoginButton onClick={handleLogin} />}
    </div>
  );
}

export default App;

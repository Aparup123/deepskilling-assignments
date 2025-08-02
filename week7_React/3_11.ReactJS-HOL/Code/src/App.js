
import { useState } from 'react';
import CurrencyConverter from './components/CurrencyConverter';
function App() {
  const [counter, setCounter] = useState(0);
  const incrementCounter = () => setCounter(counter + 1);
  const decrementCounter = () => setCounter(counter - 1);

  const handleIncrement = () => {
    incrementCounter();
    alert("Hello Member!");
  };
  const handleDecrement = () => {
    decrementCounter();
  }
  const sayWelcome = (message) => {
    alert(message);
  }
  const handleClickOnMe = (event) => {
    alert("I was clicked!");
  }
  return (
    <div>
      <div style={{
        display: 'inline-flex',
        flexDirection: 'column',
        margin: '20px',
        gap: '10px',
      }}>
        <p>{counter}</p>
        <button onClick={handleIncrement}>Increment</button>
        <button onClick={handleDecrement}>Decrement</button>
        <button onClick={()=>sayWelcome("welcome")}>Say Welcome</button>
        <button onClick={handleClickOnMe}>Click on me</button>
      </div>
      <CurrencyConverter/>
    </div>
  );
}

export default App;

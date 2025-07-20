
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import TrainerList from './TrainerList';
import Home from './Home';
import TrainerDetail from './TrainerDetail';
import Layout from './Layout';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<Layout/>}>
          <Route path='home' element={<Home/>} />
          <Route path='trainers' element={<TrainerList/>} />
          <Route path='trainers/:trainerId' element={<TrainerDetail/>} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;

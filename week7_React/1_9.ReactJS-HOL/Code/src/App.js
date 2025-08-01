import './App.css';
import EvenPlayers from './components/EvenPlayers';
import ListOfIndianPlayers from './components/ListOfIndianPlayers';
import ListOfPlayers from './components/ListOfPlayers';
import OddPlayers from './components/OddPlayers';
import ScoreBelow70 from './components/ScoreBelow70';
import { indianPlayers } from './indianPlayers';
import { players } from './players';

const teamIndia=[
  {
    number: 1,
    name: "Sachin"
  },
  {
    number: 2,
    name: "Dhoni"
  },
  {
    number: 3,
    name: "Virat"
  },
  {
    number: 4,
    name: "Rohit"
  },
  {
    number: 5,
    name: "Yuvraj"
  },
  {
    number: 6,
    name: "Rohit"
  }
]


function App() {
  const flag=true;
  if(flag===true){
    return (
      <div>
        <h1>List of players</h1>
        <ListOfPlayers players={players}/>
        <hr/>
        <h1>List of players having scores less than 70</h1>
        <ScoreBelow70 players={players}/>
      </div>
    )
  }else{
    return <div>
      <div>
        <h1>Indian Team</h1>
        <h1>Odd Players</h1>
        <OddPlayers players={teamIndia}/>
        <hr/>
        <h1>Even Players</h1>
        <EvenPlayers players={teamIndia}/>
      </div>
      <hr/>
      <div> 
        <h1>List of Indian Players Merged: </h1>
        <ListOfIndianPlayers indianPlayers={indianPlayers} />
      </div>
      </div>
  }
  
 
}

export default App;

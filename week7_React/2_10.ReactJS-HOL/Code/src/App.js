import officeImage1 from "./images/office1.png";
import officeImage2 from "./images/office2.png";
import officeImage3 from "./images/office3.png";
import Office from './components/Office';
import './App.css';

function App() {
  const element = "Office Space"
  const offices=[{
    id: 1,
    name: "DBS",
    image: officeImage1,
    rent: 50000,
    address: "Chennai"
  },
  {
    id: 2,
    name: "HDFC",
    image: officeImage2,
    rent: 60000,
    address: "Bangalore"
  },
  {
    id: 3,
    name: "ICICI",
    image: officeImage3,
    rent: 70000,
    address: "Mumbai"
  }]

  return (
    <div>
      <h1>{element}, at affordable range</h1>
      <div className="office-list">
        {offices.map((office) => (
          <Office key={office.id} office={office} />
        ))}
      </div>
    </div>
  );
}

export default App;

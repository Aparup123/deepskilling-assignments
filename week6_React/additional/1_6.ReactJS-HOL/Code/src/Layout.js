import { Link, Outlet } from "react-router-dom";

export default function Layout() {
    return <div>
        <nav>
            <h1>My Academy Trainers App</h1>
            <Link to={"/home"}>Home</Link> | <Link to={"/trainers"}> Show Trainers</Link>
        </nav>
        <Outlet/>
    </div>
}
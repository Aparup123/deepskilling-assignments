import { Component } from "react";
import Cart from "./Cart";

export default class OnlineShopping extends Component {
    render() {
        const items = [
            { itemname: "Laptop", price: 80000 },
            { itemname: "Tv", price: 40000 },
            { itemname: "Fridge", price: 35000 },
            { itemname: "Table", price: 12000 },
            { itemname: "Washing Machine", price: 43967}
        ]
        return <div className="cart">
            <h1>Items ordered: </h1>
            <table className="items">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <Cart items={items} />
            </table>
        </div>
    }
}
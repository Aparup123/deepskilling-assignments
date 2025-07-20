import { Component } from "react";

export default class Cart extends Component {
    render() {
        return <tbody>
            {
                this.props.items.map((item) => {
                    return (

                        <tr>
                            <td>{item.itemname}</td>
                            <td>{item.price}</td>
                        </tr>
                    )
                })
            }
        </tbody>


    }
}
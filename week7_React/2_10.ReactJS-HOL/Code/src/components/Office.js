export default function Office({ office }) {
    const color=office.rent<60000?"red": "green";
    return (
        <div className="office">
            <img src={office.image} width="25%" height="25%" alt="Office Space" />
            <h1>Name: {office.name}</h1>
            <h3 style={{
                color: color,
            }}>Rent: Rs. {office.rent}</h3>
            <h3>Address: {office.address}</h3>
            <hr></hr>
        </div>
    );
    }
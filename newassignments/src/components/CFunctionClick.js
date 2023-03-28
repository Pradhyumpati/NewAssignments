import React from 'react';
class CFunctionClick extends React.Component
{
    changeEvent()
    {
        console.log("Helloo pradhyummmm")
    }
render()
{

    const number=[3,4,5,6];
    const newnumber = number.map(function(number)
    {
return <li>{number}</li>
    });
return (
    <div>
        <button onClick={this.changeEvent}>
            click mee broo
        
        </button>
        <ul>{newnumber}</ul>
    </div>
)
}
}
export default CHeader;
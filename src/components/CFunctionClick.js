import React from 'react';
class CFunctionClick extends React.Component
{
    changeEvent()
    {
        console.log("Helloo pradhyummmm")
    }
render()
{
return (
    <div>
        <button onClick={this.changeEvent}>
            click mee broo
        
        </button>
    </div>
)
}
}
export default CHeader;
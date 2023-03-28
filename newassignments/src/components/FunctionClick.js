import React from 'react'
function FunctionClick()
{
function changeEvent()
{
    console.log("Helloo Event Handling")
}
    
    return(
<div>
   <button onClick={changeEvent}></button>
</div>
    )
}
export default FunctionClick
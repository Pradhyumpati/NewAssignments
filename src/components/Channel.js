import React from 'react';
class Channel extends React.Component
{
constructor()
{
    super();
    this.state={
msg:'hello from mendiss broo'
    }
}

subscribe()
{
    this.setState({
        msg:"hello from pradhyummmmm"
    })
}

render()
{
return (
    <div>
         <h1>{this.state.msg}</h1>
         <button onClick={()=>{this.subscribe()}}>click mee</button>
    </div>
)
}
}
export default Channel;
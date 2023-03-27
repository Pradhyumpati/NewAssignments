import React from 'react';
class Channel extends React.Component
{
constructor(props)
{
    super(props);
    this.state={
msg:'hello from mendiss broo',
roll:this.props.roll
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
         <h2>heeee{this.props.roll}</h2>
    </div>
)
}
}
export default Channel;
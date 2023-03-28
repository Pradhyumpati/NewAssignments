import React from 'react'
import './Style.css';
class stylesheet extends React.Component
{
    // constuctor(props)
    // {
    //     super(props);
    //     let className=this.props.isvalue ? 'demo' : '';
    // }
     
    render()
    {


    
    return(
        <div>
            <h1 className={'${demo} demo1'}> hello sylesheet</h1>
        </div>
    );
}
}
export default stylesheet
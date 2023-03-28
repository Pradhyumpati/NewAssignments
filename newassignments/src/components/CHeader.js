import React,{Fragment} from 'react';
class CHeader extends React.Component
{
render()
{
    const number=[3,4,5,6];
    const newnumber = number.map(function(number)
    {
return <li>{number}</li>
    });
//     const number=[3,4,5,6];
//     const newnumber = number.map((number)=>
//     {
// return <li>{number}</li>
//     });
// return <React.Fragment> 
//     <h1> Hello {this.props.name}</h1>
//     </React.Fragment>
// return <Fragment> 
//     <h1> Hello {this.props.name}</h1>
//     </Fragment>
return <> 
    <h1> Hello {this.props.name}</h1>
    <ul>{newnumber}</ul>
    </>
}
// }
}
export default CHeader;
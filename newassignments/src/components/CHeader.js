import React,{Fragment} from 'react';
class CHeader extends React.Component
{
render()
{
// return <React.Fragment> 
//     <h1> Hello {this.props.name}</h1>
//     </React.Fragment>
// return <Fragment> 
//     <h1> Hello {this.props.name}</h1>
//     </Fragment>
return <> 
    <h1> Hello {this.props.name}</h1>
    </>
}
// }
}
export default CHeader;
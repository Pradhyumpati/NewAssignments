import logo from './logo.svg';
import React from 'react';
import './App.css';
import {Header} from './components/Header'
import CHeader from './components/CHeader'
import Channel from './components/Channel'
import Stylesheet from './components/Stylesheet'
import Inline from './components/Inline';
import Routing1 from './components/Routing1';
import Postlist from './components/Postlist';
import Hooks from './components/Hooks';
class App extends React.Component
{
  render()
  {
  return (
    <div className="App">
     <h1> Hello Pradhyum...</h1>
      <Header name="mendiss"/>
      <Header name="mendiss1"/>

      <CHeader name="brother"/>
<Channel/>

<Stylesheet isvalue={false}/>

<Inline/>

<Routing1/>
<Postlist/>
<Hooks />
    </div>
  );
}
}

export default App;

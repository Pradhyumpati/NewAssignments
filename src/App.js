import logo from './logo.svg';
import React from 'react';
import './App.css';
import {Header} from './components/Header'
import CHeader from './components/CHeader'
import Channel from './components/Channel'
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



    </div>
  );
}
}

export default App;

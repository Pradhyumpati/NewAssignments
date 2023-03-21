import logo from './logo.svg';
import React from 'react';
import './App.css';
import Header from './components/Header'
import CHeader from './components/CHeader'
class App extends React.Component
{
  render()
  {
  return (
    <div className="App">
     <h1> Hello Pradhyum...</h1>
      <Header/>
      <CHeader/>
    </div>
  );
}
}

export default App;

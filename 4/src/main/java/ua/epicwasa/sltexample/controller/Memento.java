package ua.epicwasa.sltexample.controller;

public class Memento {

   private State state;


    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}

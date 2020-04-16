package com.company;

public class GumballMachine {
   private State noQuarterState;
   private State hasQuarterState;
   private State gumballSoldState;
   private State soldOutState;
   private State winnersState;


    State state = soldOutState;
    int count = 0;

    public GumballMachine(int count){
        noQuarterState   = new NoQuarterState(this);
        hasQuarterState  = new HasQuarterState(this);
        gumballSoldState = new SoldState(this);
        soldOutState     = new SoldOutState(this);
        winnersState     = new Winner(this);

        this.count =count;
        if (count>0){
            state = noQuarterState;
        }




    }

    public void releaseGumball(){
        if(count !=0 ){
            if (state == winnersState){
                count= count -2;
                System.out.println("Two gumballs dispensed");

            }else{

            System.out.println("One gumball dispensed");
            count --;
        }}

    }

    public State getNoQuarterState(){ return noQuarterState; }

    public State getHasQuarterState(){ return hasQuarterState; }

    public State getGumballSoldState(){
        return gumballSoldState;
    }

    public State getSoldOutState(){
        return soldOutState;
    }

    public State getWinnersState(){return winnersState;}

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }


    public void turnCrank(){
        state.turnCrank();

    }

    public void dispense(){
        state.dispense();
    }

    public void setState(State state)
    {
        this.state = state;

    }



}

package com.company;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine machine){
        this.gumballMachine = machine;

    }


    @Override
    public void insertQuarter(){
        System.out.println("Please wait to insert quarters"); }

    @Override
    public void ejectQuarter(){
        System.out.println("Sorry, already processing sale");
    }

    @Override
    public void turnCrank(){
        System.out.println("Turning twice is useless"); }

    @Override
    public void dispense() {
        gumballMachine.releaseGumball();

        if(gumballMachine.count>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());

        }else {

            System.out.println("Oops no gumballs. Stealing quarter");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }


    }


}

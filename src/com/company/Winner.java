package com.company;


public class Winner implements State {


    GumballMachine gumbalMachine;

    public Winner(GumballMachine machine){
        this.gumbalMachine = machine;

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
        gumbalMachine.releaseGumball();
        if(gumbalMachine.count>0){
            gumbalMachine.setState(gumbalMachine.getNoQuarterState());


        }else {

            System.out.println("Oops no gumballs. Stealing quarter");
            gumbalMachine.setState(gumbalMachine.getSoldOutState());
        }


    }

}

package com.company;

public class HasQuarterState implements State {

    GumballMachine gumbalMachine;

    public HasQuarterState(GumballMachine  machine){
        this.gumbalMachine = machine; }


    @Override
    public void insertQuarter(){
        System.out.println("You cannot insert a second quarter");
    }

    @Override
    public void ejectQuarter(){
        System.out.println("Quarter returned"); }


    @Override
    public void turnCrank(){
        System.out.println("Crank turned");
        gumbalMachine.setState(gumbalMachine.getGumballSoldState());

        int x = (int) (1+Math.random()*(10-1));
        if (x==2){
            gumbalMachine.setState(gumbalMachine.getWinnersState());
            System.out.println("You win two gumballs");
        }

    }




    @Override
    public void dispense(){
        System.out.println("Cannot dispense without crank");
    }

}

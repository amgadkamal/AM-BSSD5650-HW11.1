package com.company;

public class SoldOutState implements State {

    GumballMachine gumbalMachine;

    public SoldOutState(GumballMachine machine){
        this.gumbalMachine = machine;
    }

    @Override
    public void insertQuarter(){
        System.out.println("No gumballs avialable"); }


    @Override
    public void ejectQuarter(){
        System.out.println("You never entered a quarter to eject");
    }

    @Override
    public void turnCrank(){
        System.out.println("The machine is sold out of gumballs"); }

    @Override
    public void dispense(){
        System.out.println("No gumballs dispensed");
    }

}

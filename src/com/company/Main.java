package com.company;



public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.ejectQuarter();

        gumballMachine.turnCrank();


        gumballMachine.dispense();

        gumballMachine.insertQuarter();

        gumballMachine.ejectQuarter();

        gumballMachine.insertQuarter();

        gumballMachine.turnCrank();

        gumballMachine.dispense();
        gumballMachine.insertQuarter();

        gumballMachine.turnCrank();
        gumballMachine.dispense();


        gumballMachine.insertQuarter();

        gumballMachine.turnCrank();
        gumballMachine.dispense();


    }

    }


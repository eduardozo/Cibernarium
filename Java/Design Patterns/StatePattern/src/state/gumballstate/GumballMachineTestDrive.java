package state.gumballstate;

public class GumballMachineTestDrive {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.inserteQuarter();
        gumballMachine.turnCrank();
        gumballMachine.inserteQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}

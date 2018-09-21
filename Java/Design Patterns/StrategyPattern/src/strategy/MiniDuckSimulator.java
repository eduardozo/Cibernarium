package strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        ModelDuck model = new ModelDuck();

        System.out.println("--- Mallard Duck ---");
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("--- Rubber Duck ---");
        rubberDuckie.display();
        rubberDuckie.performFly();
        rubberDuckie.performQuack();

        System.out.println("--- Decoy ---");
        decoy.display();
        decoy.performFly();
        decoy.performQuack();

        System.out.println("--- Model ---");
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}

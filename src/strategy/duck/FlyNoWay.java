package strategy.duck;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        //什么都不做 不会飞
        System.out.println("I can not fly");
    }
}

package strategy.duck;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        //实现飞行鸭子
        System.out.println("I am flying!");
    }
}

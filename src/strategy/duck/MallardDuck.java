package strategy.duck;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        //外观是绿头鸭
    }
}

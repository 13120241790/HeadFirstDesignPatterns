package strategy.duck;

public class DuckApp {
    public static void main(String[] args) {
//        Duck mallardDuck = new MallardDuck();
//        mallardDuck.performFly();
//        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly(); //模型鸭原本不会飞

        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();  // 设置会飞的策略
    }
}

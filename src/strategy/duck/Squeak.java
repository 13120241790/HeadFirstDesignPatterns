package strategy.duck;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        //实现鸭子吱吱叫
        System.out.println("zhi zhi");
    }
}

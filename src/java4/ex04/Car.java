package java4.ex04;
public abstract class Car {

    public final void run(){
        statrCar();
        drive();
        stop();
        turnOff();
        }

    protected abstract void statrCar();
    protected abstract void drive();
    protected abstract void stop();
    protected abstract void turnOff();

}

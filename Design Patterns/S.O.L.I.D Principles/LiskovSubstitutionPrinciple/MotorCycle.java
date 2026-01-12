public class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        //Turn on the engine
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        //increase the speed
        speed = speed + 10;
    }
}

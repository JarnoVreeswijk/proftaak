package hardware.Sensor;

import hardware.Updatable;

import TI.Timer;

public class ExampleSensor implements Updatable {

    //This is a temp sensor

    private ExampleInterface onExample;
    private Timer timer;

    private int temp;

    public ExampleSensor(int pin, ExampleInterface onExample) {
        this.onExample = onExample;
        this.timer = new Timer(1000);
    }

    @Override
    public void update() {
        if (this.timer.timeout()) {
            //normaly you'd put the mesure method here
            this.temp = (int) (Math.random() * 100);

            this.onExample.onTempDetect(this.temp);


        }

    }
}

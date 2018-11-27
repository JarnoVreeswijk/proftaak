package aplication;

import hardware.Actuator.*;
import hardware.Updatable;
import hardware.Sensor.*;
import interfacing.*;
import hardware.Updatable;

import java.util.ArrayList;


public class R0BBART {

    private boolean running;

    //enter all Hardware classes connected:
        private Motor motor;
        private Ultrasone ultrasone;

    private ExampleInterfaceInterdaceLevel example;
    private ArrayList<Updatable> updatables;
    private CollisionDetection collisionDetection;



    public R0BBART() {
        this.running = true;
        this.updatables = new ArrayList<>();

        this.collisionDetection = new CollisionDetection();
        this.updatables.add(new Ultrasone(1,2,this.collisionDetection));
    }

    public void step() {
        for(Updatable updatable : this.updatables) {
            updatable.update();
        }
    }














    //method to terminate the entire robot

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

}

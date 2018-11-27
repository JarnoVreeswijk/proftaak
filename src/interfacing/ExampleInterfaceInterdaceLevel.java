package interfacing;

import hardware.*;

public class ExampleInterfaceInterdaceLevel implements hardware.Sensor.ExampleInterface {

    //This logic finds >20 degrees hot and <20 cold and says so
    //this is the event it detects
    @Override
    public void onTempDetect(int temp) {
        if (temp > 20) {
            System.out.println("Its hot");
        } else {
            System.out.println("Its cold");
        }
    }
}

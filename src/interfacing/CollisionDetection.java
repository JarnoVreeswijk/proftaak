package interfacing;

import hardware.Sensor.UltrasoneDetectie;

public class CollisionDetection implements UltrasoneDetectie {

    @Override
    public void unUltraSoneDetect(int distance) {
        System.out.println(distance);
    }

}

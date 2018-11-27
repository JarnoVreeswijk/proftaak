package hardware.Sensor;

import TI.BoeBot;
import TI.Timer;
import hardware.Updatable;

import java.sql.Time;

public class Ultrasone implements Updatable {

    private Timer timer;
    private Timer pulseOff;
    private UltrasoneDetectie onDetect;
    private int readPin;
    private int writePin;
    private boolean pulseTimerOn;

    public Ultrasone(int writePin, int readPin, UltrasoneDetectie onDetect) {
        this.timer = new Timer(100);
        this.pulseOff = new Timer(1);
        this.onDetect = onDetect;
        this.readPin = readPin;
        this.writePin = writePin;
        this.pulseTimerOn = false;
    }


    @Override
    public void update() {

        if (this.timer.timeout()) {

            BoeBot.digitalWrite(this.writePin, true);
            if (!this.pulseTimerOn) {
                this.pulseOff.mark();
                this.pulseTimerOn = true;
            }
            if (this.pulseOff.timeout()) {
                BoeBot.digitalWrite(this.writePin, false);

                int pulse = BoeBot.pulseIn(this.readPin, true, 10000);
                int distenceCM = pulse/58; //58 is given

                this.onDetect.unUltraSoneDetect(pulse);
                pulseTimerOn = false;
                this.timer.mark();

            }
        }
    }
}

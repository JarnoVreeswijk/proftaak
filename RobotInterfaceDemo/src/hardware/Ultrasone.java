package hardware;

import TI.Timer;

public class Ultrasone implements Updatable {

	private Timer timer;
	private UltrasoneDetectie onDetect;

	public Ultrasone(int pin, UltrasoneDetectie onDetect)
	{
		this.timer = new Timer(200);
		this.onDetect = onDetect;
	}


	public void update()
	{
		if(this.timer.timeout()) {
			//if(BoeBot.pulseIn(pin)....

			int distance = (int) (Math.random() * 1000);

			this.onDetect.onUltraSoneDetect(distance);

		}

	}

    public void testerino() {
        System.out.println("test");
    }

    public void hey(int amount) {
	    int i = 0;
	    while (i < amount) {
            System.out.println("hey");
            i++;
        }
    }

    private void test() {

    }
}

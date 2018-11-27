import TI.BoeBot;
import aplication.R0BBART;

public class Main {

    public static void main(String[] args) {
        R0BBART r0BBART = new R0BBART();

        while (r0BBART.isRunning()) {
            r0BBART.step();
            BoeBot.wait(1);
        }
        System.out.println("aplication.R0BBART has successfully been turned off, he hopes to help you another day");
    }


}

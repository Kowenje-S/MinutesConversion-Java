
package minutesconversion;
import java.util.Scanner;

public class MinutesConversion {

private static Scanner inputDevice;
    public static void main(String[] args) {
        int minutes, hours;
        float days;
        
        inputDevice = new Scanner(System.in);
        System.out.println("Please enter minutes for conversions >> ");
        minutes = inputDevice.nextInt();
        hours = minutes / 60;
        days = hours / 24.0f;
        System.out.println("\nYou have entered " + minutes + "minutes." + "\n" + minutes + "minutes is " + hours + "hour(s). \n" + minutes + "minutes is " + days + "day(s). " );
    }
    
}

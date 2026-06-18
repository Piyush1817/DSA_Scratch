// Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.

// Answers within 10-5 of the actual value will be accepted as correct.

package math;
import java.util.Scanner;

public class ClockAngle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the hour hand position:");
        int hour = sc.nextInt();

        System.out.println("Enter the minute hand position:");
        int min = sc.nextInt();

        double angle = angleClock(hour,min);
        System.out.println("The minimum angle between hour and min hand is :" + angle);


    }

    public static double angleClock(int hour, int minutes) {
        double minuteAngle = minutes * 6;

        double hourAngle = (hour % 12) * 30 + minutes * 0.5;

        double diff = Math.abs(hourAngle - minuteAngle);

        return Math.min(diff, 360 - diff); 
    }
}

/* 
Step 1: Position of the Minute Hand
Minute Angle=minutes×6;
60 mins = 360∘

Step 2: Position of the Hour Hand
  12 hr = 360
  1hr = 30 =60 min
  1min = 1/2

  Hour Angle=(hour%12)×30+minutes×0.5

  Step 3: find the difference 
  diff=∣Hour Angle−Minute Angle∣

  Step 4 : Smaller Angle 
   min(diff,360-diff);

   */

package strings ;
   
public class SlowestKey{
    public static void main (String[] args ){
        int[] releaseTimes = {9, 29, 49, 50};
        String keysPressed = "cbcd";
        char result = slowestKey(releaseTimes, keysPressed);
        System.out.println(result); // Output: 'c'
    }
   static char slowestKey(int[] releaseTimes, String keysPressed) {

    int maxDuration = releaseTimes[0];
    char slowestKey = keysPressed.charAt(0);

    for(int i = 1; i < releaseTimes.length; i++){
        int duration = releaseTimes[i] - releaseTimes[i-1];

        if(duration > maxDuration){
            maxDuration = duration;
            slowestKey = keysPressed.charAt(i);
        }
        else if(duration == maxDuration){
            // choose lexicographically larger character
            slowestKey = (char)Math.max(slowestKey, keysPressed.charAt(i));
        }
    }

    return slowestKey;
}
}
public class exercise13 {
    public static void main(String[] args) {
        int currentHours = 16;
        int currentMinutes =11;
        int currentSeconds = 42;

        if (0<=currentHours & currentHours<=24 & 0<=currentMinutes & currentMinutes<=60 & 0<=currentSeconds &currentSeconds<=60) {
            System.out.println(86400 - (currentHours * 3600) - (currentMinutes * 60) - currentSeconds);
        }
        else {
            System.out.println("Are you sure you entered the correct time in 24h form?");
        }
    }
}

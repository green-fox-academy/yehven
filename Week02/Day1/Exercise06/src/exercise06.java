// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52



public class exercise06 {
    public static void main(String[] args) {
        double a = 6*5*17;
        double b = 52*17;
        double c = 24*7*17;
        System.out.println(a);
        System.out.println( (b/c)*100 + "%");
    }
}

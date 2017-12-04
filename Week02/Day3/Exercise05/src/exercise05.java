// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.


public class exercise05 {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reversing(reversed);

    }
    public static void reversing(String input) {
        String reversed = input +  "\n";
        int l = reversed.length();
        for (int i =l-1; i >= 0; i--)
            reversed = reversed + reversed.charAt(i);

        System.out.println(reversed);

    }
}

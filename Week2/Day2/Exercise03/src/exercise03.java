//  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `am` and assign the value `kuty` to it
// - Write a function called `appendA` that gets a string as an input
//   and appends an 'a' character to its end
// - Print the result of `appendA(am)`


public class exercise03 {
    public static void main(String[] args) {
        String am = "kuty";
        am =  appendA(am);
        System.out.println(am);
    }
    public static String appendA(String input){
        input = input + "a";
        return input;
    }

}

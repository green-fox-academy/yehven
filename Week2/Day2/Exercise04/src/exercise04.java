//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter


public class exercise04 {
    public static void main(String[] args) {
        int a = 9;
        sum(a);

    }

    public static void sum(Integer input){
        int result = 0;
        for (int i = 1; i< input; i++ ){
            result = result + i;

        }
       System.out.println(result);
    }
}

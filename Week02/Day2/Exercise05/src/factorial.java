public class factorial {
    public static void main(String[] args) {

        int factor= 8;
        factorio(factor);
    }

    public static void factorio (int input) {
        int result = 1;

        if (input <= 0){
            result = 1;
        }
        else {
            for (int i = 1; i <= input; i++){
                result = result *i;
            }

        }

        System.out.println(result);

    }
}

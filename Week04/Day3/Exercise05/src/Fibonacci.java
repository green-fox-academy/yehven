public class Fibonacci {
    int index;

    public Fibonacci(){

    }

    public int fibonacci (int index){
        if ( index <= 1 ){
            return index;
        }
        else {
            return fibonacci ( index - 1 ) + fibonacci( index -2 );
        }
    }
}

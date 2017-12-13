import java.util.ArrayList;

public class Sum {
    ArrayList<Integer> array = new ArrayList<>();

    public Sum (){

    }

    public Sum (ArrayList<Integer> array){
        this.array = array;
    }

    public int sum (ArrayList array){
        int result = 0;
        for (int i = 0; i < array.size(); i++){
            result += (int)array.get(i);
        }
        return result;
    }
}

public class Counter {
    int count;
    int originalValue;

    public Counter(){
        this.count = 0;
    }
    public Counter(int count) {
        this.count = count;
        this.originalValue = count;
    }

    public void add (int addnumber){
        this.count += addnumber;
    }

    public void add(){
        count += 1;
    }

    public int get (){
        return count;
    }
    public void reset (){
        count = originalValue;
    }
}

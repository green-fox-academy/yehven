/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing>{
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing compareThing) {
        if (this.getCompleted() && !compareThing.getCompleted()) {
            return -1;
        } else if (!this.getCompleted() && compareThing.getCompleted()){
            return 1;
        } else {
            return this.name.compareTo(compareThing.name);
        }
    }
}
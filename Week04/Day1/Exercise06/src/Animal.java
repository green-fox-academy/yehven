public class Animal {
    int hunger;
    int thirst;


    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat (){
        this.hunger -=1;
    }

    public void drink (){
        this.thirst -=1;
    }
    public void play (){
        this.thirst +=1;
        this.hunger +=1;
    }

    @Override
    public String toString() {
        return "hunger: " + hunger + "\n" + "thirst: " + thirst;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        System.out.println(dog);
        dog.eat();
        System.out.println(dog);
        dog.play();
        System.out.println(dog);
        dog.drink();
        System.out.println(dog);
    }
}

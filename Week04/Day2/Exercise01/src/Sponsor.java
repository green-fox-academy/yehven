public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;

    }

    public Sponsor () {
        super ("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    }


    public void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public void introduce (){

        System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire(){
        hiredStudents++;
    }
}

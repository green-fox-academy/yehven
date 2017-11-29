import java.util.Scanner;
public class exercise21 {
    public static void main(String[] args) {
        System.out.println("How many girls comes to the party? ");
        Scanner scanner = new Scanner(System.in);
        int girls = scanner.nextInt();
        System.out.println("And how many boys come to the party? ");
        int boys = scanner.nextInt();

        if (boys==girls && boys+girls>20){
            System.out.println("The party is excellent!");
        }

        if (boys+girls>20 & boys>girls || girls>boys){
            System.out.println("Quite cool party!");
        }

        if (boys+girls<20){
            System.out.println("Avarge party...");
        }

        if (girls<=0){
            System.out.println("Sausage party!");
        }


    }
}

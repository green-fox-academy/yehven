// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class exercise12 {
    public static void main(String[] args) {
        double a = 6.88;
        double b = 11.32;
        double c = 7.55;
        System.out.println("Surface Area: " + (2*(a*b+b*c+a*c)));
        System.out.println("Volume: " + a*b*c);

    }
}

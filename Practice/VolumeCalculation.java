package Practice;

/**
 * A cylindrical vessel has a radius of 7 cm and a height of 8 cm.
 * Write a program that calcu- lates the volume of this vessel using the following formula:
 * volume of cylinder = 3.14 * (radius)2 * height
 */
public class VolumeCalculation {
    public static void main(String[] args) {
    int  radius = 7;
    int  height = 8;
    double volume = 3.14 * (radius  * radius) * height;
        System.out.println("The volume of cylinder: " + volume);
    }
}

package Practice;

/**
 *A soft drink company recently surveyed 12,467 of its customers and
 * found that approxi- mately 14 percent of those surveyed purchase one
 * or more energy drinks per week. Of those customers who purchase energy drinks,
 *  approximately 64 percent of them prefer citrus-flavored energy drinks.
 *  Write a program that displays the following:
 * The approximate number of customers in the
 * survey who purchase one or more energy drinks per week
 * The approximate number of customers in the survey who
 * prefer citrus-flavored energy drinks
 */
public class EnergyDrinkConsumption {
    public static void main(String[] args) {
    double surveyed = 12467;
    double purchased = (surveyed * 14) / 100;
    double flavored = (surveyed * 64) /100;
        System.out.println("The customers who purchased one or more energy drinks per week are: \n" + purchased);
        System.out.println("The customers who preferred citrus-flavored energy drinks are: \n" + flavored);
        System.out.println("The reminding Customers are: \n" + (surveyed - purchased - flavored));
    }
}

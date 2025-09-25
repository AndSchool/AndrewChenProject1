import java.util.Scanner;  // must import this class b/c it isn't "built in" like String and System




public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);  // create a Scanner "object"


        System.out.print("Please enter your total bill:");
        double bill = scan.nextDouble(); // call nextLine() method on scanner object to get text
        System.out.print("Please enter the amount of people:");
        int ppl = scan.nextInt(); // call nextLine() method on scanner object to get text
        System.out.print("Thank you for agreeing to tip! What percentage (as a whole number) would you like to tip?");
        int userinput = scan.nextInt(); // call nextLine() method on scanner object to get text
        double tip = userinput/100.00;

        System.out.println("The bill total entered is "+bill+ " for "+ppl +" people.");
        double x = 100*(bill*(1+tip));
        double y = ((int)(x+.5))/100.00;
        double realY = ((x+.5))/100.00;
        System.out.println("With the tip, the final bill is " +y);
        System.out.println("The total tip amount is " +(int)((((realY-bill))*100)+.5)/100.00 + " and tip per person as "+(int)((100*((realY-bill)/ppl))+.5)/100.00);
        System.out.println("The total per person is " +(((int)(100*(realY)+.5)/ppl)/100.00));

        scan.close();  // do this when you are done with the scanner
    }
}
import java.util.Scanner;  // must import this class b/c it isn't "built in" like String and System




public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);  // create a Scanner "object"

        System.out.println("--------------------------------------------------");
        System.out.println("| Note! do not use any symbols when inputting data! (no $ or %) |");
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.print("Please enter your total bill($):");
        double bill = scan.nextDouble(); // call nextLine() method on scanner object to get text
        System.out.print("Please enter the amount of people:");
        int ppl = scan.nextInt(); // call nextLine() method on scanner object to get text
        System.out.print("Thank you for agreeing to tip! What percentage (as a whole number) would you like to tip?");
        int userinput = scan.nextInt(); // call nextLine() method on scanner object to get text
        double tip = userinput/100.00;
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("The bill total entered is $"+bill+ " for "+ppl +" people.");
        System.out.println("--------------------------------------------------");
        double x = 100*(bill*(1+tip));
        double y = ((int)(x+.5))/100.00;
        double realY = ((x+.5))/100.00;
        //these vars x and y are used to calculate the total bill via x and then round it in y
        //the reason why there is y and realY is because y is for displaying the clean 2 decimal point final bill while realY maintains the actual bill to be used for more precise calculations
        System.out.println("With the tip, the final bill is $" +y);
        System.out.println("--------------------------------------------------");
        System.out.println("The total tip amount is $" + String.format("%.2f",((realY-bill)))+ " and the tip per person is $"+String.format("%.2f",((realY-bill)/ppl)));
        //string.format is used to force a values to round to the second decimal place; the total tip is derived by subtracting the total bill with the bill before tax. the tip per person is taken by using this newly calculated value and dividing it by the number of people
        System.out.println("--------------------------------------------------");
        System.out.println("The total bill per person is $" +String.format("%.2f",((realY)/ppl)));
        //the total bill per person is just the total bill divided by the number of people
        System.out.println("--------------------------------------------------");
        scan.close();  // do this when you are done with the scanner
    }
}
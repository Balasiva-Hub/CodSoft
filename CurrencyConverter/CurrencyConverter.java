import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CurrencyConverter
{

    public static void main(String args[])
    {
        Scanner converter = new Scanner(System.in);

        System.out.println("     -----------------------------     ");
        System.out.println("     Welcome to Currency Converter     ");
        System.out.println("     -----------------------------     ");
        System.out.println("\n***Please Select Your Option***");
        System.out.println("\n1.USD to Rupee");
        System.out.println("\n2.Rupee to USD");
        System.out.println("\n3.Dirham to Rupee");
        System.out.println("\n4.Rupee to Dirham");
        System.out.print("\nEnter your choice (1 or 2 or 3 or 4): ");
        int choice = converter.nextInt();

        if (choice == 1)
        {
            System.out.println("\nEnter the amount in USD: ");
            double USD = converter.nextDouble();
            double Rupee = usdToRupee(USD);
            System.out.println("\nConverted amount in Rupee: "+ Rupee);
        }
        else if (choice ==2)
        {
            System.out.println("\nEnter the amount in Rupee: ");
            double Rupee = converter.nextDouble();
            double USD = RupeeTousd(Rupee);
            System.out.println("\nConverted amount in USD: "+ USD);
        }
        else if (choice ==3)
        {
            System.out.println("\nEnter the amount in DIRHAM: ");
            double DIRHAM = converter.nextDouble();
            double Rupee = dirhamToRupee(DIRHAM);
            System.out.println("\nConverted amount in Rupee: "+ Rupee);
        }
        else if (choice ==4)
        {
            System.out.println("\nEnter the amount in Rupee: ");
            double Rupee = converter.nextDouble();
            double DIRHAM = RupeeTodirham(Rupee);
            System.out.println("\nConverted amount in DIHRAM: "+ DIRHAM);
        }
        else
        {
            System.out.println("\nInvalid choice.Please select 1 or 2 or 3 or 4.");
        }
        converter.close();
        
    }
    public static double usdToRupee(double USD)
    {
        return USD * 84.56;
    }
    public static double RupeeTousd(double Rupee)
    {
        return Rupee * 0.012;
    }
    public static double dirhamToRupee(double DIRHAM)
    {
        return DIRHAM * 23.02;
    }
    public static double RupeeTodirham(double Rupee)
    {
        return Rupee * 0.043;
    }

}
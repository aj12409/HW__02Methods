import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number is out of range [" + low + " - " + high + "]: " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number is out of range [" + low + " - " + high + "]: " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number, not: " + trash);
            }
        } while (!done);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";
        boolean retVal = false;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes"))
            {
                retVal = true;
                done = true;
            }
            else if (response.equalsIgnoreCase("N") || response.equalsIgnoreCase("No"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter Y/Yes or N/No, not: " + response);
            }
        } while (!done);

        return retVal;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String response = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("\n" + response + " must match the pattern " + regEx);
            }
        } while (!done);

        return response;
    }
}

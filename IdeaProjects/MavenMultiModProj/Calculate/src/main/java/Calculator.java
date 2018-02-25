import java.util.Scanner;
public class Calculator
{

    private static  Dividing divide1 = new Dividing();
    private static  MainMenu menu1 = new MainMenu();
    private static Multiplying multiply1 = new Multiplying();
    private static Adding add1 = new Adding();
    private static Subtracting subtract1 = new Subtracting();

   public static Scanner input = new Scanner(System.in);





    public static void main(String[]args)
    {
        int choice;
        int a;
        int b;
        do
        {
            menu1.menu();
            choice =input.nextInt();

            switch(choice)
            {
                case 1:System.out.print("Enter two numbers to add separated by a space: ");
                        a = input.nextInt(); b = input.nextInt();
                        System.out.println(a +" + "+ b +" = "+ add1.add(a,b));
                        break;
                case 2:System.out.print("Enter two numbers to subtract separated by a space: ");
                    a = input.nextInt(); b = input.nextInt();
                    System.out.println(a +" - "+ b +" = "+ subtract1.subtract(a,b));
                    break;
                case 3:System.out.print("Enter two numbers to divide separated by a space: ");
                    a = input.nextInt(); b = input.nextInt();
                    System.out.println(a +" / "+ b +" = "+ divide1.divide(a,b));
                    break;
                case 4:System.out.print("Enter two numbers to Multiply separated by a space: ");
                    a = input.nextInt(); b = input.nextInt();
                    System.out.println(a +" * "+ b +" = "+ multiply1.multiply(a,b));
                    break;
                default: choice = 0;

            }

        }while(choice == 0);

    }
}

import java.util.Scanner;

public class ExceptionTimeout
{

    private String name;
    private String surname;
    private Scanner input = new Scanner(System.in);

    public void setName()
    {
        System.out.print("Please enter a name: ");
        this.name = input.nextLine();


    }

    public void setSurname()
    {
        System.out.print("Please enter a  surname:");
        this.surname = input.nextLine();
    }

    public String capitalize(String value)
    {
        String name;
        name =  Character.toUpperCase(value.charAt(0)) + value.substring(1);
        return name;
    }

    public String concat()
    {
        return  this.name + " " + this.surname;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

}

import java.util.Scanner;

public class Truth
{
    private String name;
    private String surname;

//    private Scanner input = new Scanner(System.in);


/*    public void setName()
    {
        System.out.print("Please enter a name: ");
        this.name = input.nextLine();
        System.out.println();

    }

    public void setSurname()
    {
        System.out.print("Please enter a  surname:");
        this.name = input.nextLine();
    } */

    public Truth(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

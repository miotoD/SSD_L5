/**
 *
 * @author Aayush Manandhar
 */
class InvalidOptionException extends Exception{

    InvalidOptionException(String message)
    {
        super(message);
    }
}

public class Menu {
    void displayOptionMenu(int i) throws InvalidOptionException{
        if(i == 1){
            System.out.println("Menu no.1");
        } else if (i ==2) {
            System.out.println("Menu no.2");

        } else if (i ==3) {
            System.out.println("Menu no.3");

        }
        else {
            throw new InvalidOptionException("Invalid Option");
        }

    }

    public static void main(String[] args) {
        Menu m = new Menu();
        try {
            m.displayOptionMenu(1);
            m.displayOptionMenu(2);
            m.displayOptionMenu(5);
        }
        catch (InvalidOptionException e)
        {
            System.out.println("invalid option selected");
        }
    }
}

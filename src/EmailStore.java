import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * @author Aayush Manandhar
 */

public class EmailStore {
    Set<String> emailAddresses = new HashSet<>();

    //A boolean function that takes a String parameter and  adds it to the list
    public boolean addEmail(String email) {
      boolean isAdded = emailAddresses.add(email);
        System.out.println(isAdded);
        return isAdded;
    }

    //A boolean function that takes a String parameter  and checks if the string is present or not in existing set
    public boolean hasEmail(String email){
        return emailAddresses.contains(email);
    }

    //A function to display the emails.
    public void displayEmails(){
        for (String mails:emailAddresses) {
            System.out.println(mails);
        }
    }
}


class test
{
    public static void main(String[] args) {
        EmailStore store = new EmailStore();
        store.addEmail("yo69@gmail.com");
        store.addEmail("uo70@gmail.com");
        store.addEmail("yo69@gmail.com");
        store.displayEmails();
        System.out.println( store.hasEmail("yo69@gmail.com"));

    }
}

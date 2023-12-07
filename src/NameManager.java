import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Aayush Manandhar
 */
public class NameManager {
List<String> names = new ArrayList<>();


//method with a String parameter to add String type of values to the arraylist
public void addname(String name)
{
    names.add(name);
}

//a method to print the values inside arraylist
public void printNames()
{
    for (String n: names) {
        System.out.println(n);
    }
}

//method to delete names or string greater than length of 15
public void removeLongNames()
{
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
        String name = iterator.next();

        if (name.length() > 15) {
            iterator.remove();
        }
    }
}
    public static void main(String[] args) {
        NameManager nameManager = new NameManager();
        nameManager.addname("Genji");
        nameManager.addname("Rika");
        nameManager.addname("Yuta");
        nameManager.addname("jshddfhhdfjhdgfhj");

        nameManager.removeLongNames();
        nameManager.printNames();
    }
}

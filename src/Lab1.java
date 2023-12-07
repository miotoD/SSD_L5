//Lab1
abstract class Shape{

    protected int sides;

    public int getSides()
    {
        return sides;
    }
    public void setSides(int sides)
    {
        this.sides = sides;
    }

    /* private int sides

    sides - getter,setter

    getArea()
    * */
    abstract public int getArea();

}

class Rectangle extends Shape{

    int breadth;
    int length;


    public void setLength(int length) {
        this.length = length;
    }

    public int getLength()
    {
        return length;
    }

    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    @Override
    public int getArea() {
        return length*breadth;
    }
}


public class Lab1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setBreadth(3);
        rectangle.setLength(9);
        System.out.println(rectangle.getArea());
    }
}
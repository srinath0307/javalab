public class Rectangle extends Shape
{
    public Rectangle(int x,int y)
    {
        super(x,y);
    }
    public void printArea()
    {
        System.out.println(getX()*getY());
    }
}

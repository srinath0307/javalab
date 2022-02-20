public class Circle extends Shape{ 
public Circle(int x,int y)
{
    super(x,y);
}
public void printArea()
{
    double k=(22/7.0)*getX()*getY();
    System.out.format("%.2f \n",k);
}
}

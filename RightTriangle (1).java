public class RightTriangle extends Shape
{
    public RightTriangle(int x,int y)
    {
        super(x,y);
    }
    public void printArea()
    {
        double z=0.5*getX()*getY();
        System.out.format("%.2f \n",z);
    }
}

abstract class Shape {
    //For rectangle x is length and y is breadth
    //For right angled triangle x is base and y is height
    //For circle both x and y denotes radius
    int x;
    int y;
    
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract void printArea();


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

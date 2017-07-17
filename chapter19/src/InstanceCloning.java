/**
 * Created by kmj on 17. 7. 17.
 */
//ShallowCopy
    /*
class Point implements Cloneable
{
    private int xPos;
    private int yPos;

    public Point(int x, int y)
    {
        xPos=x;
        yPos=y;
    }
    public void showPosition()
    {
        System.out.printf("[%d, %d]", xPos, yPos);
        System.out.println("");

    }

    public void changePos(int x, int y)
    {
        xPos=x;
        yPos=y;
    }

    public Object clone() throws CloneNotSupportedException // protected->public
    {
        return super.clone();
    }
}


class Rectangle implements Cloneable
{
    Point upperLeft, lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2)
    {
        upperLeft=new Point(x1, y1);
        lowerRight=new Point(x2, y2);
    }

    public void showPosition()
    {
        System.out.println("the information of location....");
        System.out.print("UpperLeft: ");
        upperLeft.showPosition();
        System.out.println("");
        System.out.print("LowerRight: ");
        lowerRight.showPosition();
        System.out.println("\n");
    }

    public void changePos(int x1, int y1, int x2, int y2)
    {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }
    public Object clone() throws CloneNotSupportedException // protected->public
    {
        return super.clone();
    }

}
public class InstanceCloning {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;

        try {
            cpy = (Rectangle) org.clone();
            org.changePos(2, 2, 7, 7);
            org.showPosition();
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}*/


class Point implements Cloneable
{
    private int xPos;
    private int yPos;

    public Point(int x, int y)
    {
        xPos=x;
        yPos=y;
    }
    public void showPosition()
    {
        System.out.printf("[%d, %d]", xPos, yPos);
        System.out.println("");

    }

    public void changePos(int x, int y)
    {
        xPos=x;
        yPos=y;
    }

    public Object clone() throws CloneNotSupportedException // protected->public
    {
        return super.clone();
    }
}


class Rectangle implements Cloneable
{
    Point upperLeft, lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2)
    {
        upperLeft=new Point(x1, y1);
        lowerRight=new Point(x2, y2);
    }

    public void showPosition()
    {
        System.out.println("the information of location....");
        System.out.print("UpperLeft: ");
        upperLeft.showPosition();
        System.out.println("");
        System.out.print("LowerRight: ");
        lowerRight.showPosition();
        System.out.println("\n");
    }

    public void changePos(int x1, int y1, int x2, int y2)
    {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }
    public Object clone() throws CloneNotSupportedException // protected->public
    {
        Rectangle copy=(Rectangle)super.clone();
        copy.upperLeft=(Point)super.clone();
        copy.lowerRight=(Point)super.clone();
        return copy;
    }

}

public class InstanceCloning {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;

        try {
            cpy = (Rectangle) org.clone();
            org.changePos(2, 2, 7, 7);
            org.showPosition();
            cpy.showPosition();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


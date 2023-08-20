// Demo of Classes and Objects
package classesandobjectproject;
import java.util.*;

class Rectangle{
    private int len, brd;

    public void getData()
    {
        Scanner scn;
        scn = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        len = scn.nextInt();
        brd = scn.nextInt();
    }

    public void setData(int l, int b)
    {
        len = l;
        brd = b;
    }
    public void displayData()
    {
        System.out.println("Length = "+len);
        System.out.println("Breadth = "+brd);
    }

    public void areaPeri()
    {
        int a, p;
        a = len * brd;
        p = 2 * (len + brd);
        System.out.println("area = "+a);
        System.out.println("Perimeter = "+p);
    }
}

public class ClassesAndObjectProject {
    public static void main(String[] args) {
        Rectangle r1, r2, r3; //Define three References

        r1 = new Rectangle();
        r2 = new Rectangle();
        r3 = new Rectangle();

        r1.setData(10, 20); //Set data in elements of object
        r1.displayData();        //display the data set by setData()
        r1.areaPeri();           //Calculate and print area and perimeter

        r2.setData(5, 8); //Set data in elements of object
        r2.displayData();        //display the data set by setData()
        r2.areaPeri();           //Calculate and print area and perimeter

        r3.getData(); //Receive data from keyboard
        r3.displayData();
        r3.areaPeri();
    }
}
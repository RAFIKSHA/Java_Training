import java.io.*;
import java.lang.ClassNotFoundException;
import java.util.Scanner;
import java.lang.*;
 class rectangle
{    
    int l;
    int b;
    int ar;
    
    void getdata(int lt,int bt)
    {
        l=lt;
        b=bt;
       
    
    }
    void calculate()
    {    int ar=l*b;
        System.out.println("area of rectangle"+ar);
    
    }
}
public class area
{
    public static void main(String[] args) throws IOException
    {
        Scanner obj=new Scanner(System.in);
        int lt=obj.nextInt();
        int bt=obj.nextInt();
        System.out.println(lt+"and"+bt);
        
        rectangle r=new rectangle();
        
  
        r.getdata(5,2);
        r.calculate();

    }
}
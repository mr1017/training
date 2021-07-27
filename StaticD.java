package com.encap;

public class StaticD {
	 static int x=100;
     int y;
     void display()
     {
         System.out.println(x);
         x++;
     }
     static void Disp()
     {
         int d=100;
         x=900;
        // y=200;
     }
    
public static void main(String[] args)
{
         StaticD s1=new StaticD();
         StaticD s2=new StaticD();
         StaticD s3=new StaticD();
        
         s1.display();
         s2.display();
         s3.display();
        
         StaticD.Disp();
        
         System.out.println(StaticD.x);
        
}
}

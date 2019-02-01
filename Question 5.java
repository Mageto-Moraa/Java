public class MyClass {
    public static void main(String args[]) {
        int Max,Min;
        int x=25;
        int y=5;
        int z=x+y;
        int v=x*y; 
        int u=x-y;
        double w=0.5*z;
    if(x>y)
        {
            Max = x;
        }
        else
        {
            Max = y;
        }
        
       
        if(x<y)
        {
            Min = x;
        }
        else
        {
            Min = y;
        }


        System.out.println("Sum of x+y = " + z);
       System.out.println("Product of x and y = " + v); 
       System.out.println("Subtracting y from x = " + u); 
        System.out.println("Average of x and y = " +w);
        System.out.println("Distance of x and y = " + u);
  
		
        System.out.print("Max integer " +Max);
        
        
        System.out.print("Min integer " +Min);
        
    }
}

    
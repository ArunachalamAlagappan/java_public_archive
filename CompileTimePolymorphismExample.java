class Overload
{
    void display (int a)
    {
       System.out.println ("a: " + a);
    }
    void display (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double display(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}

public class CompileTimePolymorphismExample {
     public static void main(String[] args) {
    	 Overload Obj = new Overload();
         double result;
         Obj .display(10);
         Obj .display(10, 20);
         result = Obj .display(5.5);
         System.out.println("O/P : " + result);
	}
}

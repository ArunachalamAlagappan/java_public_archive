class Square{
	public void display(){
		System.out.println("Square");
	}
}

class Rectangle extends Square{
    public void display(){
    	System.out.println("Rectangle");
	}
}
public class RuntimePolymorphism {
    public void display(){
    	System.out.println("In Public class");
	}
     public static void main(String[] args) {
    	 Square obj = new Rectangle();
    	 
	}
}

class MyBase {
  private int x;
  
  public MyBase(){
	  
  }
  public MyBase(int x) {
    this.x = x;
  }
  public int getX() {
    return x;
  }
  public void show() {
    System.out.println("x=" + x);
  }
}

//single
class MyDerived extends MyBase {
  private int y;
  public MyDerived(){
	  
  }
  public MyDerived(int x) {
    super(x);
  } 
  public MyDerived(int x, int y) {
    super(x);
    this.y = y;
  }
  public int getY() {
    return y;
  } 
  public void show() {
    System.out.println("x = " + getX());
    System.out.println("y = " + y);
  }
}

//multilevel
class SuperParent extends MyDerived {
	 public SuperParent(){
		 
	 }
	 public void show() {
		  System.out.println("In Super Parent");
		  }
}

//Hierarchial
class HierarchialExample extends MyBase {
	 public HierarchialExample(){
		 
	 }
	 public void show() {
		  System.out.println("In HierarchialExample ");
		  }
}
public class InheritanceExample {
      public static void main(String[] args) {
    	  MyBase b = new MyBase(2);
    	    b.show();
    	    MyDerived d = new MyDerived(3, 4);
    	    d.show();
	 }
}

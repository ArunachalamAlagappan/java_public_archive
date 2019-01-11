interface Color {
    void addColor();
}

class RedColor implements Color {
   public void addColor() {
     System.out.println("Red Color");
   }
}

class YellowColor implements Color {
	   public void addColor() {
	     System.out.println("Yellow Color");
	   }
	}


class BlueColor implements Color {
	   public void addColor() {
	     System.out.println("Blue Color");
	   }
	}


class ColorFactory {
 
   public Color getColor(String Color){
      if(Color == null){
         return null;
      } 
      if(Color.equalsIgnoreCase("RED")){
         return new RedColor();
         
      } else if(Color.equalsIgnoreCase("YELLOW")){
         return new YellowColor();
         
      } else if(Color.equalsIgnoreCase("BLUE")){
         return new BlueColor();
      }     
      return null;
 
   }
}

public class AbstractAndEncapsulationExample {
public static void main(String[] args) {
	 ColorFactory colorFactory = new ColorFactory ();
	 Color redColor = colorFactory.getColor("RED");
	 redColor.addColor();
     Color yellowColor = colorFactory.getColor("YELLOW");
     yellowColor.addColor();
     Color blueColor = colorFactory.getColor("BLUE");
     blueColor.addColor();
}
}

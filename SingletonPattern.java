package Pattern;

public class SingletonPattern {
	   public static void main(String[] args) {

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();
	      //show the message
	      object.showMessage();  
	   }
	}

 class SingleObject {
	   //create an object of SingleObject
	   private static SingleObject instance = new SingleObject();

	   //private constructor
	   private SingleObject(){}

	   //Get the object 
	   public static SingleObject getInstance(){
	      return instance;
	   }
	   public void showMessage(){
	      System.out.println("Hello Welcome to patterns!");
	   }
	}

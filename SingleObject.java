
public class SingleObject {

   //create an object of SingleObject
   private static SingleObject insta = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
      return insta;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
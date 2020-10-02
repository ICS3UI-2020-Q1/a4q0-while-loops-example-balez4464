/**
 *This is an example for while loops
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Beginning to count!");
    //create a counter variable
    int count = 1;
    //use a loop to count to five
    while(count <= 5){
      //print number we are on
      System.out.println(count);
      //adds number
      count = count + 1;
    }
    System.out.println("That's all for now");

    int count2 = 1;

    do{
      System.out.println(count2);
      count2 = count2 + 1;
    }while(count2 <= 5);




  }
}

public class ComputeArea{
  public static void main(String[]args){
    // The two lines following this comment type cast the variables.
    double  pi, radius, areaCircle, radiusSquared;
    int storageLocationA, storageLocationB;
    // pi is a mathematical constant and should be renamed as such to avoid confusion
    pi = 3.14159;
    //radius is a set given constant.
    radius = 6.7;
    //radiusSquared squares the radius for use in the Circle Area Formula.
    radiusSquared = radius * radius;
    //areaCircle is the formula used to calculate the area of a cirlce.
    areaCircle = pi * radiusSquared;
    //Displays in text "This area is" and then adds the value from the above statement.
    System.out.println("This area is: "+ areaCircle);
    //The values in storageLocationA represent (1024)^3.
    storageLocationA = 1024 * 1024 * 1024;
    //Displays the calculation performed in storageLocationA.
    System.out.println("The value in storageLocationA is: " + storageLocationA);
    //Multiplies the value stored in storageLocationA by 2.
    storageLocationB = storageLocationA * 2;
    //This should display a positive integer but instead displays a negative one.
    System.out.println("The value in storageLocationB is: " + storageLocationB);
    //Should multiply further by a factor of 2.
    storageLocationB = storageLocationB * 2;
    //Should display a positive number 4 times as large as the value 1073741824
    System.out.println("Now the value in storageLocationB is: " + storageLocationB);
    
  }
}
    
    
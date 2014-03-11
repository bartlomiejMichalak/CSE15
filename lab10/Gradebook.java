public class Gradebook{
  public static void main(String[] args){
    double [][] gradebook = new double [4][3];
    double [] studentAverage = new double[gradebook.length];
    double [] quizAverage = new double[gradebook[0].length];
    String [] names = {"Mary","Bob","Mike","Tara"};
    double sum = 0;
    
    gradebook[0][0] = 95;  //starting grades for student 1
    gradebook[0][1] = 80;
    gradebook[0][2] = 50;
    gradebook[1][0] = 75;  //starting grades for student 2
    gradebook[1][1] = 100;
    gradebook[1][2] = 65;
    gradebook[2][0] = 80;  // starting grades for student 3
    gradebook[2][1] = 35;
    gradebook[2][2] = 89;
    gradebook[3][0] = 100; //starting grades for student 4 quiz 1
    gradebook[3][1] = 90;  // grades for student 4 quiz 2
    gradebook[3][2] = 70;  // grades for student 4 quiz 3
    
    for(int student = 0; student < gradebook.length; student++){
      for(int quiz = 0; quiz < gradebook[student].length; quiz++)
        sum = sum + gradebook[student][quiz];
      studentAverage[student] = sum / gradebook[student].length;
      sum = 0;
    }
    System.out.println("Name \t\tQuiz 1 \t\t\t Quiz 2 \t\t\t Quiz 3 \t\t\t Average"); 
    for(int student = 0; student < gradebook.length; student++){
      System.out.print(names[student] + "\t\t"); 
      for(int quiz = 0; quiz < gradebook[student].length; quiz++)
        System.out.printf("%3.2f\t\t\t",gradebook[student][quiz]);
      System.out.printf("%3.2f\n", studentAverage[student]);}    
  System.out.println("Average\t\t87.5\t\t\t76.25\t\t\t68.5");
  
  }
}
    
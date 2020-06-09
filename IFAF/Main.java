import java.util.Scanner;
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier

//Main class to control all other classes

  

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  String name=sc.nextLine();
  String teamname=sc.nextLine();
  int noofmatch=sc.nextInt();
  long total=sc.nextInt();
    if ((noofmatch!=0)&&(total!=0)){
 System.out.println("Player Details");
   System.out.println("Player name: "+name);
   System.out.println("Team name: "+teamname);
   System.out.println("No of matches: "+noofmatch);
   System.out.println("Total goals: "+total);
    }
    else
    {
      System.out.println("Invalid Input");
    }
      
    
  }
}

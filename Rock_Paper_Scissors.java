import java.util.Scanner;

public class Rock_Paper_Scissors{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float number = (float)(Math.round((float)(Math.random())*10.0)/10.0); // generating a random float number between 0 to 1

    // System.out.println(number);

    System.out.print("Enter Player Move: ");
    String playerChoice = sc.next();

    String computerChoice = " ";

    System.out.println();

    if (number >= 0  && number <= .3){
      computerChoice = "Rock";
      if (playerChoice.equals("Rock")){
        System.out.println("It's a tie!\n");
      } else if (playerChoice.equals("Paper")){
        System.out.println("You Win!!\n");
      } else if (playerChoice.equals("Scissors")){
        System.out.println("You Lose!!\n");
      } else {
        System.out.println("Invalid Input! Please enter either 'Rock', 'Paper', or 'Scissors'. \n");
      }
    } else if (number > .3 && number <= .6){
      computerChoice = "Paper";
      if (playerChoice.equals("Rock")){
        System.out.println("You Lose!!\n");
      } else if (playerChoice.equals("Paper")){
        System.out.println("It's a tie!\n");
      } else if (playerChoice.equals("Scissors")){
        System.out.println("You Win!!\n");
      } else {
        System.out.println("Invalid Input! Please enter either 'Rock', 'Paper', or 'Scissors'. \n");
      }
    } else if (number > .6 && number <= 1){
      computerChoice = "Scissors";
      if (playerChoice.equals("Rock")){
        System.out.println("You Win!!\n");
      } else if (playerChoice.equals("Paper")){
        System.out.println("You Lose!!\n");
      } else if (playerChoice.equals("Scissors")){
        System.out.println("It's a tie!\n");
      } else {
        System.out.println("Invalid Input! Please enter either 'Rock', 'Paper', or 'Scissors'. \n");
      }
    }
    
    System.out.println("Your Move: " + playerChoice);
    System.out.println("Computer Move: " + computerChoice);
    sc.close();
  }
}
import java.util.Random;

public class RockPaperScissor{
    
    public void play(){
        Scanner input = new Scanner(System.in);
        
        //Input Player
        
        System.out.println("Let's Play Rock Paper Scissor");
        System.out.print("Choose for Rock, Paper or Scissor: ");
        String playerChoice = input.next();
        System.out.println("You choose " + playerChoice);
        input.close();
        
        //Input Random Number for Computer
        
        Random random = new Random();
        int computerNum = random.nextInt(3) + 1;
        String computerChoice;
        if (computerNum == 1) {
            computerChoice = "Rock";
        } else if (computerNum == 2) {
            computerChoice = "Paper";
        } else {
            computerChoice = "Scissor";
        }
        System.out.println("Computer choose " + computerChoice);
        
        //if, else if, else
        
        if(computerChoice.equalsIgnoreCase(playerChoice)){                      
            System.out.println("Draw");
        }else if(playerChoice.equalsIgnoreCase("Rock")){
            if(computerChoice.equalsIgnoreCase("Paper")){
                System.out.println("Computer Win!, You Lose!");
            }else if(computerChoice.equalsIgnoreCase("Scissor")){
                System.out.println("You Win!");
            }
        }else if(playerChoice.equalsIgnoreCase("Paper")){
            if(computerChoice.equalsIgnoreCase("Rock")){
                System.out.println("You Win!");
            }else if(computerChoice.equalsIgnoreCase("Scissor")){
                System.out.println("Computer Win!, You Lose!");
            }
        }else if(playerChoice.equalsIgnoreCase("Paper")){
            if(computerChoice.equalsIgnoreCase("Rock")){
                System.out.println("Computer Win!, You Lose!");
            }else if(computerChoice.equalsIgnoreCase("Paper")){
                System.out.println("You Win!");
            }
        }else{
            if(!playerChoice.equalsIgnoreCase("Rock")||!playerChoice.equalsIgnoreCase("Paper")||!playerChoice.equalsIgnoreCase("Scissor")){
                System.out.println("You choose the wrong option, Try again!");
            }
        }
    }
        
    
}
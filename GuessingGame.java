import java.util.*;
public class GuessingGame{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        Random r=new Random();
        int number=r.nextInt(101);
        System.out.println("Welcome to the Number Guessing Game!\nI'm thinking of a number between 1 and 100.\nYou have 5 chances to guess the correct number.");
        System.out.println("Please select the difficulty level:\n1. Easy (10 chances)\n2. Medium (5 chances)\n3. Hard (3 chances)");
        
        System.out.print("Enter your choice: ");
        int choice=obj.nextInt();

        switch(choice){
            case 1:
                System.out.println("Great! You have selected the Easy difficulty level.\nLet's start the game!");          
                break;
            case 2:
                System.out.println("Great! You have selected the Medium difficulty level.\nLet's start the game!");
                break;
            case 3:
                System.out.println("Great! You have selected the Hard difficulty level.\nLet's start the game!");            
                break;
            default:
                System.out.print("Invalid input");
                return;
        }
        
        int attempts=1;
        while(true){
            System.out.print("Enter your guess: ");
            int guess=obj.nextInt();
            if(choice==1){
                if(attempts<=10){
                if(guess>number){
                    System.out.println("Incorrect! The number is greater than "+guess);
                    attempts++;
                }
                else if(guess<number){
                    System.out.println("Incorrect! The number is less than "+guess);
                    attempts++;
                }
                else{
                    System.out.println("Congratulations! You guessed the number correctly in "+attempts+" attempts");
                    return;
                }
            }
            else{
                System.out.print("CHANCES OVER!!");
                return;
            }
            }
            if(choice==2){
                if(attempts<=5){
                    if(guess>number){
                        System.out.println("Incorrect! The number is less than "+guess);
                        attempts++;
                    }
                    else if(guess<number){
                        System.out.println("Incorrect! The number is greater than "+guess);
                        attempts++;
                    }
                    else{
                        System.out.print("Congratulation! You guessed the number correctly in "+attempts+" attempts");
                        return;
                    }
                }
                else{
                    System.out.print("CHANCES OVER!!");
                    return;
                }
            }
            if(choice==3){
                if(attempts<=3){
                    if(guess>number){
                        System.out.println("Incorrect! The number is less than "+guess);
                        attempts++;
                    }
                    else if(guess<number){
                        System.out.println("Incorrect! The number is greater than "+guess);
                        attempts++;
                    }
                    else{
                        System.out.print("Congratulations! You have guessed the number correctly in "+attempts+" attempts");
                        return;
                    }
                }
                else{
                    System.out.print("CHANCES OVER!!");
                    return;
                }
            }
        }
    }
}



    


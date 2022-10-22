import java.util.Scanner;
public class GuessGame{
    public static void main(String[] args){
    String c="Y";
    int a,i,g;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Lucky Number:\n");
    a=sc.nextInt();
    System.out.print("The Game has Started !!\n");
    while(c!="N"){
        System.out.print("Guess the Lucky number \nYou have only 3 chances\n");
        for(i=1;i<4;i++){
        System.out.print("Enter your guess number "+i+"\n");
        g=sc.nextInt();
            if(g==a){
            System.out.print("You guessed the right Lucky number \nCongratulations ! You won the game .\n");
                break;
            }
        }
    System.out.print("If you want to play again enter 'Y' otherwise enter 'N' for exit:\n");
    c=sc.nextLine();
    }
    }
}

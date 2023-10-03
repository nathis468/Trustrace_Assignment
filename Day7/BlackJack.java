import java.util.*;

class Game{
    int player1_1;
    int player1_2;
    int player1_sum;
    int player1_next;
    int flag=0;

    int dealer_1;
    int dealer_2;
    int dealer_sum;
    int dealer_next;

    void hit(int flag){
        if(this.dealer_sum<17 && this.player1_sum<21){
            if(flag==0){
                this.player1_sum+=(Math.random()*10+1);
                if(player1_sum==21){
                    System.out.println("Player1 wins");
                }
                else if(player1_sum>21){
                    System.out.println("Dealer wins");
                }
            }
            else{
                this.dealer_sum+=(Math.random()*10+1);
                if(dealer_sum==16){
                    System.out.println("Dealer wins");
                }
                else if(player1_sum>16){
                    System.out.println("Player1 wins");
                }
            }
        }
    }

    void stay(){

    }

    void player1(){
        System.out.println("Welcome to the BlackJack Game");
        this.player1_1=(int)(Math.random()*10)+1;
        this.player1_2=(int)(Math.random()*10)+1;
        this.player1_sum=this.player1_1+this.player1_2;
        System.out.println("You got a "+this.player1_1+" and a "+this.player1_2);
        System.out.println("Your total is "+player1_sum);

        this.dealer_1=(int)(Math.random()*10)+1;
        this.dealer_2=(int)(Math.random()*10)+1;
        this.dealer_sum=this.dealer_1+this.dealer_2;
        System.out.println("The dealer has a "+this.dealer_1+"showing, and a hidden card \n His total is hidden, too.");

        while(dealer_sum<17){
            if(dealer_sum<17){

            }
            else{
                System.out.println("Player 1 wins the game");
                System.exit(dealer_1);
            }
        }
    }
}

class BlackJack{
    public static void main(String args[]){
        Game g=new Game();
        g.player1();
    }
}
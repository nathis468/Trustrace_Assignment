import java.util.Scanner;

interface Game{
    void hit();
    void stay();
    void dealer();
    void choice();
    void decision();
    void compare();
    void initial();
}


class Child implements Game{
    int turn=1;
    int player_sum=0;
    int dealer_sum=0;
    String hit="hit";
    String stay="stay";
    int flag=0;
    int dealer_2;

    public void hit(){
        if(this.turn==1){
            int temp=(int)(Math.random()*(11-2)+2);
            this.player_sum+=temp;
            System.out.println("You drew a "+temp+"\nYour total is "+this.player_sum);
        }
        else{
            int temp2=(int)(Math.random()*(11-2)+2);
            this.dealer_sum+=temp2;
            System.out.println("He drew a "+temp2+"\nHis total is "+this.dealer_sum);
        }
        decision();
    }
    public void stay(){
        if(turn==2){
            turn=1;
            System.out.println("Dealers total is "+this.dealer_sum);
            System.out.println("Dealers turn completed");
            decision();
            compare();
            choice();
        }
        else if(turn==1){
            turn=2;
            dealer();
        }
    }
    public void dealer(){
        if(flag==0){
            System.out.println("His hidden card was a "+this.dealer_2);
            System.out.println("His total was "+this.dealer_sum);
            flag=1;
        }
        this.turn=2;           
        int ran=(int)(Math.random()*10)+1;
        while(ran>5){
            System.out.println("Dealer chooses to hit");
            hit();
        }
        if(ran>5){
            System.out.println("Dealer chooses to stay");
            stay();
        }
    }
    public void choice(){
        Scanner sc=new Scanner(System.in);
        while(dealer_sum<16 && player_sum<21){
            System.out.println("Do you want to stay or hit");
            String choice=sc.nextLine();
            String choice1="hit";
            String choice2="stay";
            int flag1=0;
            for(int i=0;i<choice.length();i++){
                if(choice.charAt(i)==choice2.charAt(i)){
                    flag1=1;
                    break;
                }
            }
            if(flag1==0){
                hit();
            }
            else if(flag1==1){
                stay();
            }
        }
    }
    public void decision(){
        if(dealer_sum>16){
            System.out.println("\nYou Won the match!");
            System.exit(player_sum);
        }
        else if(player_sum>21){
            System.out.println("\nDealer Won the match!");
            System.exit(dealer_sum);
        }
    }
    public void compare(){
        if(this.dealer_sum>this.player_sum){
            System.out.println("\nDealer Won the match!");
            System.exit(dealer_sum);
        }
    }
    public void initial(){
        System.out.println("Welcome to BlackJack program!");
        int player_1=(int)(Math.random()*10)+1;
        int player_2=(int)(Math.random()*10)+1;
        this.player_sum=player_1+player_2;
        System.out.println("You get a "+player_1+" and a "+player_2+"\nYour total is "+this.player_sum);
        int dealer_1=(int)(Math.random()*10)+1;
        this.dealer_2=(int)(Math.random()*10)+1;
        this.dealer_sum=dealer_1+this.dealer_2;
        System.out.println("The dealer has a "+dealer_1+" showing, and a hidden card. \nHis total is hidden, too.");
    }
}

class BlackJackUsingInterface{
    public static void main(String args[]){
        Child c=new Child();
        c.initial();
        c.choice();
    }
}
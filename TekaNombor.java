import java.util.Scanner;

public class TekaNombor {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Permainan meneka nombor!\nGuess 1 to 10 :\n");
        int num = (int)(Math.random() * 10) + 1;
        boolean run = true;
        while(run){
            System.out.print("Berapa? ");
            int teka = read.nextInt();
            if(teka == num){
                System.out.println("Mantap anda teka dengan betul!");
                run = false;
            }else{
                System.out.println("Ups, salah teka!\nCuba lagi.");
            }
        }
    }
    
}
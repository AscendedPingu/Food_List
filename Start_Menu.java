package Food_List;
import java.util.Scanner;
public class Start_Menu{
        public static void main(String[] args){
    {
        System.out.println("---------------------------------\nWelcome to GAA Meal Selector\n---------------------------------\nPlease select from the following\n1 - List food database\n2 - Create meal by manual selection\n3 - Create meal by random selection\n4 - Remove foods high in calorie\n5 – Exit");
        int temp;
        int x = 1;
        Scanner scan = new Scanner(System.in);
        do{
        temp = scan.nextInt();
        if(temp == 1){
            x--;            
        }
        else if(temp == 2){
            x--;            
        }
        else if(temp == 3){
            x--;            
        }
        else if(temp == 4){
            x--;            
        }
        else if(temp == 5){
            x--;
        }
        else{
            System.out.println("Invalid Choice Please Try Again");
        }
    }while(x == 1);
}
}
}

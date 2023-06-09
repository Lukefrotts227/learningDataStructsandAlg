import java.util.ArrayList;
import java.util.Scanner; 
public class arraylistloop {
    public static void main(String[] args){
        boolean keepGoing = true; 
        String temp; 
        String temp2; 

        ArrayList<String> item = new ArrayList<>(); 
        Scanner stdin = new Scanner(System.in); 
        
        while(keepGoing == true){
            System.out.print("Enter the element you wish to add here: ");
            temp = stdin.nextLine(); 
            item.add(temp); 
            System.out.print("Do you want to keep going: "); 
            
            temp2 = stdin.nextLine(); 
            keepGoing = keepItUp(temp2); 
        }
        stdin.close(); 

    }

    static boolean keepItUp(String str){
        if(str.equals("yes") || str.equals("y") || str.equals("true")){
            return true; 
        }
        else{
            return false;
        }

    }
}

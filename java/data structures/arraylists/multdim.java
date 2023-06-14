import java.util.ArrayList;
import java.util.Scanner; 
public class multdim {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> myList = new ArrayList<>(); 
        Scanner stdin = new Scanner(System.in); 
        boolean keepGoing1 = true;
        boolean keepGoing2;
        String temp; 
        int addon; 

        // build the arraylist 
        while(keepGoing1){

            ArrayList<Integer> build = new ArrayList<Integer>(); 
            keepGoing2 = true; 
            while(keepGoing2){
                System.out.print("Enter the number: "); 
                addon = stdin.nextInt(); 
                build.add(addon); 
                stdin.nextLine(); 
                System.out.print("Do you want to keep adding to this array: ");  
                temp = stdin.nextLine(); 
                keepGoing2 = keepItUp(temp);

            }
            myList.add(build); 
            System.out.print("Do you want to keep building the array: "); 
            temp = stdin.nextLine(); 
            keepGoing1 = keepItUp(temp); 
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

    static String superPrint(ArrayList<ArrayList<Integer>> list){
        String str = "";


        return str; 

    }

}

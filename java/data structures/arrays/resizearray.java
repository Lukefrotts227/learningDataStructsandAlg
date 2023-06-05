import java.util.Scanner; 

public class resizearray {
    public static void main(String args[]){
        Scanner stdin = new Scanner(System.in); 
        int size; 

        System.out.println("How big do you want the array to be: "); 
        size = stdin.nextInt(); 
        stdin.nextLine(); 

        String[] stuff = new String[size]; 

        // build the intial array

        for(int i = 0; i < size; i++){
            System.out.println("Enter an element of the array: "); 
            stuff[i] = stdin.nextLine();
        }



    }

    static String getArr(String arr[]){

    }


}

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
        boolean keepItUp = true; 
        int choice; 

        while(keepItUp == true){
            System.out.print("Enter 0 to print the arrary\nEnter 1 to print the size of the array\n");
            System.out.print("Enter 2 to add an element to the array\n Enter 3 to exit the program\n"); 
            System.out.println("Enter your choice here: "); 
            choice = stdin.nextInt(); 

            if(choice == 0){

            }

            else if(choice == 1){

            }

            else if(choice == 2){
                
            }

        }



    }

    static String getArr(String arr[]){
        String str =""; 

        for(String stuffs : arr){
            str += stuffs; 
            str += "\n"; 
        }
        return str; 

    }


}

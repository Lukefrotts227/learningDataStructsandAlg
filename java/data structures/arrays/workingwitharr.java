import java.util.Scanner;

class workingwitharr{

    public static void main(String args[]){
        Scanner stdin = new Scanner(System.in); 

        int size; 

        System.out.print("How big do you want the array to be: "); 
        size = stdin.nextInt(); 
        

        // creating the array

        String[] cars = new String[size]; 

        for(int i = 0; i < size; i++){
            System.out.print("Enter an element of the array: "); 
            cars[i] = stdin.nextLine(); 
        }

        for(String car : cars){
            System.out.println(car); 
        }

        System.out.println("The length of the array is: " + cars.length); 


    }
}
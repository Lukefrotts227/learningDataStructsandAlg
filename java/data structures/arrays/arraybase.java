

public class arraybase{


    public static void main(String[] args){

        String[] people = new String[5]; 

        String[] morepeople = {"Joey", "Tom", "Jane"}; 

        people[0] = "Bobby"; 
        people[1] = "Luke"; 
        people[2] = "Bill"; 
        people[3] = "Ava"; 
        people[4] = "Tommy"; 


        String ret1 = retand(people); 

        String ret2 = retand(morepeople); 

        System.out.println(ret1); 
        System.out.println(ret2); 
        System.out.println("...");

    }

    static String retand(String [] arr ){

        String result = ""; 

        for(String ele : arr){
            result = result + ele + " and "; 

        }

        return result; 
    }
}
// import 'Scanner' class from java.util package for reading input from the console, files, or String by parsing primitive types & text
import java.util.Scanner;


public class BinaryGap {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        // create an instance of 'Scanner' class w/ System.in
        Scanner input = new Scanner(System.in);
        
        // Aside: conventionally it is bad practice to System.out.println()
        System.out.println("Enter an integer: ");

        // invoke '.nextInt()' method to read in given user's 'int'
        int userNum = input.nextInt();
        
        // Aside: '.nextLine()' call necessary to clear leftover newline char '\n' from buffer after using methods such as ...
        // ... '.nextInt()', '.nextDouble()', '.next()' 
        // ... otw calling a 'nextLine()' afterward would read in this empty excess at the end --- resulting in an empty 'String' & missing intended user input
        // input.nextLine();

        // initialize an empty 'StringBuilder' since it is mutable which allows appending of characters later
        // ... w/ a default capacity of 16 characters
        StringBuilder binaryRep = new StringBuilder();

        // while user given 'userNum' 
        while(userNum != 0){

            if(userNum % 2 == 0){
                binaryRep.append("0");
            }
            else{
                binaryRep.append("1");
            }
            userNum /= 2;
            
        }

        System.out.println(binaryRep.reverse());

    }
}

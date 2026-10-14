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

        // while user given 'userNum' DN equal 0 ...
        while(userNum != 0){

            // if 'userNum' is divisible by 2 ...
            // ... remainder is 0 / even ...
            if(userNum % 2 == 0){
                // call StringBuilder '.append()' to add '0' to end of StringBuilder ...
                // Note: '.append()' method accepts 'char' & cast it to 'String'
                binaryRep.append("0");
            }
            // otw if the remainder is 1 / odd ...
            else if(userNum % 2 == 1){
                // '.append()' '1' to end of StringBuilder
                binaryRep.append("1");
            }
            
            // divide the number by 2 & update the number to the quotient 
            userNum /= 2;
            
        }

        // output the binary representation for the user given 'int'
        // Note: 'StringBuilder' .reverse() method increases the time complexity to O(n) when the n is the length of the 'String'
        // ... this is b/c the algo must iterate via 'char' ary & swap char from both ends towards the center
        StringBuilder binaryRepReverse = binaryRep.reverse();
        System.out.println(binaryRepReverse);

        // What are pre-pending it instead of appending & then having to reverse?
        // Would that reduce the time complexity?
        /* Note: Wait within the scope of this project --- we are only trying to find the longest (unbroken) binary gap ...
        ** ... aka the longest chain of unbroken "0" so actual binary representation DN orientation DN matter ...
        ** ... StringBuilder's .reverse() could be removed to reduce possible time complexity */

        int firstZeroCnt = 0;
        int secondZeroCnt = 0;

        for(int i = 0; i < binaryRepReverse.length(); ++i){
            if(firstZeroCnt == 0){
                if(binaryRepReverse.charAt(i) == '0'){

            }
            }
            
        }
        

    }
}

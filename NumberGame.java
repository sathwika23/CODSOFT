import java.util.*;
import java.io.*;

class NumberGame{
    public static void
	guessingNumber()
	{ 
        int i,guess;
        int attempts=5;
        int number;
        System.out.println(
			"A number is choosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");
           Scanner sc=new Scanner(System.in);
            number = 1 + (int)(100 * Math.random());
   
        for(i=0;i<attempts;i++){
      System.out.println("Guess Your Number");
       guess=sc.nextInt();
       
    if(number==guess){
        System.out.println("Congratulations! You have Guessed the correct number");
        break;
       }

    else if(number>guess && i!=attempts-1){
      System.out.println("The Number is"+ " greater than " +guess);
      
    }
    else if(number<guess &&  i != attempts-1){
        System.err.println("The Number is"+ " less than "+guess);
        
    }
}
   if(i==attempts){
     System.out.println("Your Out of trials");
       
        System.out.println("The Number was "+number);
        System.out.println("Play Again");
    }
    else{
        System.out.println("Play Again");
    }
}


    public static void main(String args[]) {
       guessingNumber();
    }
}
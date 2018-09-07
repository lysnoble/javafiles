/* 
  HelloWorld.java                           07.20.20
                                             The Cru

    A quick and dirty breakdown of java and its cool
  features!

  Tips 'n Tricks:
  - tab in command line autocompletes words!
  - up/down arrow keys in command line show history.
  - ctl + c: Ends program currently running.

  Terminology
  - Syntax: The logistics of a coding language! Characters,
    statements, what they mean, & how they're used.
  - Scope: Where something happens. A place. Defined by braces!
  - Concatenate: To add a value to end of another value.
  - Append: " " " " " "

  Syntax
  {} - Braces
  [] - Brackets
  ;  - Semicolon (Used to mark end of executable line)
  && - 'And' Operator (Used for to separate tests)
  || - 'Or' Operator (Used to separate tests)
  =  - 'Assignment' Operator (Assigns variable a value)
  == - 'Equavalence' Operator (Used to test equality)

*/

public class HelloWorld {
    
    public static void main(String args[]) {


        /*--- Variables ---*/

        // Variables defined at top of program.
        // Variables can have multiple types:

        // Integer = Whole Number
        int variableOne = 1;
        // Double  = Decimal Number
        double variableTwo = 2.75;
        // Boolean = true || false
        boolean variableThree = true;
        // String  = Text Value
        String variableFour = "Hello World!";


        /*--- Logic Blocks ---*/

        // Logic Blocks are the core reasoning tools of
        // a program. There are a few types:

        // If Block (Test Case)
        if (variableThree) {
            System.out.println(variableFour);
        }

        // If-Else Block
        if (variableOne == 1) {
            System.out.println("It's true!");
        } else {
            System.out.println("It's false.");
        }

        // While Loop (Test Case)
        int whileVariable = 0;
        while (whileVariable < 5) {
            System.out.println(whileVariable);
            whileVariable = whileVariable + 1;
        }

        // For Loop (Variable; Exit Case; Variable Behavior)
        for (int x = 0; x < 5; x++) {
            System.out.println("Test: " + x);
        }
    }
}
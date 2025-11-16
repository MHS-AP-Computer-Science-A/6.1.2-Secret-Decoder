import java.util.Arrays;

public class SecretDecoder {
    public static void main(String[] args) throws Exception {
         // The array contains 12 characters and is currently scrambled.
         char[] message = {'!', 'S', 'R', 'K', 'C', 'A', 'O', 'P', 'S', ' ', 'C', 'A'};

         // ----------------------------------------------------------------------
         // Step 0: Initial Check (Do not modify)
         System.out.println("--- START OF DECODING ---");
         System.out.println(Arrays.toString(message));
 
       // ======================================================================
        //
        //       STUDENTS: IMPLEMENT YOUR ARRAY ASSIGNMENTS BELOW HERE
        //
        // ======================================================================

        // CLUE 1
        // The second letter of the message should be the uppercase letter 'P'.
     

        // CLUE 2
        // The character at index 0 is the same as the character currently at index 5.
        // ** You many NOT use a character literal in your answer. **


        // CLUE 3
        // The character at index 3 is the same as the character currently at index 8.
        // ** You many NOT use a character literal in your answer. **


        // CLUE 4
        // The character at index x should be set to the character at the very next index.
        // ** Your answer must use x  ** 


        // CLUE 5 
        // The character at index y should be set the the character 4 indexes to the left.
        // ** Your answer must use y and 4 ** 


        // CLUE 6
        // The character at index z should be set the the character 4 indexes to the right.
        // ** Your answer must use z and 4 ** 


        // CLUE 7 
        // The letters at index 8 and 10 need to be swapped.
        // ** You may NOT use any char literals. Making a char variable could be helpful. **


        // CLUE 8
        // The letters at index 2 and 8 need to be swapped.
        // ** You may NOT use any char literals. Making a char variable could be helpful. **
 

        // CLUE 9 
        // The letter 'O' belongs at index 7.
      

        // CLUE 10 
        // The letter 'C' belongs at index 8.
      

        // CLUE 11 
        // The letter 'K' belongs at index 9.
     

        // CLUE 12 
        // The final character of the message is '!'
        // ** You MUST include message.length in your answer **
       


        // ======================================================================
        //
        //       STUDENTS: STOP EDITING ABOVE HERE
        //
        // ======================================================================
 
         // Step 2: Final Check (Do not modify)
         System.out.println("--- FINAL DECODING RESULT ---");
         System.out.println(Arrays.toString(message));
    }
}

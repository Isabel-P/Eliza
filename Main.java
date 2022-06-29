package project2;
import java.util.Random;
import java.util.Scanner;

public class ProjectEliza {
    /* 
    If the sentence the user enters ends with a ‘?’, the program should prompt the user with a question built using the 1st word and last word of their line.
    If the sentence the user enters ends with a ‘!’, the program should prompt the user with a statement that starts with “WOW! Dramatic! ” 
    followed by the rest of the statement built using the 1st word and last word of their line. 
    If the sentence the user enters ends with a ‘.’ or any other character, the program should prompt the user with 
    a statement built using the 1st word and last word of their line.
    This process should be repeated until the user types “EXIT” as a response When the user types “EXIT” the user should be asked if they want to run the session again.
    If they say yes, upper or lower case, run the program from the beginning”
    If they say no, upper or lower case, say “Goodbye, until next time”
    */

    // Initial Variables
    static String[] questions = new String[4];
    static String[] statements = new String[4];
    static Random random;
    static String userName;
    static String userResponse;
    static Scanner scan;
    static String BLANK1;
    static String BLANK2;
    static char punctuation;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Greeting();
        System.out.println("Do you want to run the session again?");
        userResponse = scan.nextLine();
        if (userResponse.equalsIgnoreCase("yes"))
            Greeting();
        else
            System.out.println("Goodbye, until next time.");
    }

    // punctuations
    private static int checkPunctuation(char punctuation) {
        if (punctuation == '!')
            return 0;
        if (punctuation == '?') 
            return 1;
        if (punctuation == '.')
            return 2;
        return -1;
    }
    
    //Elizia 
    private static void Greeting() {
        // Greeting
        System.out.println("Hello, my name is Eliza. What is your name?");
        userName = scan.nextLine();
        System.out.printf("Hello, %s. Tell me what is on your mind today in 1 sentence.\n", userName);

        // User response
        userResponse = scan.nextLine();
        Eliza(userResponse);
    }

    private static void Eliza(String userResponse) {
        while (!userResponse.equalsIgnoreCase("EXIT")) {
        	punctuation = userResposne.charAt(userResposne.length() - 1);
        	// remove puncuation  from reply
        	String[] words = userResponse.substring(0, userResponse.length() - 1).split(" ");
            BLANK1 = words[0];
            BLANK2 = words[words.length - 1];
            
            

            // Populate arrays
            populateStatementsArray(BLANK1, BLANK2);
            populateQuestionsArray(BLANK1, BLANK2);
    
            // Checking punctuation
            if (checkPunctuation(punctuation) == 0)
                System.out.println("WOW! Dramatic! " + getRandomStatementTrunk());
            if (checkPunctuation(punctuation) == 1)
                System.out.println(getRandomQuestionTrunk());
            if (checkPunctuation(punctuation) == 2)
                System.out.println(getRandomStatementTrunk());
            if (checkPunctuation(punctuation) == -1)
                System.out.println("I didn't understand that. Can you try again? You may have a grammatical error.");
            
            // Checking response
            userResponse = scan.nextLine();
        }
    }

    public static void PromptBank() {
        questions = new String[4]; // initialize your array to the correct length to match your number of questions you populate it with
        statements = new String[4]; // initialize your array to the correct length to match your number of questions you populate it with
    }
    
    
    public static void populateStatementsArray(String BLANK1, String BLANK2){
        statements[0] = String.format("Tell me more about %s and %s", BLANK1, BLANK2);
        statements[1] = String.format("%s seems important to you, so does %s. Please tell me more.", BLANK1, BLANK2);
        statements[2] = String.format("%s and %s seem to be on your mind. Let's talk about it.", BLANK1, BLANK2);
        statements[3] = String.format("It seems %s is bothering you more than %s.", BLANK1, BLANK2);
        /*complete this method with your other statements using BLANK1 for word1
         * and BLANK2 for word2 place holder 
         */
    }

    public static void populateQuestionsArray(String BLANK1, String BLANK2){
        questions[0] = String.format("Is there anything else about %s and $s?", BLANK1, BLANK2);
        questions[1] = String.format("Does %s bother you? How about %s?", BLANK1, BLANK2);
        questions[2] = String.format("Are %s and %s things you think about often?", BLANK1, BLANK2);
        questions[3] = String.format("Do you have a preference between %s and %s?", BLANK1, BLANK2);
        
        /*complete this method with your other questions using BLANK1 for word1
         * and BLANK2 for word2 place holder 
         */
        
    }
 
    public static String getRandomStatement(){
        //fill in the method so it randomly selects the statement template
        //from the statements array ... hint use Math.random() to get the random index
        //so you can replace BLANK1 and BLANK2 with the appropriate words

        random = new Random();
        return statements[random.nextInt(questions.length)];
    }
    
    public static String getRandomQuestion(){
        //fill in the method so it randomly selects the question template
        //from the questions array ... hint use Math.random() to get the random index
        //so you can replace BLANK1 and BLANK2 with the appropriate words

        random = new Random();
        return questions[random.nextInt(questions.length)];
    }

    	
    	//helper
    	if (userString.charAt(userString.length()-1)=='!')
    		return 0;
    	if (userString.charAt(userString.length()-1)=='?')
    		return 1;
    	if (userString.charAt(userString.length()-1)=='.')
		return 2;
    	
    	return -1;
    	
    }

    public void PromptBank() {
        questions = new String[4]; // initialize your array to the correct length to match your number of questions you populate it with
        statements = new String[4]; // initialize your array to the correct length to match your number of questions you populate it with
    }
    
    public void populateStatementsArray(String BLANK1, String BLANK2){
        statements[0] = String.format("Tell me more about %s and %s", BLANK1, BLANK2);
        statements[1] = String.format("%s seems important to you, so does %s. Please tell me more.", BLANK1, BLANK2);
        statements[2] = String.format("%s and %s seem to be on your mind. Let's talk about it.", BLANK1, BLANK2);
        statements[3] = String.format("It seems %s is bothering you more than %s.", BLANK1, BLANK2);
        /*complete this method with your other statements using BLANK1 for word1
         * and BLANK2 for word2 place holder 
         */
    }

    public void populateQuestionsArray(String BLANK1, String BLANK2){
        questions[0] = String.format("Is there anything else about %s and $s?", BLANK1, BLANK2);
        questions[1] = String.format("Does %s bother you? How about %s?", BLANK1, BLANK2);
        questions[2] = String.format("Are %s and %s things you think about often?", BLANK1, BLANK2);
        questions[3] = String.format("Do you have a preference between %s and %s", BLANK1, BLANK2);
        
        /*complete this method with your other questions using BLANK1 for word1
         * and BLANK2 for word2 place holder 
         */
        
    }
 
    public String getRandomStatementTrunk(){
        //fill in the method so it randomly selects the statement template
        //from the statements array ... hint use Math.random() to get the random index
        //so you can replace BLANK1 and BLANK2 with the appropriate words

        random = new Random(statements.length);
        return statements[random.nextInt()];
    }
    
    public String getRandomQuestionTrunk(){
        //fill in the method so it randomly selects the question template
        //from the questions array ... hint use Math.random() to get the random index
        //so you can replace BLANK1 and BLANK2 with the appropriate words

        random = new Random(questions.length);
        return questions[random.nextInt()];
    }
}

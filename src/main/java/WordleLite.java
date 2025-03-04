import java.util.Random;
import java.util.Scanner;

public class WordleLite {
    private static final int MAX_ATTEMPTS = 6;
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to WordleLite!");
        
        String secretWord = getRandomWord();
     
        
        System.out.println("Try to guess the 4-letter word. You have " + MAX_ATTEMPTS + " attempts.");
        System.out.println("* means correct letter in correct position");
        System.out.println("+ means correct letter in wrong position");
        System.out.println("- means letter not in the word");
        
        playGame(secretWord);
    
        scanner.close();
    }
    
    // Select a random word from the provided array
    public static String getRandomWord() {
        String[] words = getWords();
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
    
    // Manage the main game loop
    public static void playGame(String secretWord) {
       
    }
    
    // Get and validate the player's guess
    public static String getPlayerGuess() {
       
        
        return "";
    }
    
    // Compare the guess with the secret word and provide feedback
    public static String provideFeedback(String guess, String secretWord) {

        if(guess.equals(secretWord)){
            return "****";
        }
        
        String feedbackString = "";
        char[] charGuessArray = guess.toCharArray();
 

        char[] charSecretWordArray = secretWord.toCharArray();


        int i = 0;
        String pos = "";
        for(char c: charGuessArray){


            if(c == charSecretWordArray[i]){
                feedbackString += "*";
                pos = "*";
            }else{
                for(char g: charSecretWordArray){
                    if (c == g) {
                        pos = "+";
                    }
                }
            }
            if(pos.equals("+")){
                feedbackString += "+";
            }else if(pos.equals("")){
                feedbackString += "-";
            }
            i++;
            
        }
        return feedbackString;
    }
    
    // Display the guess and feedback
    public static void displayFeedback(String guess, String feedback) {
       
    }
    
    // Check if the game has been won
    public static boolean isGameWon(String feedback) {
        // If all characters are '*', the player has won
      
        return false;
    }
    
    // Provided method to get the list of words
    public static String[] getWords() { 
        String[] words = { "that", "with", "have", "this", "they", "from", "what", "when", "said", "will", "know", "like", "good", "them", "want", "been", "look", "here", "much", "well", "your", "very", "time", "also", "into", "make", "down", "find", "just", "then", "came", "some", "long", "over", "back", "take", "left", "only", "come", "told", "more", "hand", "same", "show", "play", "help", "away", "part", "life", "year", "need", "case", "seem", "used", "give", "last", "most", "high", "feel", "real", "word", "home", "days", "went", "side", "made", "keep", "book", "free", "room", "such", "must", "held", "call", "turn", "near", "open", "seem", "ever", "told", "each", "move", "area", "does", "name", "mind", "game", "sure", "form", "line", "team", "stay", "talk", "city", "face", "work", "plan", "week", "door", "full", "true", "kind", "late", "held", "hope", "easy", "item", "idea", "hear", "past", "care", "body", "grow", "lose", "test", "army", "step", "list", "type", "view", "wait", "draw", "unit", "mean", "role", "risk", "half", "hair", "heat", "upon", "once", "gone", "pace", "hard", "blue", "dark", "deep", "dear", "dish", "date", "east", "else", "even", "ever", "fair", "fall", "fast", "fear", "fact", "gain", "game", "good", "gray", "grin", "help", "here", "hero", "hold", "hope", "hate", "idea", "into", "item", "join", "jump", "just", "keep", "kind", "know", "lack", "last", "late", "lead", "like", "live", "load", "long", "lord", "love", "make", "many", "mark", "mask", "mean", "meet", "menu", "mind", "miss", "move", "near", "neck", "need", "news", "nice", "nose", "note", "onto", "only", "open", "oral", "over", "pace", "pack", "page", "pain", "park", "part", "pass", "past", "path", "peak", "plan", "play", "plot", "plus", "poem", "port", "pose", "pull", "pure", "push", "race", "rail", "rain", "rank", "read", "real", "rear", "rely", "rent" }; 
        return words; 
    }
}
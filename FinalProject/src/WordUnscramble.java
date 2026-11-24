import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


void main() {
    ArrayList<String> wordsList = new ArrayList<>();
    ArrayList<String> definitionsList = new ArrayList<>();

    ArrayList<String> scrambledWordsList = new ArrayList<>();
    ArrayList<String> userAnswersList = new ArrayList<>();

    int wordCounter = 0;
    int points = 0;

    try (BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"))) {

        String line;
        while ((line = br.readLine()) != null) {
            if (line.trim().equals("")) {
                continue;
            }
            // I used \\s+ as the regex which splits by any amount of white space.
            // This accounts for potential errors in how the file is structured.
            String[] lineArray = line.split("\\s+");
            // The condition below makes sure that the line has exactly one word and one definition
            // and that the word to be scrambled is at least 4 words long.
            if (lineArray[0].length() > 3 && lineArray.length == 2) {
                wordsList.add(lineArray[0]);
                definitionsList.add(lineArray[1]);
            }

        }
       // Below are checks to make sure the game does not operate when
        // the file is empty or if there are 2 or fewer words in the list.
        if (wordsList.size() == 0) {
            IO.println("Word list is empty.");
            return;
        }
        if (wordsList.size() <= 2) {
            IO.println("Too few words. Please update list. ");
        }
    } catch (IOException e) {
        IO.println("Unable to read file.");
        return;
    } catch (Exception e) {
        IO.println("Unable to execute program.");
        return;
    }
    // game starts below
    IO.println("\nWELCOME TO SPANISH WORD UNSCRAMBLE");
    while (wordCounter < 15 && wordCounter < wordsList.size()) {

        String scrambledWord = "";

        // Below is a safety check to make sure the scrambled word does not end up
        // accidentally as the original word, and to keep scrambling it until it is unique.
        boolean wordIsScrambled = false;
        while (!wordIsScrambled) {
            scrambledWord = scrambleWord(wordsList.get(wordCounter)).toLowerCase();
            if (!scrambledWord.equalsIgnoreCase(wordsList.get(wordCounter))) {
                wordIsScrambled = true;
            }
        }
        scrambledWordsList.add(scrambledWord);

        IO.println("\nDefinition: " + definitionsList.get(wordCounter));
        IO.println("Scrambled word: " + scrambledWord);

        String userAnswer = IO.readln("Enter your guess here: \n");
        userAnswersList.add(userAnswer);

        // The code below is to provide feedback saying correct or incorrect
        // after every single round, enhancing user learning experience (feature).
        if (userAnswer.trim().equalsIgnoreCase(wordsList.get(wordCounter))) {
            points++;
            IO.println("Correct!");
        } else {
            IO.println("Incorrect. The correct answer is: " + wordsList.get(wordCounter));
        }

        wordCounter++;

    }

    IO.println("Game Over!");
    // The max points depend on how many words are in the list, less than 15 or not
    // If less than 15 words, the max points should be the size of the wordsList itself
    if (wordsList.size() < 15) {
        IO.println("Your score: " + points + "/" + wordsList.size());
    } else {
        IO.println("Your score: " + points + "/" + 15);
    }
    // Outputs different feedback or encouragement based on the score (feature)
    if (points == 15) {
        IO.println("Perfect score!\n");
    } else if (points >= 10) {
        IO.println("Great job!\n");
    }else if (points >= 7) {
        IO.println("Good job, but keep on practicing!\n");
    } else {
        IO.println("Keep practicing!\n");
    }

    // Below displays the stats of the game for all rounds for review and user improvement (feature)
    IO.println("View your answer details below in the order of " +
            "the correct word and definition, the scrambled word, and your answer: ");
    for (int i = 0; i < userAnswersList.size(); i++) {
        IO.println(wordsList.get(i) + "  " + definitionsList.get(i) + "  " +
                scrambledWordsList.get(i) + "  " + userAnswersList.get(i));
    }


}

// This method scrambles the letters in a word given as the argument
// using the shuffle method from the Collections class
// Parameter: String, a word that needs to be scrambled
// Return: String, scrambled up form of word
public String scrambleWord(String word) {
    ArrayList<Character> letters = new ArrayList<>();
    String scrambledWord = "";

    for (int i = 0; i < word.length(); i++) {
        letters.add(word.charAt(i));
    }
    Collections.shuffle(letters);

    for (int i = 0; i < letters.size(); i++) {
        scrambledWord += letters.get(i);
    }
    return scrambledWord;
}
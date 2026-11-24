import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


void main() {
    ArrayList<String> wordsList = new ArrayList<>();
    ArrayList<String> definitionsList = new ArrayList<>();

    int countOfWords = 0;
    int points = 0;

    try (BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"))) {

        String line;
        while((line = br.readLine()) != null) {
            if (line.trim().equals("")) {
                continue;
            }
            String[] lineArray = line.split(" ");
            if (lineArray[0].length() > 3 && lineArray.length == 2) {
                wordsList.add(lineArray[0]);
                definitionsList.add(lineArray[1]);
            }

        }
        if (wordsList.size() == 0) {
            IO.println("Invalid File");
            return;
        }
    } catch (IOException e) {
        IO.println("Unable to open file.");
        return;
    } catch (Exception e) {
        IO.println("Unable to open file.");
        return;
    }
    // game loop starts below
    while(countOfWords < 15 && countOfWords < wordsList.size()) {

        String scrambledWord = scrambleWord(wordsList.get(countOfWords));

        IO.println("\nDefinition: " + definitionsList.get(countOfWords));
        IO.println(scrambledWord);

        String userAnswer = IO.readln("Enter your guess here: \n");

        if (userAnswer.trim().toLowerCase().equals(wordsList.get(countOfWords).toLowerCase())) {
            points++;
        }

        countOfWords++;

    }
    IO.println("Game Over!");
    IO.println("Your score: " + points + "/" + 15);

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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


void main() {
    ArrayList<String> words = new ArrayList<String>();
    ArrayList<String> definitions = new ArrayList<String>();
    ArrayList<String> scrambledWords = new ArrayList<String>();

    int countOfWords = 0;

    try (BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"))) {

        String line;
        while((line = br.readLine()) != null) {
            if (line.trim().equals("")) {
                continue;
            }
            String[] lineArray = line.split(" ");
            if (lineArray[0].length() > 3 && lineArray.length == 2) {
                words.add(lineArray[0]);
                definitions.add(lineArray[1]);
            }

        }
        if (words.size() == 0) {
            IO.println("Invalid File");
            return;
        }
    } catch (IOException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    }

//    int i = 0;
//    while(i < 15) {
//        String scrambledWord = scrambleWord(words.get(i));
//
//    }

}
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
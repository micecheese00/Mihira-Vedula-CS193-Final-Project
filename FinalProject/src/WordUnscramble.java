import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

void main() {
    ArrayList<String> words = new ArrayList<String>();
    ArrayList<String> definitions = new ArrayList<String>();
    int countOfWords = 0;
    try (BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"))) {

        String line;
        while((line = br.readLine()) != null) {
            String[] lineArray = line.split(" ");
            words.add(lineArray[0]);
            definitions.add(lineArray[1]);
        }
    } catch (IOException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    }


}
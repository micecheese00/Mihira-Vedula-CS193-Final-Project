# Spanish Word Unscramble Game
Terminal-based Spanish vocabulary learning game with unscrambling 15 scrambled words

This project is a language learning (specifically vocabulary learning) game where users are able to enjoy practicing words by unscrambling 15 scrambled words and checking their score at the end. This game is played through the terminal. It provides instant feedback after every round, and a summary of the user's answers at the end. 

Many people often find memorizing a long lists of words boring, and this game will allow people to learn vocabulary words and new languages in a motivating and fun manner. The constant thinking of the word would cause them to remember the word better, and the win would make them remember how they had solved the problem and how they had remembered the word from before, increasing motivation and enjoyment.

## How it works: 
A file of vocabulary words will be processed and scrambled. Only 15 words will appear on the screen one at a time. For each word, there is user input where the user can enter their answer. If it is correct, a point will increase. After 15 words, the game will end and the score will be displayed. In the first version, there is only going to be one given vocab list processed.

## Tech stack for this project: 
This project is written Java version 25. Some classes in the IO library, such as IOException, BufferedReader, and FileReader are used. Other than that, the ArrayList and Collections classes are used from the java.util library.

## How to run and access the code & Example of game:
  1. **Cloning the repo**
     * Open the terminal, and type `git clone https://github.com/micecheese00/Mihira-Vedula-CS193-Final-Project`
     * Type `cd FinalProject/src`
  2. Make sure the `dictionary.txt` file is within the **SAME DIRECTORY** as `WordUnscramble.java` (in the `src` folder within the `FinalProject` folder).
     To verify, once in the `src` folder within the `FinalProject` directory, type `ls` and make sure **BOTH** `WordUnscramble.java` and `dictionary.txt` are present. 
  4. In the terminal, type `java WordUnscramble.java` to run the program.

Example of Game Running: 
```
WELCOME TO SPANISH WORD UNSCRAMBLE

Definition: food
Scrambled word: dicaom
Enter your guess here: 
comida
Correct!

Definition: rice
Scrambled word: ozrar
Enter your guess here: 
rod
Incorrect. The correct answer is: arroz

Definition: icecream
Scrambled word: oldhea
Enter your guess here: 
helado
Correct!

Definition: juice
Scrambled word: ougj
Enter your guess here: 
jugo
Correct!

Definition: drink
Scrambled word: biadeb
Enter your guess here: 
bebida
Correct!

Definition: water
Scrambled word: auga
Enter your guess here: 
guaa
Incorrect. The correct answer is: agua

Definition: fork
Scrambled word: etornde
Enter your guess here: 
tornado
Incorrect. The correct answer is: tenedor

Definition: potato
Scrambled word: tataap
Enter your guess here: 
topaa
Incorrect. The correct answer is: patata

Definition: salty
Scrambled word: aoslad
Enter your guess here: 
salado
Correct!

Definition: apple
Scrambled word: anznmaa
Enter your guess here: 
maaana
Incorrect. The correct answer is: manzana

Definition: resteraunt
Scrambled word: aunsterater
Enter your guess here: 
resteraunte
Incorrect. The correct answer is: restaurante

Definition: kitchen
Scrambled word: acinco
Enter your guess here: 
cocina
Correct!

Definition: dish
Scrambled word: oaptl
Enter your guess here: 
oplat
Incorrect. The correct answer is: plato

Definition: vegetarian
Scrambled word: vnteoaargie
Enter your guess here: 
vegeniario
Incorrect. The correct answer is: vegetariano

Definition: meat
Scrambled word: acenr
Enter your guess here: 
carne
Correct!
Game Over!
Your score: 7/15
Good job, but keep on practicing!

View your answer details below in the order of the correct word and definition, the scrambled word, and your answer: 
comida  food  dicaom  comida
arroz  rice  ozrar  rod
helado  icecream  oldhea  helado
jugo  juice  ougj  jugo
bebida  drink  biadeb  bebida
agua  water  auga  guaa
tenedor  fork  etornde  tornado
patata  potato  tataap  topaa
salado  salty  aoslad  salado
manzana  apple  anznmaa  maaana
restaurante  resteraunt  aunsterater  resteraunte
cocina  kitchen  acinco  cocina
plato  dish  oaptl  oplat
vegetariano  vegetarian  vnteoaargie  vegeniario
carne  meat  acenr  carne
```
     
## Roadmap: 
- [ ] having more vocabulary list options
- [X] add a message of what the correct word actually is if the user inputs a wrong answer - feedback after every round
- [X] add welcome to game message/ great job or practice more message based on the score - feedback
- [ ] add a play again feature
- [X] at the end, show all the words that had been given, and all the words that the user had inputted. For review and learning.
- [ ] give words by increasing difficulty/levels
- [ ] letting users import their own lists
- [ ] jumbling up words instead of going in order
- [ ] incorporating special characters such as accents and tildes in Spanish
- [ ] the ability for the user to end the game early or have several attempts per question could be included.

## Demo: 


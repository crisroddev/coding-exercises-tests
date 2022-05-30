# CesarCypher
* String of lowercase and a integer write a functioon that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where the k is the key
* Input: String: xyz - Key: 2
* Ouput: zab
* So you get a string and a key so you want to input the next letters in the alphabet that is on the position on the key

* Solve:
    * Create an array
    * Iterate alphabet a throw new letters into the array
    * Create a string with the array
    * Use unicode values 
        * Ex --> z --> 122, a --> 97
    * current letter has code
    * new letter code
        * newLetterCode = unicode(letter) + key
    * if newLetterCode <= 122 --> return char(newLetterCode) else return char(96 + newLetterCode % 122)
    * Edge case what happens if the key is a big number like 54 -> swift 26 once, then 26 once and finally by 2

* Code --> O(n)T, O(n)S
```
class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
    char[] newLetters = new char[str.length()];
    int newKey = key % 26;
    for(int i = 0; i < str.length(); i++){
      newLetters[i] = getNewLetter(str.charAt(i), newKey);
    }
    return new String(newLetters);
  }

  public static char getNewLetter(char letter, int key){
    int newLetterCode = letter + key;
    return newLetterCode <= 122 ? (char) newLetterCode : (char) (96 + newLetterCode % 122);
  }
}
```
# Length Encoding
* Write a function that takes a string and returns its run-length
* Sample Input: string = "AAAAAAAAAAAAABBCCCCDD"
* Sample Output: "9A4A2B4C2D"
* Maximum digit is 9
* Take input and create output
* Solution
    * Store Runs in char list, beacuse string is inmutable data type and we should do a new string and that could be a O(n2)
    * Add characters to list --> char[9,A,4,A...] and then convert it to string
* Pseudo Code
```
char list = []
length = 1;
compare currChar with prevChar if equal we add to length
if(string[i] == string[i+1] || length == 9){
    length +=1;
} else {
    add to char
} else {}
```

* Code O(n)T, O(n)S
```
class Program {
  public String runLengthEncoding(String string) {
    // Write your code here.
    StringBuilder encodedStringCharacters = new StringBuilder();
    int currentLength = 1;
    for(int i = 1; i < string.length(); i++){
      char currentCharacter = string.charAt(i);
      char previousCharacter = string.charAt(i - 1);
      if((currentCharacter != previousCharacter) || (currentLength ==9)){
        encodedStringCharacters.append(Integer.toString(currentLength));
        encodedStringCharacters.append(previousCharacter);
        currentLength = 0;
      }
      currentLength += 1;
    }
    // Handle the last run
    encodedStringCharacters.append(Integer.toString(currentLength));
    encodedStringCharacters.append(string.charAt(string.length() - 1));
    return encodedStringCharacters.toString();
  }
}
```



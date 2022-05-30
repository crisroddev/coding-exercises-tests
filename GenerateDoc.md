# Generate Doc
* String of characters a string representing a doc that you need tp gereate.
* Function determine if you can generate the doc using available characters. If can generate returns true
* Sample Input:
    * chracters = "Bste!hetsi ogEAxpelrt x "
    * document = "AlgExpert is the best!"
* Sample Output: True

* Constraints
    * If both strings does not have the same spaces we could not create the doc
* Solution 1 --> O(m(n + m) T and O(1) S:
    * Loop from doc string and count characters
    * Loop characters string and compare with the other string

* Solution 2 --> O(c(n+m))T, O(c)
    * Keep track with a set
    * After we count we add to the set if we ever reach the character we skip

* Solution 3 -->  O(n + m)T, O(c)S
    * Loop through and store count of characters with a HashMap (Key, Value)
    * Key: Character
    * Value: How many times ocurr
        - count = []
        - count = ["B": 1]
        - count = ["B": 1, "S": 1, "T": 1, "E": 2 ......]
    * Loop the other string check if character does not exists in HashMap we cant create the doc, if it does ocurr, change the key to be - 1
    * If we have the hashmap completely with 0 it matches

* Code 1
```
class Program {

  public boolean generateDocument(String characters, String document) {
    // Write your code here.
    for (int idx = 0; idx < document.length(); idx ++){
      char character = document.charAt(idx);
      int documentFrequency = countCharacterFrequency(character, document);
      int characterFrequency = countCharacterFrequency(character, characters);
      if(documentFrequency > characterFrequency){
        return false;
      }
    }
    return true;
  }

  public int countCharacterFrequency(char character, String target){
    int frequency = 0;
    for(int idx = 0; idx < target.length(); idx ++){
      char c = target.charAt(idx);
      if(c == character){
        frequency += 1;
      }
    }
    return frequency;
  }
}
```

* Code 2
```
class Program {

  public boolean generateDocument(String characters, String document) {
    // Write your code here.
    Set<Character> alreadyCounted = new HashSet<Character>();
    for(int idx = 0; idx < document.length(); idx ++){
      char character = document.charAt(idx);
      if(alreadyCounted.contains(character)){
        continue;
      }
      int documentFrequency = countCharacterFrequency(character, document);
      int characterFrequency = countCharacterFrequency(character, characters);

      if(documentFrequency > characterFrequency){
        return false;
      }
      alreadyCounted.add(character);
    }
    return true;
  }

  public int countCharacterFrequency(char character, String target){
    int frequency = 0;
    for(int idx = 0; idx < target.length(); idx ++){
      char c = target.charAt(idx);
      if(c == character){
        frequency += 1;
      }
    }
    return frequency;
  }
}
```

* Code 3
```
class Program {

  public boolean generateDocument(String characters, String document) {
    // Write your code here.
    HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();
    for(int idx = 0; idx < characters.length(); idx++){
      char character = characters.charAt(idx);
      characterCounts.put(character, characterCounts.getOrDefault(character, 0) + 1);
    }

    for (int idx = 0; idx < document.length(); idx ++){
      char character = document.charAt(idx);
      if(!characterCounts.containsKey(character) || characterCounts.get(character) == 0){
        return false;
      }
      characterCounts.put(character, characterCounts.get(character) - 1);
    }
    return true;
  }
}
```



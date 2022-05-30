# First Non Duplicate Character
* Function in a string of lower cases and returns the index of the first character that does not repeat
* Sample Input: "abcdcaf"
* Sample Output: 1

* Brute Force
    * Looking first character and scan the rest if he has a repeating character
    * Every character and check
    * Define two iterators
* Pseudo
```
int i
int j
for(i){
    boolean duplicate = false;
    for(j)
        if string i == string j
            return true
    
    if not found idx

return -1
}
```

* Code --> O(n2)T, O(1)S
```
class Program {

  public int firstNonRepeatingCharacter(String string) {
    // Write your code here.
    for (int idx = 0; idx < string.length(); idx++){
      boolean isDuplicate = false;
      for(int idx2 = 0; idx2 < string.length(); idx2++){
        if(string.charAt(idx) == string.charAt(idx2) && idx != idx2){
          isDuplicate = true;
        }
      }
      if(!isDuplicate) return idx;
    }
    return -1;
  }
}
```

* Code 2 --> O(n) T, O(1) S
```
class Program {

  public int firstNonRepeatingCharacter(String string) {
    // Write your code here.
    HashMap<Character, Integer> characterFrequencies = new HashMap<Character, Integer>();
    for (int idx = 0; idx < string.length(); idx ++){
      char character = string.charAt(idx);
      characterFrequencies.put(character, characterFrequencies.getOrDefault(character, 0) + 1);
  }
    for(int idx = 0; idx< string.length(); idx ++){
      char character = string.charAt(idx);
      if(characterFrequencies.get(character) == 1){
        return idx;
      }
    }
    return -1;
  }
}
```
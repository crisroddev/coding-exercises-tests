# Palindrome Search
* Write a function that takes a String and returns a boolean if the palindrome exists
* How to do it
    * Create a reversed String and then compare with the output
* Input: a string "aaa"
* Output: If string matches reversed string returns True otherwise false
* Human:
    * Take original string
    * reverse the original string a creates a new string
    * Compares the original string with the new string
* Pseudo Code 1
* O(n) S --> Creates a new string and the space will be the length of N (String)
* O(n^2) T --> Creates a new string and iterates on characters
```
string = "abc";
newString = " ";
newString = string[i];
return newString == string;
```
* Code 1
```
class Program {
  public static boolean isPalindrome(String str) {
    // Write your code here.
		String reversedString = "";
		for(int i = str.length() - 1; i >= 0; i --){
			reversedString += str.charAt(i);
		}
		return str.equals(reversedString);
  }
}
```

* Pseudo Code 2
* O(n) T --> append is a linear operation
* O(n) S
```
string = "abc";
newArray = [ ];
newArray = newArray.append(string[i]);
return newArray.join == string;
```
* Code
```
class Program {
  public static boolean isPalindrome(String str) {
    // Write your code here.
		StringBuilder reversedString = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--){
			reversedString.append(str.charAt(i));
		}
		return str.equals(reversedString.toString());
  }
}
```

* Pseudo Code 4 Iteratively - Pointers so we use less memory
* O(N)T
* O(1)S
```
check array[0] == array.length - 1 
True
.
.
.
```
* Code
```
class Program {
  public static boolean isPalindrome(String str) {
    // Write your code here.
		int left = 0;
		int right = str.length() -1;
		while (left < right){
			if(str.charAt(left) != str.charAt(right)){
				return false;
			}
			left ++;
			right --;
		}
    return true;
  }
}
```

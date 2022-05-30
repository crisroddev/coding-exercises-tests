# Class Photos
* All students wearing redShirt same row
* All students wearing blueShirt same row
* Students in the back row strictly must be taller than the one on the front

* Input: Two arrays
    * array1 = array with heights of redShirts
    * array2 = array with heights of blueShirts

* Inputs
```
Heights
redShirts = [5, 8, 1, 3, 4]
blueShirts = [6, 9, 2, 4, 5]
```
* Ouput:
```
If we follow constraints returns true or false
```

* Tallest needs to be in back row
* Smallest in frint row
* So as seen the blue shirts got the tallest person in the class, so blue shirts needs to be in back row as we are not going to find someone taller that this person. We need to place the talles in red in front in the tallest of blue
* Example:
```
Back Row:
B9 - B6 - B5 - B4 - B2
R8 - R5 - R4 - R3 - R1
Front Row
return true;
```

* PseudoCode
```
int [] blueShirts = [6, 9, 2, 4, 5]
int [] redShirts = [5, 8, 1, 3, 4]
// First Sort in reverse order
Collections.sort(redShirts, Collections.reverseOrder());
Collections.sort(blueShirts, Collections.reverseOrder());

// Determine who is in the front and back
String shirtColorInFirstRow = (redShirts.get(0) < blueShirts.get(0)) ? 'RED' : 'Blue';

// Loop to make placements
For into redShirts
    int redShirts(idx);
    int blkueShirts(idx);

    // Comparison Between Rows
    if shirtColorInFirstRow == 'RED'
        if red >= blue
            false --> Because we cannot have a red greater than a blue
    else
        if blueshirt > = red
            false --> we cant have a blue in front row

return true
```
* Code O(log(n))T and O(1)S
```
  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    // Write your code here.
		Collections.sort(redShirtHeights, Collections.reverseOrder());
		Collections.sort(blueShirtHeights, Collections.reverseOrder());
		
		// Determine who goes in front row
		String firstRowShirts = (redShirtHeights.get(0) < blueShirtHeights.get(0)) ? "RED" : "BLUE";
		
		// Loop For polacements
		for(int idx = 0; idx < redShirtHeights.size(); idx ++){
			int redShirtHeight = redShirtHeights.get(idx);
			int blueShirtHeight = blueShirtHeights.get(idx);
			if(firstRowShirts == "RED"){
				if(redShirtHeight >= blueShirtHeight){
					return false;
				}
			} else {
				if(blueShirtHeight >= redShirtHeight){
					return false;
				}
			}
		}
		return true;
  }
}
```

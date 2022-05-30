/**
        Given a string `inputString`, find the minimum number of characters to be inserted into `inputString` to make it a palindrome.
        A "Palindrome String" is one that reads the same backward as well as forward.

        Examples:
        1. Input: "ab"
        Expected output: 1
        Explanation: To convert "ab" into a palindrome, insert 'b' in the beginning (bab).
        2. Input: "aa"
        Expected output: 0
        Explanation: "aa" is already a palindrome.
        3. Input: "abcd"
        Expected output: 3
        Explanation: To convert "abcd" into a palindrome, insert 3 characters 'd', 'c' & 'b' in the beginning (dcbabcd).
        4. Input: "abcda"
        Expected output: 2
        Explanation: To convert "abcda" into a palindrome, insert 2 characters 'd' and 'c' (adcbcda).
        5. Input: "abcde"
        Expected output: 4
        Explanation: To convert "abcde" into a palindrome, insert 4 characters 'e', 'd', 'c', 'b' in the beginning (edcbabcde).

        ### Bar meeting criteria

        * Implements basic recursive algorithm considering edge cases
        * Explains time complexity and space complexity of their solution correctly

        ### Bar raising criteria

        * Implements DP solution using Memoization considering overlapping sub-problems.
        * Time complexity: O(n^2), Space complexity: O(n^2)

        ### Edge cases

        * Empty input String
        * Expected output: 0
        * String exceeding max length in their programming language
        * Expected output: exception
        * Input:  "abcda"; need insertions in the middle.
        * Expected output: 2
        * Consideration of lowercase and uppercase characters in comparison. Input: "Abcda".
        * Expected output: 0
        * Considers stack overflow as a possibility due to recursion

        #### Rubrics
        https://api.quip-amazon.com/2/blob/RBF9AA1ZNSB/3wozU5CySs9xC7TmzT2cYQ?name=SDE%20Interviewing%20Question%20Scoring%20Rubric-%20min%20inserts%20to%20make%20palindrome.DOCX&oauth_token=SVBZOU1BZ0s3aXM%3D%7C1680631358%7C7Gui9EASVw%2BjmCUvs3KkT0fgFKW1P1FoI35J8q9fBek%3D&s=fi0OAUTllkK0

        #### Solution from the internet
        https://www.geeksforgeeks.org/minimum-insertions-to-form-a-palindrome-dp-28/
 */


public class PalindromeString {
}

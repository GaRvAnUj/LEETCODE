class Solution {
    public int strStr(String haystack, String needle) {
        int hlen=haystack.length();
        int nlen=needle.length();

        if(hlen<nlen){
            return -1;
        }
        for(int i=0;i<=hlen-nlen;i++){
            if(haystack.substring(i,i+nlen).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
/*

#### 1. The Termination Condition: `i <= hLen - nLen`

This prevents the loop from iterating too far, saving computation time and preventing runtime errors.

* `hLen`: Length of the `haystack`
* `nLen`: Length of the `needle`
* **Why stop at `hLen - nLen`?** If the remaining characters left in the haystack are fewer than the total length of the needle, it is physically impossible to find a match.
* *Example:* If `haystack = "sadbutsad"` (length 9) and `needle = "sad"` (length 3), `hLen - nLen = 6`. The loop will only run from index `0` to `6`. If it tried to check index `7`, there would only be 2 characters left (`"ad"`), making a 3-character match impossible.

#### 2. Character Extraction: `haystack.substring(i, i + nLen)`

The `substring(startIndex, endIndex)` method in Java extracts a specific portion of a string.

* It **includes** the character at `startIndex`.
* It **excludes** the character at `endIndex`.
* Because it excludes the end index, `substring(i, i + nLen)` always extracts a window of text that is exactly `nLen` (the length of the needle) long.
* **When i = 0:** Extracts from index `0` to `3` $\rightarrow$ `"sad"`
* **When i = 1:** Extracts from index `1` to `4` $\rightarrow$ `"adb"`



#### 3. String Comparison: `.equals(needle)`

* In Java, you cannot use `==` to compare string text because `==` checks if they point to the same memory address.
* `.equals()` performs a proper structural comparison, evaluating the actual characters inside the strings step-by-step.

#### 4. Returning the Index: `return i;`

* Because the loop starts at index `0` and steps forward sequentially (`i++`), the very first time `.equals(needle)` returns `true`, it is guaranteed to be the **first occurrence**.
* Returning `i` immediately terminates the function and passes back the correct starting index.

*/
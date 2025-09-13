# 6. Zigzag Conversion

# [Descrição](https://leetcode.com/problems/zigzag-conversion/description)

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P     A   H   N

A  P  L S I I G

Y     I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

- Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"


- Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"

- Example 3:

Input: s = "A", numRows = 1
Output: "A"

# Java21

```java
class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] linhas = new StringBuilder[numRows];
        if (numRows==1){
            return s;
        }
        for(int i =0; i<numRows;i++){
            linhas[i] = new StringBuilder(); 
        }
        boolean otherDir = false;
        int countRow = 0;
        for(int i = 0; i<s.length();i++){
            linhas[countRow].append(s.charAt(i));
            if(countRow == 0){
                otherDir = false;
            }else if (countRow == numRows - 1){
                otherDir = true;
            }
            if(otherDir == false) {
                countRow +=1;
            }else{ 
                countRow -=1;
                }
        }
        StringBuilder resultado = new StringBuilder();
        for (StringBuilder word : linhas) {
            resultado.append(word);
        }
        return resultado.toString();
    }
}```

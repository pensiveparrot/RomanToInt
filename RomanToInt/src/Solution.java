import java.util.Scanner;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//
//For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//    I can be placed before V (5) and X (10) to make 4 and 9. 
//    X can be placed before L (50) and C (100) to make 40 and 90. 
//    C can be placed before D (500) and M (1000) to make 400 and 900.
//
//Given a roman numeral, convert it to an integer.
//
// 
//
//Example 1:
//
//Input: s = "III"
//Output: 3
//Explanation: III = 3.
//
//Example 2:
//
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.
//
//Example 3:
//
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
//
// 
//
//Constraints:
//
//    1 <= s.length <= 15
//    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
//    It is guaranteed that s is a valid roman numeral in the range [1, 3999].
//


public class Solution {
	
    public int romanToInt(String s) {

    	int romanNumeral=0;
    	if(s.length()<1 || s.length()>15)
    		return -1;
    	if(s.contains("IV") )
    	{
    		romanNumeral+=4;
    	s= s.replace("IV","");
    	}
    	if(s.contains("IX")) {
    		romanNumeral+=9;
    		s=s.replace("IX","");
    	}
    	if(s.contains("CM"))
    	{
    		romanNumeral+=900;
    		s=s.replace("CM","");
    	}
    	if(s.contains("XC"))
    	{
    		romanNumeral+=90;
    		s=s.replace("XC", "");
    	}
    	if(s.contains("CD"))
    	{
    		romanNumeral+=400;
    		s=s.replace("CD", "");
    	}
    	if(s.contains("XL"))
    	{
    		romanNumeral+=40;
    		s=s.replace("XL", "");
    	}
    	
        for(int i=0;i<s.length();i++){
        char r =s.toUpperCase().charAt(i);
            switch(r) {
            	case 'I':
            		romanNumeral+=1;
            		break;
                   	
            	case 'V':
            	
            		romanNumeral+=5;
            		break;
            	
            	case 'X':
            	
            		romanNumeral+=10;
            		break;
            	
            	case 'L':
            	
            		romanNumeral+=50;
            		break;
            	
            	case 'C':
            		romanNumeral+=100;
            		break;
            	
            	case 'D':
            		romanNumeral+=500;
            		break;
            	
            	case 'M':
            		romanNumeral+=1000;
            		break;
            	
            	default:
            		break;
            	
            }
        }
        
        return (romanNumeral);
    }
    public static void main(String args[]) {
    	Solution s = new Solution();
    	System.out.println("Enter a valid Roman Numeral to convert to Integer: ");
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println(s.romanToInt(input.next()));
    }
}
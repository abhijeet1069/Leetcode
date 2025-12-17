package leetcode.strings;

/**
 * Running time complexity = O(wholeLen*partLen)
 * */

public class StringMatching {
	public static int contains(String part, String whole) {
		int partLen = part.length();
		int wholeLen = whole.length();
		
		for(int i = 0; i <= (wholeLen-partLen); i++) {
			int j = 0;
			while((j < partLen) && whole.charAt(i+j) == part.charAt(j)) //Comparison is being done at each index
				j++;
			if(j == partLen)
				return i;
		}
		return -1;
	}
}

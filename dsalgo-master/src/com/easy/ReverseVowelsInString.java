package com.easy;

public class ReverseVowelsInString {
	// https://leetcode.com/problems/reverse-vowels-of-a-string/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("leetcode"));
	}
	
	public static String reverseVowels(String s) {
		if (s == null || s.isEmpty()) return s;
		int strLength = s.length();
		char[] str = s.toCharArray();
		int headPtr = 0, tailPtr = strLength - 1;
		char head, tail;
		boolean headFound = false, tailFound = false;
		int headFoundIndex = -1, tailFoundIndex = -2;
		while (headPtr < tailPtr) {
			if (!headFound) {
				head = str[headPtr];
				if (head == 'a' || head == 'e' || head == 'i' || head == 'o' || head == 'u' ||
						head == 'A' || head == 'E' || head == 'I' || head == 'O' || head == 'U') {
					headFound = true;
					headFoundIndex = headPtr;
				} else {
					headPtr++;
				}
			}
			if (!tailFound) {
				tail = str[tailPtr];
				if (tail == 'a' || tail == 'e' || tail == 'i' || tail == 'o' || tail == 'u' ||
						tail == 'A' || tail == 'E' || tail == 'I' || tail == 'O' || tail == 'U') {
					tailFound = true;
					tailFoundIndex = tailPtr;
				} else {
					tailPtr--;
				}
			}
			if (headFound && tailFound) {
				char temp = str[headFoundIndex];
				str[headFoundIndex] = str[tailFoundIndex];
				str[tailFoundIndex] = temp;
				headFound = false;
				tailFound = false;
				headPtr++;
				tailPtr--;
			}
		}
		return new String(str);
    }

}

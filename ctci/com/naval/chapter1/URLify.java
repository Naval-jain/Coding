package com.naval.chapter1;

public class URLify {

	public static String replace(char[] str, int trueLength) {

		int spaceCount = 0;

		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ')
				spaceCount++;
		}

		int length = trueLength + spaceCount * 2;

		int index = length - 1;
		for (int i = trueLength - 1; i >= 0; i--) {

			if (str[i] == ' ') {
				str[index] = '0';
				str[index - 1] = '2';
				str[index - 2] = '%';
				index -= 3;

			} else {
				str[index] = str[i];
				index--;
			}

		}

		return str.toString();

	}
	
	public static void main(String[] args) {
		char [] str = "Mr John Smith    ".toCharArray();
		System.out.println(replace(str, 13).toString());
	}

}

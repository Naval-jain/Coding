package com.naval.chapter1;

public class StringPermutation {

	public boolean isStringPermutation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		int arr[] = new int[128];

		for (int i = 0; i < s1.length(); i++) {
			++arr[s1.charAt(i)];
		}

		for (int i = 0; i < s2.length(); i++) {

			--arr[s2.charAt(i)];
			if (arr[s2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		StringPermutation permute = new StringPermutation();
		System.out.println(permute.isStringPermutation("naval", "cavan"));
	}

}

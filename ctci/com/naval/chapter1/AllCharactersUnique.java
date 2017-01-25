package com.naval.chapter1;

public class AllCharactersUnique {

	public boolean isUnique(String input) {
		if (input.length() <= 0)
			throw new IllegalArgumentException("Empty String not Alloweda");

		int cache = 0;

		for (int i = 0; i < input.length(); i++) {
			int value = input.charAt(i) - 'a';
			int flag = 1 << value;

			if ((cache & flag) > 0) {
				return false;
			} else
				cache |= flag;
		}
		return true;

	}
	
	
	
	public static void main(String[] args) {
		AllCharactersUnique chars = new AllCharactersUnique();
		System.out.println(chars.isUnique("naval"));
	}

}

package com.naval.chapter1;

import java.util.Arrays;

public class PalindronePermutation {

	public static void main(String[] args) {
		int[] table = buildFrequencyTable("navanl");
		System.out.println(checkEvenOdd(table));
	}

	public static int[] buildFrequencyTable(String input) {

		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		Arrays.fill(table, 0);

		for (char c : input.toCharArray()) {
			table[c - 'a']++;
		}
		return table;
	}

	public static boolean checkEvenOdd(int[] table) {
		boolean oddOccured = false;
		for (int i : table) {
			if (i % 2 == 1) {
				if (oddOccured)
					return false;
				oddOccured = true;
			}

		}
		return true;
	}

}

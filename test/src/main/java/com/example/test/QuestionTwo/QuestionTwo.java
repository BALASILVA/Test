package com.example.test.QuestionTwo;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.springframework.util.StringUtils;

public class QuestionTwo {

	public static void main(String[] args) {
		List<Integer> processTimes = new ArrayList();
		int KEY_LENGTH = 20;
		try {
			File myObj = new File(
					"D:\\Bala\\Test 02\\SC\\Test\\test\\src\\main\\java\\com\\example\\test\\QuestionTwo\\text.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				if (!StringUtils.isEmpty(line)) {
					if (line.contains("ProcessingTimeTook:")) {

						int index = line.lastIndexOf("ProcessingTimeTook:");
						int startIndex = index + KEY_LENGTH;
						int endIndex = findEndIndex(startIndex, line);
						processTimes.add(Integer.parseInt(line.substring(startIndex, endIndex)));

					}

				}

			}
			System.out.println("Max Time" + Collections.max(processTimes));
			System.out.println("Average  Time" + getAverage(processTimes));
			myReader.close();
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	private static int findEndIndex(int startIndex, String line) {
		for (int i = startIndex; i < line.length(); i++) {
			if (line.charAt(i) == ' ')
				return i;
		}
		return line.length();
	}

	private static double getAverage(List<Integer> list) {
		return list.stream().mapToInt(a -> a).average().orElse(0);
	}
}

package com.myproject.reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
	
	public static void main(String[] args) {
		System.out.println(reverse("HEllo world"));
	}
	
	public String reverseText(String input) {
		
		List<String> wordList = new ArrayList<String>();
		Collections.addAll(wordList, input.split(" "));
		StringBuilder text = new StringBuilder();
		
		for(int i = wordList.size() - 1; i >= 0; i--) {
			text.append(" ").append(wordList.get(i));
		}
		
		return text.reverse().toString();
		
	}
	
	public static String reverse(String input) { 

		  String inputWords[] = input.split(" ");
		  String outputWords[] = new String[inputWords.length];
		  int i = 0;

		  for (String inputWord : inputWords) {

			  String reverse = new StringBuilder(inputWord).reverse().toString();
			  outputWords[i] = reverse;
			  i++;

		  }

		  return String.join(" ", outputWords);

	}
	
}

package googlevsopenai;

/*
 * File: Comparison.java
 * By: AJ Arce
 * Date: September 13th, 2024
 * 
 * Description: This program goes through a for loop of an array to display 5 differences betweeen Google Bard and ChatGPT.
 * 
 */

public class Comparison {

	public static void main(String[] args) {
		
		String compare1 = "1. Google Bard AI will be able to answer real-time questions. ChatGPT responses are based on data available till 2021.";
		String compare2 = "2. Using Google Bard AI requires a minor adjustment to the Google settings to get regular search results, while ChatGPT returns only text responses.";
		String compare3 = "3. Google Bard is based on LaMDA, while ChatGPT is based on GPT.";
		String compare4 = "4. ChatGPT has its own plagarism detector (AI Text Classifier), a feature not yet available for Google Bard.";
		String compare5 = "5. Google Bard AI is completely free for now. ChatGPT Plus is a newly introduced paid plan by OpenAI.";
		
		String [] stringArray = {compare1, compare2, compare3, compare4, compare5}; 
		
		System.out.println("Google Bard vs ChatGPT: Five Differences To Consider");
		
		for (int i = 0; i < stringArray.length; i++  ) {
			System.out.println(stringArray[i]);
		}
	}

}

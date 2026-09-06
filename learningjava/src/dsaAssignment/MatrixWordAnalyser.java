package dsaAssignment;

import StudentClass.mainclass;

public class MatrixWordAnalyser {

	static String findLongestWord(String[][] words) {
		int i,j;
		String maxWord=null;
		//int temp=0;
		int tempLengthTotal=0;
		int wordlength=0;
		String word=null;

		for(i=0;i<words.length;i++) {
			wordlength=0;
			//System.out.println("length is "+words[i].length);
			for (j=0;j<words[i].length;j++) {
				word=words[i][j];
				wordlength=word.length();
				//System.out.println("wordlength = "+wordlength);
				if(tempLengthTotal < wordlength) {
					tempLengthTotal=wordlength;
					maxWord=word;
					System.out.println("row total in "+  maxWord);

				}

			}

		}
		return maxWord;
	}
	public static void main(String args[]) {
		//String[][] words = { {"cat","elephant","dog"},{"tiger","lion","giraffe"},{"ant","horse","fox"}		};
		String[][] words = { {"apple","mango"},{"grape","melon"},{"peach","berry"}		};

		System.out.println(findLongestWord(words));
	}



}

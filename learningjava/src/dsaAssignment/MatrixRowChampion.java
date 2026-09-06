package dsaAssignment;

import StudentClass.mainclass;

public class MatrixRowChampion {

	static int findChampion(int[][] marks) {
		int i,j;
		int rowtotal=0;
		//int temp=0;
		int tempIndex=0;
		int tempTotal=0;
		//System.out.println(marks.length);

		for(i=0;i<marks.length;i++) {
			//temp=0;
			rowtotal=0;
			for (j=0;j<marks[i].length;j++) {
				rowtotal=rowtotal+ marks[i][j];
			}
		//	System.out.println("row total"+  rowtotal);

			if(tempTotal < rowtotal) {
				tempIndex=i;
				tempTotal=rowtotal;
			//	System.out.println("row total in"+  rowtotal);
				//return temp;
			}

		}
		return tempIndex;
	}
	public static void main(String args[]) {
		int[][] marks = { {10,20,30},{25,15,20},{30,10,20},{15,25,35}		};
		//int[][] marks = { {20,30},{25,25},{10,40}		};

		System.out.println(findChampion(marks));
	}

}

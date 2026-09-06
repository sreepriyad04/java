package dsaAssignment;

public class StudentMarksAnalyser {

	public int getScoreRange(int[] marks) {

		int highest=0;
		int length=0;
		boolean allAbsentFlag= true;

		for(int i=0;i<marks.length;i++) {
			if(marks[i]==-1) {

			}
			else {
				highest=marks[i];
				length=marks[i];
				allAbsentFlag=false;
				break;

			}

		}

		for(int i=0;i<marks.length;i++) {
			if(marks[i]==-1) {
				//	System.out.println("0"+marks[i]);

			}

			else if(highest<marks[i]) {
				highest=marks[i];	
				//System.out.println("1 "+marks[i]);
				allAbsentFlag=false;

			}
			else if(length>marks[i]) {
				length=marks[i];
				//System.out.println("2 "+marks[i]);
				allAbsentFlag=false;
			}
			else if (highest==marks[i] || length==marks[i]) {

			}

		}
		if(allAbsentFlag==true)
			return -1;
		else
			return highest-length;

	}
	public static void main(String[] args) {
		StudentMarksAnalyser st=new StudentMarksAnalyser();
		int[] marks= {72,-1,45,90,63,-1,81};
		//int[] marks= {-1,-1,-1};
		//int[] marks=  {-1, -1, 45, 90};
		System.out.println("from main scorerange is " +st.getScoreRange(marks));
	}

}

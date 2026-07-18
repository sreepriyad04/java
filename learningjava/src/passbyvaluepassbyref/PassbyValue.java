package passbyvaluepassbyref;
class PassbyValue{
	int a=10;
	String passref="pass ref";
		
	void change(int a) {
		a=5;
		System.out.println("from method  " +a );
	}
	
	void passbyrefMtd()
	{
		passref="updatedref";
		System.out.println("from the  method = "+passref);
	}
}
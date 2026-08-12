package exception;


public class CustomException {
	
	private static void BookNameValidator(String bookName) throws InvalidBookNameException {
		// TODO Auto-generated method stub
		if(bookName.startsWith("Scaler java")){
			System.out.println("Book created! "+bookName);
		}
		else {
			throw new InvalidBookNameException("invalid book  name");
		}
		
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		BookNameValidator("Scaler java new Book");
		}
		catch(InvalidBookNameException e) {
			System.out.println(e);
			
		}
	}

	

}

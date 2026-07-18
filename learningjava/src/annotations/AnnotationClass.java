package annotations;

import java.util.ArrayList;
import java.util.List;

public class AnnotationClass {  // provides metadata to the compiler and JVM about the program

	//  @override used for method overriding
	// @Deprecated - marks the class as outdated
	// @SupressWarnings  -  to supress compiler warnings
	
	@SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String args[]) {
		List list= new ArrayList();
		list.add("str");
		List<String> names = list;
		
	}
}

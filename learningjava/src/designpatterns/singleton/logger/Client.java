package designpatterns.singleton.logger;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerImpl logimp= LoggerImpl.getInstance();
		LoggerImpl logimp2= LoggerImpl.getInstance();
		//logimp.log(LogLevel.WARN, "before set file");
		logimp.setLogFile("C:\\Users\\SripriyD\\eclipse-workspace\\learningjava\\src\\designpatterns\\singleton\\logger\\SingletonLogFile.log");
		logimp.log(LogLevel.INFO, "first instance");
		logimp.log(LogLevel.ERROR, "next line");
		System.out.println(logimp.getInstance());
		System.out.println(logimp2.getInstance());  // both the object reference is same hence singleton is working
		//System.out.println(logimp.);
		logimp2.log(LogLevel.DUBUG, " second object refernece");
		logimp.flush();
		

	}

}

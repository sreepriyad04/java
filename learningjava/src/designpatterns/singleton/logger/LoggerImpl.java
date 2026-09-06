package designpatterns.singleton.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

//import org.springframework.boot.logging.LogLevel;

public class LoggerImpl implements Logger {
	
	private static LoggerImpl loggerImpl;
	private String logFilePath;
	private FileWriter fileWriter;
	private PrintWriter printWriter=null;
	LocalDateTime date = LocalDateTime.now();	
	
	
	private LoggerImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static  LoggerImpl getInstance() {
		if(loggerImpl==null) {
			loggerImpl = new LoggerImpl();
			return loggerImpl;
		}
		return loggerImpl;
		
	}
	
	public static void resetInstance() {
		if(loggerImpl!=null) {
			loggerImpl=null;
		}
	}

	@Override
	//public void log(LogLevel level, String message) {  	// to use LogLevel my application should be sprintboot app, since im using java project im creating enum class
		public void log(LogLevel level, String message) {
		// TODO Auto-generated method stub
		if(printWriter==null) {
			throw new IllegalStateException("Set FilePath first");
		}else {
			printWriter.append(date+" "+ level+ " "+message+"\n");
		}
	}

	@Override
	public void setLogFile(String filePath) {
		// TODO Auto-generated method stub
		logFilePath=filePath;
		try {
			fileWriter= new FileWriter(filePath);
			File file = new File(filePath);
					
			System.out.println("Inside setLogFile");
			System.out.println(file.exists());
			printWriter=new PrintWriter(fileWriter);
			System.out.println(System.getProperty("user.dir"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String getLogFile() {
		// TODO Auto-generated method stub
		return logFilePath;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		printWriter.flush();
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		printWriter.close();
		
	}

}

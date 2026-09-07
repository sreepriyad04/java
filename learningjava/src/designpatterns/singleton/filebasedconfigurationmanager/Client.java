package designpatterns.singleton.filebasedconfigurationmanager;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileBasedConfigurationManager obj= FileBasedConfigurationManagerImpl.getInstance();
		obj.load("C:\\Users\\SripriyD\\eclipse-workspace\\learningjava\\src\\designpatterns\\singleton\\filebasedconfigurationmanager\\config.properties");
		
		System.out.println(obj.getConfiguration("Name"));
		obj.setConfiguration("Contact","1236547");
		FileBasedConfigurationManager obj2= FileBasedConfigurationManagerImpl.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj2.getConfiguration("Contact"));
		System.out.println(obj.getConfiguration("Id",Integer.class));

	}

}

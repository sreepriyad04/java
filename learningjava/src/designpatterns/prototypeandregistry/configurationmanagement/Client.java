package designpatterns.prototypeandregistry.configurationmanagement;

import designpatterns.prototypeandregistry.classproblem.GameConfig;
import designpatterns.prototypeandregistry.classproblem.GameType;

public class Client {

	public static void main(String[] args) {
		ConfigPrototypeRegistryImpl register=new ConfigPrototypeRegistryImpl();
		TemplateConfig.fillRegistry(register);
		
		// Configuration DB = TemplateConfig.registry.retrieve(ConfigTypes.DATABASE).clone();
		 Configuration DB = register.retrieve(ConfigTypes.DATABASE).clone();

	        //Step3: Customize the cloned object
	       // europeMatch.setServerRegion("Europe");
		 
		 System.out.println(DB.getConfigId());
		 DB.setConfigId("DBID2");
		 System.out.println("after update" +DB.getConfigId());
		
	}
}

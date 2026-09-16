package designpatterns.prototypeandregistry.configurationmanagement;

public class TemplateConfig {
	//public static ConfigPrototypeRegistryImpl registry = new ConfigPrototypeRegistryImpl();
	
	public static void fillRegistry(ConfigPrototypeRegistryImpl registry) {
		Configuration databaseConfig=new Configuration();
		databaseConfig.setConfigId("DBId");
		databaseConfig.setConfigName("DB Config Name");
		databaseConfig.setConfigValue("config value");
		databaseConfig.setEnabled(true);
		databaseConfig.setType("DB");
		registry.add(ConfigTypes.DATABASE, databaseConfig);
		
		Configuration cacheConfig=new Configuration();
		cacheConfig.setConfigId("cache Id");
		cacheConfig.setConfigName("cache name");
		cacheConfig.setConfigValue("value");
		cacheConfig.setEnabled(false);
		cacheConfig.setType("CACHE");
		registry.add(ConfigTypes.CACHE, cacheConfig);
		
	}
	

}

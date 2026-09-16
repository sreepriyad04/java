package designpatterns.prototypeandregistry.configurationmanagement;

public interface ConfigurationPrototypeRegistry {
	
	public void add(ConfigTypes type, Configuration configuration);
	public Configuration retrieve(ConfigTypes type);
	public  Configuration cloneConfiguration(ConfigTypes type);
	

}

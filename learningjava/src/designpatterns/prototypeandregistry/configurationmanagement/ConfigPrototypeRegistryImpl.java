package designpatterns.prototypeandregistry.configurationmanagement;

import java.util.HashMap;

public class ConfigPrototypeRegistryImpl implements ConfigurationPrototypeRegistry{

	private HashMap<ConfigTypes,Configuration> prototype;
	
	public ConfigPrototypeRegistryImpl() {
		
		prototype = new HashMap<>();
		
		}
	
	@Override
	public void add(ConfigTypes type, Configuration configuration) {
		// TODO Auto-generated method stub
		prototype.put(type, configuration);
		
	}

	@Override
	public Configuration retrieve(ConfigTypes type) {
		// TODO Auto-generated method stub
		return prototype.get(type);
	}

	@Override
	public Configuration cloneConfiguration(ConfigTypes type) {
		// TODO Auto-generated method stub
		if(!prototype.containsKey(type)) {
			return null;
		}
		
		Configuration clonnedObject = prototype.get(type);
		return clonnedObject.clone();
	}
	
	

}

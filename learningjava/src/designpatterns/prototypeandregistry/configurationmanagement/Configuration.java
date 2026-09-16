package designpatterns.prototypeandregistry.configurationmanagement;

public class Configuration implements Configurable{
	
	private String configId;
	private String configName;
	private String configValue;
	private String type;
	private boolean isEnabled;
	
	public Configuration(Configuration configuration) {
		// TODO Auto-generated constructor stub
		this.configId=configuration.configId;
		this.configName=configuration.configName;
		this.configValue=configuration.configValue;
		this.isEnabled=configuration.isEnabled;
		this.type=configuration.type;
	
	}

	public Configuration() {
		// TODO Auto-generated constructor stub
	}

	public Configuration clone() {
		return new Configuration(this);
		
	}

	public String getConfigId() {
		return configId;
	}

	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	

}

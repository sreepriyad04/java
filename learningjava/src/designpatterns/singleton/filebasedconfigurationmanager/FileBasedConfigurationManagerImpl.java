package designpatterns.singleton.filebasedconfigurationmanager;

import java.util.Properties;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
	
	private static FileBasedConfigurationManagerImpl fileBasedConfigurationManagerImpl;
	
	
	

    private FileBasedConfigurationManagerImpl() {
		super();
//		this.fileBasedConfigurationManagerImpl = fileBasedConfigurationManagerImpl;
	}
    

	@Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
		String keyValue= (String) properties.get(key);
		if(keyValue==null) {
		
        throw new UnsupportedOperationException(" Key was not found");
		}
        return keyValue;
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
    	return convert(getConfiguration(key),type);
    //    throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
    	properties.setProperty(key, value);
      //  throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");  // because method return type is void
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
    	setConfiguration(key, value.toString());
      //  throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
        
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
    	properties.remove(key);
    //    throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
    	properties.clear();
    //    throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
	if(fileBasedConfigurationManagerImpl == null) {
    		
    		fileBasedConfigurationManagerImpl=new FileBasedConfigurationManagerImpl();
//    		return fileBasedConfigurationManagerImpl;
    		
    	}
    	return fileBasedConfigurationManagerImpl;
        
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
    	fileBasedConfigurationManagerImpl=null;
    }

}

package designpatterns.prototypeandregistry.socialmediaplatform;

import java.util.HashMap;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {
	
	public HashMap<MediaType, User> hashmap;
	
	public UserPrototypeRegistryImpl() {
		super();
		hashmap=new HashMap<MediaType, User>();
		
	}

	
	@Override
	public void add(MediaType type, User user) {
		// TODO Auto-generated method stub
		hashmap.put(type, user);
		
	}

	@Override
	public User retieve(MediaType type) {
		// TODO Auto-generated method stub
		return hashmap.get(type);
		
	}

	@Override
	public User cloneObject(MediaType type) {
		// TODO Auto-generated method stub
		if(hashmap.get(type) != null) {
			return hashmap.get(type).clone();
		}
		return null;
	}
	

}

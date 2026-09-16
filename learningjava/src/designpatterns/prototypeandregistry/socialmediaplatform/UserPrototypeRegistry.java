package designpatterns.prototypeandregistry.socialmediaplatform;

public interface UserPrototypeRegistry {
	
	public void  add(MediaType type,User user);
	public User retieve(MediaType type);
	public User cloneObject(MediaType type);
	

}

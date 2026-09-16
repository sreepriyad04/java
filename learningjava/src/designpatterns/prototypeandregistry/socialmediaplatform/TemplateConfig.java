package designpatterns.prototypeandregistry.socialmediaplatform;

public class TemplateConfig {
	
	public static void fillRegistry(UserPrototypeRegistryImpl registry) {
		User standardPrototype  = new User();
		standardPrototype.setAge(10);
		standardPrototype.setDisplayName("name");
		standardPrototype.setEmail("email@gmail.com");
		standardPrototype.setUserId("userId1");
		standardPrototype.setUsername("Name");
		
		registry.add(MediaType.STANDARD, standardPrototype);
	}

}

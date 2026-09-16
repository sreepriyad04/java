package designpatterns.prototypeandregistry.socialmediaplatform;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserPrototypeRegistryImpl reg = new UserPrototypeRegistryImpl();
		TemplateConfig.fillRegistry(reg);
		
		User user= reg.retieve(MediaType.STANDARD).clone();
		
		
		System.out.println(user.getAge());
		System.out.println(user.getDisplayName());
	}

}

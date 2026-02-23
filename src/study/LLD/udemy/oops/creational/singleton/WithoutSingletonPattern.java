package study.LLD.udemy.oops.creational.singleton;

//Problem: We have to take config value and we have to use single instance of that object 
// 	to restrict multiple object creation that reduces memory usage
public class WithoutSingletonPattern {
	public static void main(String[] args) {
		AppSettings app1 = new AppSettings();
		System.out.println(app1);
		
		AppSettings app2 = new AppSettings();
		System.out.println(app2);
		
		System.out.println("Object same : "+app1.equals(app2));
	}
}

class AppSettings {
	private String configurationURL;

	public AppSettings() {
		// coming from config
		configurationURL = "http://localhost/8080";
	}

	public String getConfigURL() {
		return configurationURL;
	}
}
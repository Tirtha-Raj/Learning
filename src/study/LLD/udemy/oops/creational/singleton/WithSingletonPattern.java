package study.LLD.udemy.oops.creational.singleton;

public class WithSingletonPattern {
	public static void main(String[] args) {
		AppSettingsV2 app1 = AppSettingsV2.getAppInstance();
		System.out.println(app1.getConfigURL());

		AppSettingsV2 app2 = AppSettingsV2.getAppInstance();
		System.out.println(app2.getConfigURL());
		
		System.out.println("Object same : " + app1.equals(app2));
	}
}

class AppSettingsV2 {
	private static AppSettingsV2 appSettingsInstance;
	private String connfigUrl;

	private AppSettingsV2() {
		// coming from config
		connfigUrl = "http://localhost/8080";
	}

	public static AppSettingsV2 getAppInstance() {
		if (appSettingsInstance != null) {
			return appSettingsInstance;
		}
		appSettingsInstance = new AppSettingsV2();
		return appSettingsInstance;
	}

	public String getConfigURL() {
		return connfigUrl;
	}
}
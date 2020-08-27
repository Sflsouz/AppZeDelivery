package aplicacao;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Setup {

	private JSONParser parser;
	private JSONObject json;
	private String automationName;
	private String udid;
	private String platformName;
	private String deviceName;
	private String appPackage;
	private String appActivity;
	private String autoGrantPermissions;
	private String autoAcceptAlerts;
	private boolean noReset;
	private String app;
	private static String email;
	private static String senha;
	private static String plataforma;
	private static String APPID;

	public Setup() throws IOException {
		lerArquivoProperties();
		definirPlataformaMobile();
	}

	public static String getAPPID() {
		return APPID;
	}

	public void setAPPID(String _APPID) {
		Setup.APPID = _APPID;
	}

	public String getAutomationName() {
		return automationName;
	}

	public String getUdid() {
		return udid;
	}
	

	public String getAutoGrantPermissions() {
		return autoGrantPermissions;
	}

	public String getAutoAcceptAlerts() {
		return autoAcceptAlerts;
	}

	public String getPlatformName() {
		return platformName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public String getAppPackage() {
		return appPackage;
	}

	public String getAppActivity() {
		return appActivity;
	}

	public boolean isNoReset() {
		return noReset;
	}

	public String getApp() {
		return app;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String _plataforma) {
		Setup.plataforma = _plataforma;
	}
	
	public static String getEmail() {
		return email;
	}

	public void setEmail(String _email) {
		Setup.email = _email;
	}
	
	public static String getSenha() {
		return senha;
	}

	public void setSenha(String _senha) {
		Setup.senha = _senha;
	}

	public void lerArquivoProperties() throws IOException {
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("properties");
		properties.load(file);
		setPlataforma(properties.getProperty("properties.plataforma").toUpperCase());
		setAPPID(properties.getProperty("properties.apiKey").toUpperCase());
		setEmail(properties.getProperty("properties.email"));
		setSenha(properties.getProperty("properties.senha"));
	}

	public void definirPlataformaMobile() throws IOException {
		parser = new JSONParser();
		try {
			if (getPlataforma().equals("ANDROID")) {
				json = (JSONObject) parser.parse(new FileReader("Android.json"));
				setCaps();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setCaps() throws IOException {
		automationName = (String) json.get("automationName");
		udid = (String) json.get("udid");
		platformName = (String) json.get("platformName");
		deviceName = (String) json.get("deviceName");
		appPackage = (String) json.get("appPackage");
		appActivity = (String) json.get("appActivity");
		noReset = (Boolean) json.get("noReset");
		app = (String) json.get("app");
		autoGrantPermissions = (String) json.get("autoGrantPermissions");
		autoAcceptAlerts = (String) json.get("autoAcceptAlerts");
	}

}

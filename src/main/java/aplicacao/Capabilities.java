package aplicacao;

import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;

import apoio.Utils;

public class Capabilities {
	private DesiredCapabilities cap;

	public Capabilities() throws IOException {
	    Utils.log("Iniciando aplicativo...");
		Setup setcap = new Setup();
		cap = new DesiredCapabilities();
		cap.setCapability("automationName", setcap.getAutomationName());
		cap.setCapability("udid", setcap.getUdid());
		cap.setCapability("platformName", setcap.getPlatformName());
		cap.setCapability("deviceName", setcap.getDeviceName());
		cap.setCapability("appPackage", setcap.getAppPackage());
		cap.setCapability("appActivity", setcap.getAppActivity());
		cap.setCapability("noReset", setcap.isNoReset());
		cap.setCapability("app", setcap.getApp());
		cap.setCapability("autoGrantPermissions", setcap.getAutoAcceptAlerts());
		cap.setCapability("autoAcceptAlerts", setcap.getAutoGrantPermissions());
	}

	public DesiredCapabilities getCapabilites() {
		return cap;
	}
}

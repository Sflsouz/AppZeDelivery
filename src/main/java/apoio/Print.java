package apoio;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import aplicacao.Hooks;
import io.cucumber.core.api.Scenario;

public class Print {
	
	public static void printarTela(Scenario scenario) {
		File file = ((TakesScreenshot)Hooks.driver).getScreenshotAs(OutputType.FILE);
		final byte[] printela = ((TakesScreenshot)Hooks.driver).getScreenshotAs(OutputType.BYTES);
		 try {
			 scenario.embed(printela,"image/png");
			if(scenario.isFailed()) {
				FileUtils.copyFile(file, (new File("./evidencias", scenario.getName() + " - " + scenario.getStatus() + ".png")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

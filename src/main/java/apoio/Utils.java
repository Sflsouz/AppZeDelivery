package apoio;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import aplicacao.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utils {
	private static final Logger log = LogManager.getLogger("Zé");

	public static void log(String texto) {
		log.info(texto);
	}

	public static void logErro(String texto) {
		log.error(texto);
	}

	public static void aguardarElementoVisivel(MobileElement element) {
		new WebDriverWait(Hooks.driver, 20).until(ExpectedConditions.visibilityOf(element));
		
	}

	public static void fecharTeclado() {
		Hooks.driver.hideKeyboard();
	}

	public static float converterStringFloat(String texto) {
		String vlr = texto.replaceAll("[^,?0-9.]", "");
		vlr = vlr.replaceAll(",", ".");
		float valor = Float.parseFloat(vlr);
		return valor;
	}

	public static void scroll(double inicio, double fim) {
		Dimension size = Hooks.driver.manage().window().getSize();
		int x = size.width / 2;
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);

		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(Hooks.driver);
		WaitOptions wait = new WaitOptions();
		wait.withDuration(Duration.ofMillis(500));

		action.press(PointOption.point(x, start_y)).waitAction(wait).moveTo(PointOption.point(x, end_y)).release()
				.perform();
	}
	
	public static String arredondarPraCima(float valor) {
		DecimalFormat df = new DecimalFormat("0.0#");
		df.setRoundingMode(RoundingMode.HALF_UP);
		return df.format(valor);
	}
	
	public static void aguardarSegundos(int segundos) throws InterruptedException {
		int seg = 1000*segundos;
		Thread.sleep(seg);
	}
}

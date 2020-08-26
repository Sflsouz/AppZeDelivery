package acoes.onboarding;

import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.onboarding.TelaIndroducao;

public class AcoesIntroducao extends TelaIndroducao {

	public AcoesIntroducao(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clicarBotaoIntroducao() throws InterruptedException{
		Utils.aguardarSegundos(20);
		botaoPularIntroducao.click();
		Utils.log("Pular Indrodução");
	}
}

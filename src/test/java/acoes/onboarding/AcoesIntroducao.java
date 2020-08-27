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
		try {
			botaoPularIntroducao.click();
			Utils.log("Pular Indrodu��o");
		} catch (Exception e) {
			Utils.log("Tela de Introdu��o n�o apresentada!");
		}
		
	}
}

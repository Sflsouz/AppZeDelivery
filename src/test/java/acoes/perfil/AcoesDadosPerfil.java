package acoes.perfil;

import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.perfil.TelaDadosPerfil;

public class AcoesDadosPerfil extends TelaDadosPerfil{

	private String acao = "Perfil";
	
	public AcoesDadosPerfil(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void validarMeuPerfil() {
		Utils.aguardarElementoVisivel(opcaoMeusPedidos);
		opcaoMeusPedidos.isDisplayed();
		opcaoSair.isDisplayed();
		Utils.log(acao +": Meu Perfil Validado!");
		botaoVoltar.click();
	}

}

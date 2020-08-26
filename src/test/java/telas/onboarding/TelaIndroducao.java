package telas.onboarding;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaIndroducao extends TelaApp {

	public TelaIndroducao(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(accessibility = "onboarding-secondary-action-button")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoPularIntroducao;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  textoIntroducao;
	
}

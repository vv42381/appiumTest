/*
 * Copyright 2018 Elias Nogueira
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hfnunifiedtest.po;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainScreenPageObject {
	//SignInModal signIn;
	//BaseTest baseTest;
	AppiumDriver<?> driver;
	/*
        @AndroidFindBy(id = "org.traeg.fastip:id/billAmtEditText")
        @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
        @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
        MobileElement billAmount;

        @AndroidFindBy(id = "org.traeg.fastip:id/calcTipButton")
        @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
        @FindBy(id = "calcTip")
        MobileElement calculateTip;

        @AndroidFindBy(id = "org.traeg.fastip:id/tipAmtTextView")
        @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
        @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
        MobileElement tipAmount;

        @AndroidFindBy(id = "org.traeg.fastip:id/totalAmtTextView")
        @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[4]")
        @WithTimeout(time = 10, unit = TimeUnit.SECONDS)
        MobileElement totalAmount;
    */
	public MainScreenPageObject(AppiumDriver<?> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "com.hfn.unified:id/btn_wel_sign_in")
	//@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
			MobileElement signInBtn;

	@AndroidFindBy(id = "com.hfn.unified:id/btn_wel_sign_up")
	//@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
			MobileElement signUpBtn;

	@AndroidFindBy(id = "com.hfn.unified:id/btn_google_signin")
	//@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
			MobileElement gPlus;

	@AndroidFindBy(id = "com.google.android.gms:id/account_name")
	//@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
			List<MobileElement> gAccount;

	public void clickSignIn() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/btn_wel_sign_in")));
		signInBtn.click();
		//return new SignInModal();
		//signIn.clickGPlus();
	}

	public void clickSignUp() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/btn_wel_sign_up")));
		signUpBtn.click();
		//return new SignInModal();
		//signIn.clickGPlus();
	}


	public void clickGPlus() {
		gPlus.click();
	}
	public String getTextGPlus()  {
		return gPlus.getText();
	}

	public void clickGAccount() {
		gAccount.get(1).click();
	}
	public String getTextGAccount()  {
		return gAccount.get(1).getText();
	}

}

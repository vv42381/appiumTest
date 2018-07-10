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

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ProfilePageObject {
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
	public ProfilePageObject(AppiumDriver<?> driver) {
	    this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "com.hfn.unified:id/switch_status")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement availableStatus;

    @AndroidFindBy(id = "com.hfn.unified:id/btn_accept")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement acceptMeditation;

    @AndroidFindBy(className = "android.widget.ImageButton")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement backBtn;

    @AndroidFindBy(id = "com.hfn.unified:id/img_logout")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement logout;

    @AndroidFindBy(id = "com.hfn.unified:id/btn_end")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement yesBtn;

    public void clickAvailableStatus() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/switch_status")));
        availableStatus.click();
    }

    public void clickBackBtn() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/switch_status")));
        backBtn.click();
    }

    public void clickAcceptMeditation() {
        WebDriverWait wait = new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/btn_accept")));
        acceptMeditation.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void logout(){
        WebDriverWait wait = new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/img_logout")));
        logout.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/btn_end")));
        yesBtn.click();
    }



}

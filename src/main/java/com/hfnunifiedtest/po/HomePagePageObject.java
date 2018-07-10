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

import java.util.List;

public class HomePagePageObject {
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
	public HomePagePageObject(AppiumDriver<?> driver) {
	    this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "com.hfn.unified:id/navigation_menu_button")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement menuBtn;

    @AndroidFindBy(id = "com.hfn.unified:id/nav_title")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
    List<MobileElement> navTitle;

    @AndroidFindBy(id = "com.hfn.unified:id/btn_view_more_meditation")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement meditate;

    @AndroidFindBy(id = "com.hfn.unified:id/profile_image")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS
            MobileElement profileImage;

    public void clickProfileImage() {
        WebDriverWait wait = new WebDriverWait(driver,500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/profile_image")));
        profileImage.click();
    }

    public void clickProfile() {
        navTitle.get(6).click();
    }

    public void clickMeditate() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/btn_view_more_meditation")));
        meditate.click();
    }

}

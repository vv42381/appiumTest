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

public class SignUpPageObject {
    AppiumDriver<?> driver;

	public SignUpPageObject(AppiumDriver<?> driver) {
	    this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "com.hfn.unified:id/signup_name")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement signUpName;

    @AndroidFindBy(id = "com.hfn.unified:id/signup_mobile")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement signUpMobile;

    @AndroidFindBy(id = "com.hfn.unified:id/signup_email")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement signUpEmail;

    @AndroidFindBy(id = "com.hfn.unified:id/signup_password")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement signUpPassword;

    @AndroidFindBy(id = "com.hfn.unified:id/signup_confirm_password")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement signUpConfirmPassword;

    @AndroidFindBy(id = "com.hfn.unified:id/btn_sign_up")
    //@WithTimeout(time = 30, unit = TimeUnit.SECONDS)
            MobileElement signUpBtn;


    public void enterName(String msg) {
        WebDriverWait wait = new WebDriverWait(driver,300);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.hfn.unified:id/signup_name")));
        signUpName.sendKeys(msg);
        //sendChat.click();
    }

    public void enterMobile(String msg) {

        signUpMobile.sendKeys(msg);
    }

    public void enterEmail(String msg) {

        signUpEmail.sendKeys(msg);
    }

    public void enterPassword(String msg) {

        signUpPassword.sendKeys(msg);
    }

    public void enterConfirmPassword(String msg) {

        signUpConfirmPassword.sendKeys(msg);
    }

    public void clickSignUp() {

        signUpBtn.click();
        WebDriverWait wait = new WebDriverWait(driver,300);
    }
}

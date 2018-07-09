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
package com.hfnunifiedtest;

import static org.testng.Assert.assertEquals;

import com.hfnunifiedtest.po.MainScreenPageObject;
import com.hfnunifiedtest.po.SignUpPageObject;
import com.hfnunifiedtest.support.BaseTest;

import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SignUpTest extends BaseTest {

	@Test
	public void testSignUp() {

		MainScreenPageObject mainScreen = new MainScreenPageObject(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		mainScreen.clickSignUp();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		SignUpPageObject signUpPage = new SignUpPageObject(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.hideKeyboard();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		signUpPage.enterName("abhyasi.1");
		signUpPage.enterMobile("9532513521");
		signUpPage.enterEmail("abhyasi.1@mailinator.com");
		driver.hideKeyboard();
		signUpPage.enterPassword("Password1");
		driver.hideKeyboard();
		signUpPage.enterConfirmPassword("Password1");
		driver.hideKeyboard();
		signUpPage.clickSignUp();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}

}

package com.qualitest.Hooks;

import com.qualitest.driver.DriverLaunch;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before()
	public void browserSetup() {
		DriverLaunch.initializeDriver();
	}

	@After()
	public void broweserClose() {
		DriverLaunch.teatDown();
	}
}

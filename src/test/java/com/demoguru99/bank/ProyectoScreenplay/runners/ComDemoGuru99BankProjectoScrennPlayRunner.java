package com.demoguru99.bank.ProyectoScreenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
		features = "src/test/resources/com/demoguru99/bank/ProyectoScreenplay/feature/login.feature",
		glue = "",
		tags = "@smoketest",
		snippets = SnippetType.CAMELCASE
		
		)

public class ComDemoGuru99BankProjectoScrennPlayRunner {

}

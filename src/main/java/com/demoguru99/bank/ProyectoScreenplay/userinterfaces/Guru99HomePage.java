package com.demoguru99.bank.ProyectoScreenplay.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/V4/index.php")
public class Guru99HomePage extends PageObject {

	public static final Target INPUT_USER = Target.the("input user name").located(
            By.name("uid"));
	
	public static final Target INPUT_PASS = Target.the("input user name").located(
            By.name("password"));
	
	public static final Target INPUT_BTN = Target.the("input user name").located(
            By.name("btnLogin"));
	
	public static final  Target SPN_TITLE_PAGE_WRONG = Target.the("TITLE TEXT WRONG").located(By.xpath("//tr[@class='heading3']"));
}

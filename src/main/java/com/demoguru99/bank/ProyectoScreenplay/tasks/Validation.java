package com.demoguru99.bank.ProyectoScreenplay.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import  static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import com.demoguru99.bank.ProyectoScreenplay.questions.ValidationManager;
import com.demoguru99.bank.ProyectoScreenplay.userinterfaces.Guru99HomePage;
import com.demoguru99.bank.ProyectoScreenplay.utils.MetodoUtil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Validation implements Task{

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		MetodoUtil.configProperties();
	actor.should(seeThat(ValidationManager.in(Guru99HomePage.SPN_TITLE_PAGE_WRONG),
			equalToIgnoringCase("Manger Id : "+ MetodoUtil.properties.getProperty("User"))));	
		
	}
public static Validation verificar() {
	return instrumented(Validation.class);
} 
}

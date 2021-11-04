package com.demoguru99.bank.ProyectoScreenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoguru99.bank.ProyectoScreenplay.userinterfaces.Guru99HomePage;
import com.demoguru99.bank.ProyectoScreenplay.utils.MetodoUtil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class SetUserName implements Task {
	Guru99HomePage homepage = new Guru99HomePage();
	

		
	

	public static SetUserName Send () {
		return instrumented(SetUserName.class);
		
	}





	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		MetodoUtil.configProperties();
		
		actor.attemptsTo(Enter.theValue(MetodoUtil.properties.getProperty("User")).into(homepage.INPUT_USER));
		actor.attemptsTo(Enter.theValue(MetodoUtil.properties.getProperty("Password")).into(homepage.INPUT_PASS));
		actor.attemptsTo(Click.on(homepage.INPUT_BTN));
		
	}





	
}

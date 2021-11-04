package com.demoguru99.bank.ProyectoScreenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoguru99.bank.ProyectoScreenplay.userinterfaces.Guru99HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class OpenTheBrowser implements Task{

	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new Guru99HomePage()));

		
	}

	public static OpenTheBrowser on() {
		return instrumented(OpenTheBrowser.class);
		
	}

}

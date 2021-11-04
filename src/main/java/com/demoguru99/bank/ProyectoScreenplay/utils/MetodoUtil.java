package com.demoguru99.bank.ProyectoScreenplay.utils;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MetodoUtil {

	public static Properties properties;

    public static void configProperties() {

        properties = new Properties();
        try {
            properties.load(new FileReader("info.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
	
}

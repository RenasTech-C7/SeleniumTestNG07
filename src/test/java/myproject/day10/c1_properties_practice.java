package myproject.day10;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class c1_properties_practice {
    @Test
    public void TC1_system_properties(){
        //java has some properties that we can use to get system info
        System.out.println(System.getProperty("os.name"));
    }

    @Test
    public void TC2_configurationProperties(){
        Properties properties=new Properties();

        //this is a path for configuration.properties file
        String pathForPropertiesFile="configuration.properties";



        try {
            //tell compiler to open file
            FileInputStream fileInputStream =new FileInputStream(pathForPropertiesFile);
            properties.load(fileInputStream);
        }catch (IOException e){
            e.printStackTrace();

        }

        System.out.println(properties.getProperty("SmartBearUrl"));
        System.out.println(properties.getProperty("SmartBear_userName"));
        System.out.println(properties.getProperty("SmartBear_password"));







    }
}


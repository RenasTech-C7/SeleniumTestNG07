package myproject.day07;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class c2_JavaFaker {

    @Test
    public void JavaFaker(){

        /*Faker is an open-source python library that
         allows you to create your own dataset
         i.e you can generate random data with random attributes like name,
          age, location, etc. It supports all major locations and languages
           which is beneficial for generating data based on locality.

         */

        Faker faker=new Faker();
        System.out.println(faker.food().dish());
        System.out.println(faker.name().fullName());
        System.out.println(faker.gameOfThrones().character());
        System.out.println(faker.artist().name());
        System.out.println(faker.address().fullAddress());
    }
}

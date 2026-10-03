package ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Тест Варіанту з XML ===");

        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Spaceship xmlShip = xmlContext.getBean("mySpaceship", Spaceship.class);
        xmlShip.showInfo();

        System.out.println("\n=== Тест Варіанту з Java Config ===");

        ApplicationContext javaContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Spaceship javaShip = javaContext.getBean(Spaceship.class);
        javaShip.showInfo();
    }
}

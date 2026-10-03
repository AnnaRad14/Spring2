package ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {

        System.out.println("\n=== Тест Варіанту з XML Map ===");

        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Dictionary dictionary = xmlContext.getBean("myDictionary", Dictionary.class);
        dictionary.printDictionary();
    }
}
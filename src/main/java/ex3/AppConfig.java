package ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "initShip")
    public Spaceship spaceship() {
        Spaceship ship = new Spaceship("Falcon 9 (Java-Config)");

        ship.setSpeed(30000);

        return ship;
    }
}

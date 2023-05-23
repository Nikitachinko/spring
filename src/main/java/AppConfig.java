
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
public class AppConfig {

    @Bean
    Car car() {
        return new Car("BMW", "I8", 2.3);
    }

    @Bean
    Bus bus() {
        return new Bus("Mercedes", "B", 3);
    }

    @Bean
    Pickup pickup() {
        return new Pickup("Audi", "WC", 5);
    }

    @Bean
    Driver driverCar() {
        return new Driver("Никита", car());
    }

    @Bean
    Driver driverBus() {
        return new Driver("Вася", bus());
    }

    @Bean
    Driver driverPickup() {
        return new Driver("Иван", pickup());
    }
}


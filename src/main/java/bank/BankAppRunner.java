package bank;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BankAppRunner {

    public static void main(String[] args) {
        SpringApplication.run(BankAppRunner.class, args);
    }
}

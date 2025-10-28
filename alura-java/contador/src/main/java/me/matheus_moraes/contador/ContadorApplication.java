package me.matheus_moraes.contador;

import me.matheus_moraes.contador.services.CounterService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da contágem:");
        int target = scanner.nextInt();

        CounterService counterService = new CounterService();
        counterService.count(target);
    }
}

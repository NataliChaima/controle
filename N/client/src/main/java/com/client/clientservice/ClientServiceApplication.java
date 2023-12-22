package com.client.clientservice;

import com.client.clientservice.entities.Client;
import com.client.clientservice.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
clientRepository.save(Client.builder()
                    .nom("Elkastali1")
                    .age(22F)
                    .build());

            clientRepository.save(Client.builder()
                    .nom("Elkastali2")
                    .age(22F)
                    .build());
            clientRepository.save(Client.builder()
                    .nom("Elkastali3")
                    .age(22F)
                    .build());

        };
    }
}

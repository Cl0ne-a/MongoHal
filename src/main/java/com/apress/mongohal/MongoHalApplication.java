package com.apress.mongohal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoHalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoHalApplication.class, args);
    }
    @Bean
    public CommandLineRunner defaultState(NoteRepository repo, ApplicationContext context) {
        return args -> {
            var name = context.getId();
            //     this.repository = repo;
         //   repo.deleteAll();
            repo.save(new Note("Almonds", "FOOD", 125L, false));
            repo.save(new Note("Milk", "FOOD", 15L, true));
            repo.save(new Note("Apple", "FOOD", 25L, true));
            repo.save(new Note("Dress", "CLOTHES", 200L, true));
            repo.save(new Note("Hat", "CLOTHES", 110L, true));
            //var x = Flux.fromIterable(repo.findAll());
            var x = repo.findAll();
            x.forEach(d -> {
                System.out.println(String.format("Note: %s, type %s, price %d,  bought %b, timestamp %s", d.getItemToBuy(), d.getType(), d.getPrice(), d.isBought(), d.getDate()));
            });
        };
    }
}

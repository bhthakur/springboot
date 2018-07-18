package rishi.com.web;

import com.rishi.domain.Hotel;
import com.rishi.persistence.HotelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.rishi.persistence"})
@EntityScan(basePackages = {"com.rishi.domain"})
@ComponentScan(basePackages = {"com.rishi.persistence"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(HotelRepository repository) {
        return args -> {
            Hotel marriot = new Hotel("Marriot", 5, true);
            Hotel ibis = new Hotel("Ibis", 3, true);
            Hotel goldenTulip = new Hotel("Golden Tulip", 4, true);

            //List<Hotel> hotels = Arrays.asList(marriot, ibis, goldenTulip);
            List<Hotel> hotels = new ArrayList<>();
            hotels.add(marriot);
            hotels.add(ibis);
            hotels.add(goldenTulip);

           // repository.saveAll(hotels);
            repository.save(marriot);
            repository.save(ibis);
            repository.save(goldenTulip);
        };

    }

}

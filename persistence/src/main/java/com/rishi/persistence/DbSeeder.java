package com.rishi.persistence;

import com.rishi.domain.Hotel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        Hotel marriot= new Hotel("Marriot", 5, true);
//        Hotel ibis= new Hotel("Ibis", 3, true);
//        Hotel goldenTulip= new Hotel("Golden Tulip", 4, true);
//
//        //List<Hotel> hotels = Arrays.asList(marriot, ibis, goldenTulip);
//        List<Hotel> hotels= new ArrayList<>();
//        hotels.add(marriot);
//        hotels.add(ibis);
//        hotels.add(goldenTulip);
//
//        this.hotelRepository.saveAll(hotels);
    }


}

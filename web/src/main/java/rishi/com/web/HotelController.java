package rishi.com.web;


import com.rishi.domain.Hotel;
import com.rishi.persistence.HotelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hotels")
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping(value = {"","/"})
    public List<Hotel> getHotels(){
        return hotelRepository.findAll();
    }
}

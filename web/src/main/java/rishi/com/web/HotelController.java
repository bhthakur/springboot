package rishi.com.web;


import com.rishi.dto.HotelDto;
import com.rishi.service.HotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hotels")
public class HotelController {

    private HotelService service;

    public HotelController(HotelService service) {
        this.service = service;
    }

    @GetMapping(value = {"","/"})
    public List<HotelDto> getHotels(){
        return service.getHotels();
    }
}

package com.rishi.service.impl;

import com.rishi.domain.Hotel;
import com.rishi.dto.HotelDto;
import com.rishi.persistence.HotelRepository;
import com.rishi.service.HotelService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {

    private HotelRepository repository;

    public HotelServiceImpl(HotelRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<HotelDto> getHotels() {
        List<Hotel> entities = repository.findAll();
        List<HotelDto> dtoList= new ArrayList<>();
        for(Hotel entity: entities){
            HotelDto dto = HotelDto.toDto(entity);
            dtoList.add(dto);
        }

        return dtoList;
    }
}

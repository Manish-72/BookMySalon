package com.BookMySalon.service;

import java.util.List;

import com.BookMySalon.modal.Salon;
import com.BookMySalon.payload.dto.SalonDTO;
import com.BookMySalon.payload.dto.UserDTO;

public interface SalonService {


    Salon createSalon(SalonDTO salon, UserDTO user);

    Salon updateSalon(Long salonId, Salon salon) throws Exception;

    List<Salon> getAllSalons();

    Salon getSalonById(Long salonId);

    Salon getSalonByOwnerId(Long ownerId);

    List<Salon> searchSalonByCity(String city);
}

package com.BookMySalon.service;

import java.util.List;
import java.util.Set;

import com.BookMySalon.modal.ServiceOffering;
import com.BookMySalon.payload.dto.CategoryDTO;
import com.BookMySalon.payload.dto.SalonDTO;
import com.BookMySalon.payload.dto.ServiceDTO;

public interface ServiceOfferingService {


    ServiceOffering createService(
            ServiceDTO service,
            SalonDTO salon,
            CategoryDTO category
    );

    com.BookMySalon.modal.ServiceOffering updateService(
            Long serviceId,
            ServiceOffering service
    ) throws Exception;

    Set<ServiceOffering> getAllServicesBySalonId(Long salonId,Long categoryId);

    com.BookMySalon.modal.ServiceOffering getServiceById(Long serviceId);

    Set<ServiceOffering> getServicesByIds(Set<Long> ids);
}

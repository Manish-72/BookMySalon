package com.BookMySalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMySalon.modal.Notification;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification,
        Long> {
    List<Notification> findByUserId(Long userId);
    List<Notification> findBySalonId(Long salonId);
}

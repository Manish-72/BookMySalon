package com.BookMySalon.service;

import java.util.List;

import com.BookMySalon.modal.Notification;
import com.BookMySalon.payload.dto.NotificationDTO;

public interface NotificationService {
    NotificationDTO createNotification(Notification notification);
    List<Notification> getAllNotificationsByUserId(Long userId);
    List<Notification> getAllNotificationsBySalonId(Long salonId);
    Notification markNotificationAsRead(Long notificationId) throws Exception;
    void deleteNotification(Long notificationId);
    List<Notification> getAllNotifications();
}

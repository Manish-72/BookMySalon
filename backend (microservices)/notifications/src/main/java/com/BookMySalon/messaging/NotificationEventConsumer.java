package com.BookMySalon.messaging;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.BookMySalon.modal.Notification;
import com.BookMySalon.payload.dto.BookingDTO;
import com.BookMySalon.payload.dto.NotificationDTO;
import com.BookMySalon.service.NotificationService;

@Component
@RequiredArgsConstructor
public class NotificationEventConsumer {

    private final NotificationService notificationService;

    @RabbitListener(queues = "notification-queue")
    public void sentBookingUpdateEvent(Notification notification){
        notificationService.createNotification(notification);
    }

}

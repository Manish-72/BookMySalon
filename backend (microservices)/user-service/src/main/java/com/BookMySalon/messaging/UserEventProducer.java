package com.BookMySalon.messaging;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.BookMySalon.payload.dto.UserDTO;

@Component
@RequiredArgsConstructor
public class UserEventProducer {
//    private final RabbitTemplate rabbitTemplate;

//    public void userCreatedEvent(UserDTO userDTO){
//        rabbitTemplate.convertAndSend("user-queue",userDTO);
//    }
}

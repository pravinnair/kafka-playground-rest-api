package com.kafka.playground;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics="custom-topic-01",
            groupId="custom-group-01"
    )
    void listener(String data){
        System.out.println("Listener received: "+ data +"!!!");
    }
}

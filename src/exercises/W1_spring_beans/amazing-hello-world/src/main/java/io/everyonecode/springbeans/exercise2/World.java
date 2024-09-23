package io.everyonecode.springbeans.exercise2;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Service;

@Service
public class World {
    public String get() {
        return"World";
    }
}

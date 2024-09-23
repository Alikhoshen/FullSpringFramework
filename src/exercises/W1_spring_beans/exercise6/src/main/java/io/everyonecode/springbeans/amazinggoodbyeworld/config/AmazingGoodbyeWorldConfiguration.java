package io.everyonecode.springbeans.amazinggoodbyeworld.config;

import io.everyonecode.springbeans.amazinggoodbyeworld.service.AmazingGoodbyeWorld;
import io.everyonecode.springbeans.amazinggoodbyeworld.service.Goodbye;
import io.everyonecode.springbeans.amazinggoodbyeworld.service.World;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazingGoodbyeWorldConfiguration {

    @Bean
    Goodbye goodbye() {
        return new Goodbye();
    }

    @Bean
    World world() {
        return new World();
    }

    @Bean
    AmazingGoodbyeWorld amazingGoodbyeWorld(Goodbye goodbye, World world) {
        return new AmazingGoodbyeWorld(goodbye, world);
    }
}

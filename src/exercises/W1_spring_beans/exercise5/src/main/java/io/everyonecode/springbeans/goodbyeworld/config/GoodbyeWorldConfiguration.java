package io.everyonecode.springbeans.goodbyeworld.config;

import io.everyonecode.springbeans.goodbyeworld.service.GoodbyeWorld;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GoodbyeWorldConfiguration {

    @Bean
    GoodbyeWorld goodbyeWorld(){
        return new GoodbyeWorld();
    }
}

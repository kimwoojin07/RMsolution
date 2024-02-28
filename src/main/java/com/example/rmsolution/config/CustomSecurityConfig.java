package com.example.rmsolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class CustomSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public Object authenticationManagerBean() throws Exception {
        return new Object() {
            public void configure(HttpSecurity http) throws Exception {
                http
                        .authorizeRequests()
                        .dispatcherTypeMatchers(HttpMethod.valueOf("/admin/**")).hasRole("ADMIN")
                        .dispatcherTypeMatchers(HttpMethod.valueOf("/user/**")).hasAnyRole("ADMIN", "USER")
                        .dispatcherTypeMatchers(HttpMethod.valueOf("/")).permitAll()
                        .and()
                        .formLogin(withDefaults());
            }
        };
    }

}

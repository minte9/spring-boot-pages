/**
 * JWT Authorization Security Configuration
 */

package com.minte9.jwt;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.web.authentication.*;

@EnableWebSecurity
@Configuration
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .addFilterAfter(
                new JWTAuthorizationFilter(), 
                UsernamePasswordAuthenticationFilter.class
            )
            .authorizeRequests()
            .antMatchers(HttpMethod.POST, "/token").permitAll()
            .anyRequest().authenticated();
    }
}
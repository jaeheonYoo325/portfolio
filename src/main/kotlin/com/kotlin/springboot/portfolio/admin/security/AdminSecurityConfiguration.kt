package com.kotlin.springboot.portfolio.admin.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter
import org.springframework.security.web.util.matcher.AntPathRequestMatcher

@Configuration
class AdminSecurityConfiguration {

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Bean
    fun filterChain(httpSecurity: HttpSecurity): SecurityFilterChain {
//        return httpSecurity
//            .authorizeHttpRequests{ authorizeHttpRequest ->
//                authorizeHttpRequest
//                    .requestMatchers(AntPathRequestMatcher("/admin/**")).authenticated()
//                    .anyRequest().permitAll()
//            }.csrf{ csrf ->
//                csrf.disable()
//            }.headers{ headers ->
//                headers.addHeaderWriter(XFrameOptionsHeaderWriter(XFrameOptionsHeaderWriter.XFrameOptionsMode))
//            }.formLogin{formLogin ->
//                formLogin.defaultSuccessUrl("/admin")
//            }.logout{ logout ->
//                logout.logoutRequestMatcher(AntPathRequestMatcher("/admin/logout"))
//                    .logoutSuccessUrl("/")
//            }.build()

        return httpSecurity
            .authorizeHttpRequests {
                it.requestMatchers("/admin/**")
                    .authenticated()
                    .anyRequest()
                    .permitAll()
            }.csrf {
                it.disable()
            }.formLogin {
                it.defaultSuccessUrl("/admin")
            }.logout {
                it.logoutUrl("/admin/logout")
                    .logoutSuccessUrl("/")
            }.build()
    }

}
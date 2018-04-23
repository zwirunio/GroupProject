package com.pwn.student.configurations;

import com.pwn.student.service.MyAppStudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Autowired
    private MyAppStudentDetailsService myAppStudentDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()

                .antMatchers("/").hasAnyRole("USER")

                //login configuration
                .and().formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .usernameParameter("app_username")
                .passwordParameter("app_password")
                .defaultSuccessUrl("/")

                //logout configuration
                .and().logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")

                //exception handling configuration
                .and().exceptionHandling()
                .accessDeniedPage("/error-view");
    }
}
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        auth.userDetailsService(myAppStudentDetailsService).passwordEncoder(passwordEncoder);
//    }
//}

//package com.example.project.component;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
//
//
//    @Override
//    public void configure(WebSecurity web) throws Exception
//    {
//        web.ignoring().antMatchers("/css/**", "/script/**", "image/**", "/fonts/**", "lib/**");
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception
//    {
//        http.authorizeRequests()
////                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/**").permitAll();
////                .antMatchers("/board/**").authenticated()
////                .and().formLogin()
////                .loginPage("/login")
////                .loginProcessingUrl("/login")
////                .defaultSuccessUrl("/login_fin")
////                .failureUrl("/login")
////                .and()
////                .logout();
//    }
//
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//
//
//}

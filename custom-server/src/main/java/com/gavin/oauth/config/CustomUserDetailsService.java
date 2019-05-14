package com.gavin.oauth.config;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        authorities.add(authority);
        return new User("gavin", "maoli", authorities);
    }
}

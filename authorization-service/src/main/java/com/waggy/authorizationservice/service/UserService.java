package com.waggy.authorisationservice.service;

import com.waggy.authorisationservice.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = new User();

        if (!user.getUsername().equals(username)) {
            throw new UsernameNotFoundException(username);
        }

        return user;
    }
}

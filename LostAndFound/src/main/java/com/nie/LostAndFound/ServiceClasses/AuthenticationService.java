package com.nie.LostAndFound.ServiceClasses;

import com.nie.LostAndFound.EntityClasses.Admin;
import com.nie.LostAndFound.EntityClasses.User;
import com.nie.LostAndFound.RepositoryClasses.AdminRepository;
import com.nie.LostAndFound.RepositoryClasses.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Optional<Admin> authenticateAdmin(String username, String password) {
        Admin admin = adminRepository.findByUsername(username)
                .orElseThrow(() -> new BadCredentialsException("Admin not found"));

        if (!passwordEncoder.matches(password, admin.getPasswordHash())) {
            throw new BadCredentialsException("Invalid credentials");
        }
        return Optional.of(admin);
    }

    public Optional<User> authenticateUser(String email, String password) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new BadCredentialsException("User not found"));

        if (!passwordEncoder.matches(password, user.getPasswordHash())) {
            throw new BadCredentialsException("Invalid credentials");
        }
        return Optional.of(user);
    }
}


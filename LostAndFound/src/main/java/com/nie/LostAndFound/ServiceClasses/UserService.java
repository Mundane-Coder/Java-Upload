package com.nie.LostAndFound.ServiceClasses;

import com.nie.LostAndFound.EntityClasses.User;
import com.nie.LostAndFound.RepositoryClasses.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // Injecting PasswordEncoder

    public User registerUser(User user) {
        // Hash the password before saving
        String rawPassword = user.getPasswordHash(); // Get raw password
        String encodedPassword = passwordEncoder.encode(rawPassword); // Encode password
        user.setPasswordHash(encodedPassword); // Set the encoded password

        return userRepository.save(user); // Save the user with the hashed password
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}

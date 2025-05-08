package com.nie.LostAndFound.ControllerClasses;

import com.nie.LostAndFound.EntityClasses.Admin;
import com.nie.LostAndFound.EntityClasses.User;
import com.nie.LostAndFound.ServiceClasses.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/admin/login")
    public ResponseEntity<?> loginAdmin(@RequestParam String username, @RequestParam String password) {
        try {
            Optional<Admin> admin = authenticationService.authenticateAdmin(username, password);
            return ResponseEntity.ok(admin.get());
        } catch (Exception e) {
            return ResponseEntity.status(401).body("Invalid admin credentials");
        }
    }

    @PostMapping("/user/login")
    public ResponseEntity<?> loginUser(@RequestParam String email, @RequestParam String password) {
        try {
            Optional<User> user = authenticationService.authenticateUser(email, password);
            return ResponseEntity.ok(user.get());
        } catch (Exception e) {
            return ResponseEntity.status(401).body("Invalid user credentials");
        }
    }
}


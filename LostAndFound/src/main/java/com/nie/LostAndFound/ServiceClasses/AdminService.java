package com.nie.LostAndFound.ServiceClasses;

import com.nie.LostAndFound.EntityClasses.Admin;
import com.nie.LostAndFound.RepositoryClasses.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Optional<Admin> login(String username, String passwordHash) {
        Optional<Admin> adminOpt = adminRepository.findByUsername(username);
        return adminOpt.filter(admin -> admin.getPasswordHash().equals(passwordHash));
    }

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}


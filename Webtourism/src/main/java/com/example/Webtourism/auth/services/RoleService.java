package com.example.Webtourism.auth.services;

import com.example.Webtourism.auth.entities.RoleEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Webtourism.auth.repositories.RoleRepository;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleEntity getUserRole() {
        return roleRepository.findByName("ROLE_USER").get();
    }
}
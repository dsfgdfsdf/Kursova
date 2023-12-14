package com.example.Webtourism.auth.dtos;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
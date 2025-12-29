package com.example.demo.security;

import io.jsonwebtoken.*;
import java.util.Date;

public class JwtUtil {

    public String secret;
    public Long jwtExpirationMs;

    public String generateToken(String username,
                                String role,
                                Long userId,
                                String email) {

        return Jwts.builder()
                .setSubject(username)
                .claim("role", role)
                .claim("userId", userId)
                .claim("email", email)
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(System.currentTimeMillis()
                                + jwtExpirationMs))
                .signWith(SignatureAlgorithm.HS256,
                        secret.getBytes())
                .compact();
    }

    public Jws<Claims> validateAndGetClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secret.getBytes())
                .parseClaimsJws(token);
    }
}

package com.example.demo.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.Map;

@Component
public class JwtUtil {

    // Minimum 256-bit key (32 bytes)
    private static final String SECRET = "ThisIsAVeryStrongSecretKeyForHS256Algorithm!1234";

    // Key object from SECRET
    private static final Key KEY = Keys.hmacShaKeyFor(SECRET.getBytes());

    // Token validity in milliseconds (e.g., 1 hour)
    private static final long EXPIRATION_TIME = 60 * 60 * 1000;

    // Generate JWT token with claims
    public String generateToken(Map<String, Object> claims, String subject) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(KEY, SignatureAlgorithm.HS256)
                .compact();
    }

    // Extract claims from token
    public Claims extractAllClaims(String token) throws ExpiredJwtException {
        return Jwts.parserBuilder()
                .setSigningKey(KEY)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    // Extract single claim
    public String extractClaim(String token, String claimKey) {
        return extractAllClaims(token).get(claimKey, String.class);
    }

    // Validate token
    public boolean validateToken(String token, String username) {
        final String tokenUsername = extractAllClaims(token).getSubject();
        return (tokenUsername.equals(username) && !isTokenExpired(token));
    }

    // Check if token expired
    private boolean isTokenExpired(String token) {
        return extractAllClaims(token).getExpiration().before(new Date());
    }
}

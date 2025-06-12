package com.lucov;

@Component
public class JwtUtil {
    private final String SECRET = "secret-key";

    public String generateToken(UserDetails userDetails) {
        return Jwts.builder()
            .setSubject(userDetails.getUsername())
            .claim("roles", userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 day
            .signWith(SignatureAlgorithm.HS512, SECRET)
            .compact();
    }

    public String extractUsername(String token) {
        return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return extractUsername(token).equals(userDetails.getUsername()) &&
            !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return Jwts.parser().setSigningKey(SECRET)
            .parseClaimsJws(token).getBody().getExpiration().before(new Date());
    }
}


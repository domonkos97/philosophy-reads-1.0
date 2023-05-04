package com.domi.philosophyreads.security;

import com.auth0.jwt.JWT;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import com.auth0.jwt.algorithms.Algorithm;
import static com.auth0.jwt.JWT.*;

public class LoginAuthFilter extends UsernamePasswordAuthenticationFilter {
    /**
     The successfulAuthentication method is called after the attemptAuthentication method successfully authenticates the user.
     It is responsible for creating the JWT token, setting it in the response cookie, and sending the response to the client.
     */
    @Override
    public void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException {
        List<String> authorityList = authResult.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList());
        String secret_key = System.getenv("JWT_SECRET");
        Algorithm algorithm = Algorithm.HMAC256(secret_key);
        String token = JWT.create()
                .withSubject(authResult.getName())
                .withIssuer(request.getRequestURL().toString())
                .withClaim("role", authorityList)
                .sign(algorithm);
    }
}

package com.domi.philosophyreads.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class LoginAuthFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;
    public LoginAuthFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    /**
        The attemptAuthentication method is responsible for attempting to authenticate the user
        with the given credentials (i.e. username and password)
        and returning an Authentication object representing the authenticated user on success.
        If the authentication fails, it will throw an AuthenticationException.
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        //
        throw new UnsupportedOperationException("method not implemented yet");
    }
    /**
     The successfulAuthentication method is called after the attemptAuthentication method successfully authenticates the user.
     It is responsible for creating the JWT token, setting it in the response cookie, and sending the response to the client.
     */
    @Override
    public void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException {
        throw new UnsupportedEncodingException("method not implemented yet");
    }
}

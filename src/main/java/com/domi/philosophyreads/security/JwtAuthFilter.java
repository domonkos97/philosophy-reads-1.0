package com.domi.philosophyreads.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class JwtAuthFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {

        String token = extractToken(request);
        if (StringUtils.hasText(token) && validateToken(token)){
            Authentication authentication = new UsernamePasswordAuthenticationToken(getUsernameFromToken(token), null, Collections.emptyList());
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } else {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.getWriter().println("JWT token not valid.");
            return;
        }

        filterChain.doFilter(request, response);
        return;

    }

    public String extractToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }

    public boolean validateToken(String token) {
        throw new UnsupportedOperationException("method not implemented yet");
    }

    public String getUsernameFromToken(String token) {
        throw new UnsupportedOperationException("method not implemented yet");
    }
}

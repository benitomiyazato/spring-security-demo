package com.benitomiyazato.security.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    private final JwtService jwtService;

    @Override
    protected void doFilterInternal
            (@NonNull HttpServletRequest request,
             @NonNull HttpServletResponse response,
             @NonNull FilterChain filterChain
            ) throws ServletException, IOException {

        final String AUTH_HEADER = request.getHeader("Authorization");
        if (AUTH_HEADER == null || !AUTH_HEADER.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        final String JWT = AUTH_HEADER.substring(7);
        final String username = jwtService.extractUsername(JWT);
    }
}

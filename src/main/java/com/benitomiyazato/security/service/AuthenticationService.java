package com.benitomiyazato.security.service;

import com.benitomiyazato.security.config.JwtService;
import com.benitomiyazato.security.model.AuthenticationResponse;
import com.benitomiyazato.security.model.RegisterRequest;
import com.benitomiyazato.security.model.Role;
import com.benitomiyazato.security.model.User;
import com.benitomiyazato.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;

    private final JwtService jwtService;

    private final PasswordEncoder passwordEncoder;

    public AuthenticationResponse register(RegisterRequest request) {
        User user = new User();
        BeanUtils.copyProperties(request, user);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.USER);
        userRepository.save(user);

        return new AuthenticationResponse(jwtService.generateToken(user, 24));
    }
}

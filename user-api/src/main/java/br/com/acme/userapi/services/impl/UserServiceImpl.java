package br.com.acme.userapi.services.impl;

import br.com.acme.userapi.domain.User;
import br.com.acme.userapi.repository.UserRepository;
import br.com.acme.userapi.services.UserService;
import br.com.acme.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final Environment env;

    @Override
    public User findaById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return userRepository.findAll();
    }
}

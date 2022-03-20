package br.com.acme.userapi.services;

import br.com.acme.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findaById(Long id);
    List<User> findAll();
}

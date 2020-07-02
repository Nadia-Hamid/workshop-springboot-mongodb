package com.nadiahamid.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadiahamid.workshopmongo.domain.User;
import com.nadiahamid.workshopmongo.repository.UserRepository;

// injecao de dependencia automatia do Spring
@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}
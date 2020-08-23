package com.nadiahamid.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadiahamid.workshopmongo.domain.Post;
import com.nadiahamid.workshopmongo.repository.PostRepository;
import com.nadiahamid.workshopmongo.services.exception.ObjectNotFoundException;

// injecao de dependencia automatia do Spring

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> user = repo.findById(id);
		return user.orElseThrow(() ->
		new ObjectNotFoundException("Objeto não encontrado"));
	}
}
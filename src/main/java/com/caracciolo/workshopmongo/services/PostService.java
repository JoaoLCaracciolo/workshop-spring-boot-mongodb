package com.caracciolo.workshopmongo.services;

import com.caracciolo.workshopmongo.domain.Post;
import com.caracciolo.workshopmongo.domain.User;
import com.caracciolo.workshopmongo.dto.UserDTO;
import com.caracciolo.workshopmongo.repository.PostRepository;
import com.caracciolo.workshopmongo.repository.UserRepository;
import com.caracciolo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;


    public Post findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }
}

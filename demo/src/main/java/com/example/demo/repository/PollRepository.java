package com.example.demo.repository;

import com.example.demo.dominio.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll,Integer> {

}
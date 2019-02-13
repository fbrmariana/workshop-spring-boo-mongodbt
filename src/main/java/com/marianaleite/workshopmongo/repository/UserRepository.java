package com.marianaleite.workshopmongo.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marianaleite.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository <User, String> {

}


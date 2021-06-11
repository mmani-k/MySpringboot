package com.myapp.users.domain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface UserRepository extends CrudRepository<User, Long>{
}

package com.pooja.datajpa.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pooja.datajpa.model.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}
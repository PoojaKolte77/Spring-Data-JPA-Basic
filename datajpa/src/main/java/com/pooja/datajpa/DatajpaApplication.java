package com.pooja.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Optional;
import com.pooja.datajpa.model.UserEntity;
import com.pooja.datajpa.repository.UserRepository;

@SpringBootApplication
public class DatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DatajpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		UserEntity userEntity = new UserEntity();
//		userEntity.setUserId(1);
		userEntity.setUserName("test");
		userEntity.setAge(39);
		userEntity.setUserEmail("test@gmail.com");
		
		userRepository.save(userEntity);
		
//		UserEntity userEntity2 = new UserEntity();
//		userEntity2.setUserName("demo");
//		userEntity2.setAge(29);
//		userEntity2.setUserEmail("demo@gmail.com");
//		
//		userRepository.save(userEntity2);
		
		// get data from db
		
		Optional<UserEntity> findById = userRepository.findById(1);
		System.out.println(findById.get());
		
		Iterable<UserEntity> userData = userRepository.findAll();
		System.out.println(userData);
		
		for(UserEntity user : userData) {
			System.out.println(user);
		}
		
		
	}


}

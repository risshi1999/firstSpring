package com.SampleApp.FirstApp;

import org.springframework.data.repository.CrudRepository;
import com.SampleApp.FirstApp.User;
public interface UserRepository extends CrudRepository<User, Integer> {

}

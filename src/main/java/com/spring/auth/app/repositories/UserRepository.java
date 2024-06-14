package com.spring.auth.app.repositories;

import com.spring.auth.app.helpers.RefreshableCRUDRepository;
import com.spring.auth.app.models.UserInfo;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends RefreshableCRUDRepository<UserInfo, Long> {

   public UserInfo findByUsername(String username);
   UserInfo findFirstById(Long id);

}

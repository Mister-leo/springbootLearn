package com.leo.dao.user;

import com.leo.entity.auth.User;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserDao extends JpaRepository<User, Integer> {
    @Query("select a from User a where a.username = ?1")
    User findUserByName(String name);

}

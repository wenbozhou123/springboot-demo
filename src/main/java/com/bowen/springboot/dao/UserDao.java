package com.bowen.springboot.dao;

import com.bowen.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-07-17 2:12 PM
 * 基于JPA，实现DAO层
 */
@Repository()
public interface UserDao extends JpaRepository<User, Long> {

    @Query("select t from User t where t.name= :name")
    User findByUserName(@Param("name") String name);
}

package org.example.mapper;

import org.example.pojo.User;

import java.util.List;

/**
 * @Author JX
 * @ClassName: org.example.mapper.UserMapper
 * @Create 2023-09-14 17:17
 * @Description: TODO
 */
public interface UserMapper {
    List<User> selectAll();

    User selectById(int id);
}

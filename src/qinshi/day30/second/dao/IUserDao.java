package qinshi.day30.second.dao;

import qinshi.day30.second.domain.User;

import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IUserDao
 * @Date 2021/2/27 16:13
 */
public interface IUserDao {
    void insert(User user);
    void delete(Integer id);
    void update(User user);
    User selectOne(Integer id);
    List<User> selectAll();
    User login(String name);
}

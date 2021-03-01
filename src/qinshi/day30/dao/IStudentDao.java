package qinshi.day30.dao;

import qinshi.day30.domain.Student;

import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IStudentDao
 * @Date 2021/2/27 9:18
 */
public interface IStudentDao {
    void add(Student stu);
    void delete(Integer id);
    void update(Student stu);
    Student selectOne(Integer id);
    List<Student> selectAll();

    //登录方法
    Student login(String userName);
}

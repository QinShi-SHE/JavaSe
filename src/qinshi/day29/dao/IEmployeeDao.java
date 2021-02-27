package qinshi.day29.dao;

import qinshi.day29.domain.Employee;

import java.util.List;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IEmployeeDao
 * @Date 2021/2/26 16:01
 */
public interface IEmployeeDao {
    /*添加*/
    void add(Employee employee);

    /*修改*/
    void update(Employee employee);

    /*删除*/
    void delete(Integer id);

    /*查询一条数据*/
    Employee selectOne(Integer id);

    /*查询多条数据*/
    List<Employee> selectAll();
}

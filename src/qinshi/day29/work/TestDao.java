package qinshi.day29.work;
import org.junit.Test;
import qinshi.day29.work.dao.impl.EmployeeDaoImpl;
import qinshi.day29.work.domain.Employee;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/2/26 23:51
 */
public class TestDao {
    @Test
    public void test() throws Exception{
        EmployeeDaoImpl employeeDao=new EmployeeDaoImpl();

        //插入
        Employee emp=new Employee(null,"王五",1);
        employeeDao.add(emp);

        //修改
        Employee emp2=new Employee(null,"王五",1111);
        employeeDao.update(emp2);

        //删除
        employeeDao.delete(5);

        //查询
        System.out.println(employeeDao.selectAll());
    }
}

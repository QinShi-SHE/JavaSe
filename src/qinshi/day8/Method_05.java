package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_05
 * @Date 2021/1/9 11:09
 */
public class Method_05 {
    /*
        方法返回值
                方法内部的最后一句代码返回该方法的运行结果
	            return  值/变量/表达式;
	    方法在调用完成以后，如果没有返回值，方法的返回值类型为void，
	    如果方法有返回值，此时需要将方法运行后的结果返回给方法的调用方，调用可以使用对应的类型接收方法的执行结果；
	    注意：
	        1.如果方法设置了返回值类型，方法内部必须有return语句返回对应类型的值/变量/表达式；(return后返回的类型必须与方法上的返回值类型一致)
	        2.return语句后不能再有其他执行语句
            3.如果方法内部有条件判断 此时充分考虑如果条件不满足 方法是否还有返回
     */

    /*设计一个方法 完成两个整数的求和 返回方法的结果*/
    public int  getSum(int a,int b){
        int c = a+b;
        return c;
    }

    /*判断一个数字是奇数还是偶数*/
    public String checkNum(int i){
        if(i%2==0){
            return "偶数";
        }
        return "奇数";
    }

    public static void main(String[] args) {
        Method_05 method_05=new Method_05();
        //直接打印方法名，如果返回值为void 则不能直接打印
        System.out.println(method_05.getSum(4,4));

        String sex=method_05.checkNum(5);
        System.out.println(sex);
    }
}

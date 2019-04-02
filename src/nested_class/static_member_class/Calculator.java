package nested_class.static_member_class;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by chupengcheng on 2019/4/2.
 */
public class Calculator {

    private Integer name;

    private static Long age;

    private void methodA(){

    }

    private static void methodB(){

    }

    public static enum  Operation{
        PLUS,MINUS
    }

    public static class A {
        private Integer aName;
        private Long aAge;

        private void setaAge(){
            //静态类可以访问静态成员
            //this.aName = name;
            this.aAge = age;
            //methodA();
            methodB();
        }
    }

    public class B {
        private Integer aName;
        private Long aAge;

        private void setaAge(){
            //非静态类访问所有成员
            this.aAge = age;
            this.aName = name;
            methodA();
            methodB();
        }
    }

    //匿名类
    public void Sort(){
        String[] str = null;
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        MyComparator myComparator = new MyComparator(){
            @Override
            public void A() {
                System.out.println(name + comparotorName);
            }
        };
    }

    public static void Sort2(){
        String[] str = null;
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        MyComparator myComparator = new MyComparator(){
            @Override
            public void A() {
                System.out.println(age + comparotorName);
                //System.out.println(name + comparotorName);
            }
        };
    }

    public static void main(String[] args) {
        //
        Calculator.A a = new Calculator.A();

        //Calculator.B b = new Calculator.B();

        Calculator c = new Calculator();
        Calculator.B b = c.new B() ;
    }
}

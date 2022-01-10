package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependecyImplement implements MyBeanWithDependecy{
    MyOperation myOperation;

    public MyBeanWithDependecyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int num = 1;

        System.out.println(myOperation.sum(num));
        System.out.println("Hola desde la implementacion de un bean con dependecia");
    }
}

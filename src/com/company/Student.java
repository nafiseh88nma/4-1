package com.company;

/**
 * Created by admin on 10/25/2019.
 */
public class Student
{
    public String  name ;
    public String  feild ;
    public int id;
    public int age;
    public Student(String name ,int id,int age ,String feild)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.feild=feild;
    }
    public void show()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
        System.out.println(feild);
    }

}

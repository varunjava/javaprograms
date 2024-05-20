package Practise.collectionss;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class SetP1
{
    public static void main(String[] args)
    {
        student();

    }

    public static void student()
    {
        HashSet<Student> hs=new HashSet<>();
        hs.add(new Student(123456, "ramu", 1));
        hs.add(new Student(123454, "ramu", 1));
        hs.add(new Student(123456, "ravi", 1));
        hs.add(new Student(123456, "raghu", 3));

//        System.out.println(hs);
        studentDetails(hs);
    }

    public static void studentDetails(HashSet<Student> hs)
    {
        for (Student s : hs)
        {
            System.out.println(s);
        }
        System.out.println("===============");
    }


}

class Student
{
    private int phno;

    private String name;

    private int age;

    public int getPhno()
    {
        return phno;
    }

    public Student(int phno, String name, int age)
    {
        this.phno = phno;
        this.name = name;
        this.age = age;
    }

    public void setPhno(int phno)
    {
        this.phno = phno;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "phno=" + phno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return phno == student.phno ;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(phno);
    }
}

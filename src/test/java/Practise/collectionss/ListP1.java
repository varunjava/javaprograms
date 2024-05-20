package Practise.collectionss;

import java.util.ArrayList;

public class ListP1
{
    public static void main(String[] args)
    {
        emp();
    }

//    create collection of emp's and
//    1.design a method to display emp's ,whose sal is greater than 15,000/-
//    2.remove emp's whose name having less than 5char
//    3.design a method to increase a sal of emp


    public static void emp()
    {
        ArrayList<Emp> al=new ArrayList<>();
        al.add(new Emp("Raju", 20000, 1));
        al.add(new Emp("Rangu", 40000, 2));
        al.add(new Emp("Ravi", 5000, 3));

        print(al);

      //  printDetails(al);
//        removeEmp(al);
//        print(al);
        increaseSal(al, 1, 50000);
        print(al);

    }

    public static void print(ArrayList<Emp> al)
    {
        for (Emp emp : al)
        {
            System.out.println(emp);
        }
        System.out.println("==========================");
    }

    public static void printDetails(ArrayList<Emp> al)
    {
        for (int i=0; i<al.size(); i++)
        {
            if (al.get(i).getSal()>15000)
            {
                System.out.println(al.get(i));
            }
        }
    }

    public static void removeEmp(ArrayList<Emp> al)
    {
        for (int i=0; i<al.size(); i++)
        {
            if (al.get(i).getName().length()<5)
            {
                al.remove(i);
            }
        }
    }

    public static void increaseSal(ArrayList<Emp> al,int id, double hike)
    {
        for (int i=0; i<al.size(); i++)
        {
            if (al.get(i).getId()==id)
            {
                al.get(i).setSal(al.get(i).getSal()+hike);
            }
        }
    }

}

class Emp
{
   private String name;
   private double sal;
   private int id;

    public Emp(String name, double sal, int id)
    {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSal()
    {
        return sal;
    }

    public void setSal(double sal)
    {
        this.sal = sal;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}

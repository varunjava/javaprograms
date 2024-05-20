package Practise.collectionss;

public class ThreadRaceCondition
{
    public static void main(String[] args)
    {
        Task task = new Task();

        Runnable r1 = () -> task.read() ;
        Thread sheela = new Thread(r1);


        Runnable r2 = () -> task.write();
        Thread mala = new Thread(r2);

        sheela.start();
        mala.start();


    }
}
class Task
{
    String name = "Rajinikanth";
    public synchronized void read()
    {
        for( int i=0 ; i < name.length(); i++)
        {
            System.out.print( name.charAt(i));

            try
            {
                Thread.sleep(5000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

        }
    }
    public synchronized void write()
    {
        name = "Sheela" ;
        System.out.println("\n name chANGED TO "+  name);

    }
}
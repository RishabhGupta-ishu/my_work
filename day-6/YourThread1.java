class YourThread1 implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(Thread.currentThread().getName());
try{Thread.sleep(1000);}catch(Exception e){}
}
System.out.println(Thread.currentThread().getName()+"dead");
}
}
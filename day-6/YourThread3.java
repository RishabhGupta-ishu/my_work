class YourThread3 implements Runnable
{
public void run()
{
for(int i=1;i<=15;i++)
{
System.out.println(Thread.currentThread().getName());
try{Thread.sleep(1000);}catch(Exception e){}
}
System.out.println(Thread.currentThread().getName()+"dead");
}
}
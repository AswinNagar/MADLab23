class Mother 
{
    int x;
    public void show()
    {
        System.out.println("Hello World");
    }
}
class Child extends Mother
{
    public void show() 
    {
    System.out.println("Hello JUET");
    }
}
class Main 
{
 public static void main (String args[])
 {
 Mother m= new Mother ( );
 m.show( );
 Child ch=new Child ( ); 
 ch. show ( );
 }
}

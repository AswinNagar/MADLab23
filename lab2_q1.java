class Mother 
{
    int x;
class Mother 
{
    int x;
    public void show()
    {
        System.out.println("mother");
    }
}
class Child extends Mother
{
    public void display() 
    {
    System.out.println("child");
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


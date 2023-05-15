class one
{ 
    
   int i;
   public one (int i){
      this.i = i;
   }
   public static void show()
    {
        System.out.println("o");
    }
}
class two extends one 
{
   
}
class main 
{
 public static void main (String args[])
 {
 one o= new one ( );
 o.show( );
 two t= new two( ); 
 t.show( );
 
 }
}


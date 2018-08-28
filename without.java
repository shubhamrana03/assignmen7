import java.util.Scanner;
class parent
{
 parent()
{
System.out.println("Invoke done!");
}
}

class child extends parent
{
  child()
{
 super();
}
}

public class without
{
 public static void main(String[] args)
{
 child a = new child();
}
}
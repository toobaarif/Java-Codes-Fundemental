public class nestedifElse{
public static void main (String[]args){
int a=10,b=20,c=30;
if (a>b)
{ 
if (a>c)
{ 
System.out.println("a");
}
else{
System.out.println("c");
}
}
else{
if (b>c)
{ 
System.out.println("b");
}
else{
System.out.println("c");
}
}
}
}
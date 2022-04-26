class bitwise{
public static void main(String args[]){

short a= 150;
short b=200;

boolean c=(a<=b) & (a>b);
boolean d=(a<=b) | (a>b);
boolean e=(a<=b) ^ (a>b);
boolean f=((a<=b & a>b));

System.out.println("a<=b & a>b: "+c);

System.out.println("a<=b | a>b: "+d);

System.out.println("(a<=b) ^ (a>b) "+e);

System.out.println("!(a<=b & a>b): "+f);
}
}
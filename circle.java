import java.io.*;
class shape
{
void getperimeter()
{
System.out.println("p");
}
void getarea()
{
System.out.println("a");
}
}
class circle extends shape
{
void getperimeter()
{
int r=1;
double perimeter=2*3.14*r;
System.out.println(perimeter);
}
void getarea()
{
int r=1;
double area=3.14*r*r;
System.out.println(area);
}
public static void main(String args[])
{
circle s=new circle();
s.getperimeter();
s.getarea();
}
}

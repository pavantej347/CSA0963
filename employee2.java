import java.io.*;
import java.util.Scanner;
class company
{
String name,address,jobtitle;
int salary;
}
class manager extends company
{
void fun()
{
System.out.println("MANAGER  : -");
name="PAVAN";
address="NELLORE";
salary=600000;
jobtitle="MANAGER";
System.out.println("NAME:-"+name);
System.out.println("ADRESS:-"+address);
System.out.println("SALARY:-"+salary);
System.out.println("JOB_TITLE:-"+jobtitle);
}
}
class developper extends company
{
void fuc1()
{
System.out.println("DVELOPPER  : -");
name="tej";
address="NELLORE";
salary=200000;
jobtitle="PROJECT DEVELOPPER";
System.out.println("NAME:-"+name);
System.out.println("ADRESS:-"+address);
System.out.println("SALARY:-"+salary);
System.out.println("JOB_TITLE:-"+jobtitle);
}
}
public class employee2 extends company
{
void fun2()
{
System.out.println("EMPLOYEE2 : -");
name="vamsi";
address="kadapa";
salary=100000;
jobtitle="EMPLOYEE`HEAD";
System.out.println("NAME:-"+name);
System.out.println("ADRESS:-"+address);
System.out.println("SALARY:-"+salary);
System.out.println("JOB_TITLE:-"+jobtitle);
}
public static void main(String args[])
{
manager  a=new manager();
developper   b=new developper ();
employe  c=new employe();
a.fuc();
b.fuc1();
c.fuc2();
}
}
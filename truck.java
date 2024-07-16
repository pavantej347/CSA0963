import java.io.*;
class vehicle
{
String model,fuel_type,make;
int year;
}
class truck extends vehicle
{
void kurt()
{
String model="ashok_leyand";
int year=2014;
String fuel_type="petrol";
String make="copper";
System.out.println(model + year + fuel_type + make);
}
}
class car
{
void rac()
{
String model="BMW";
int year=2014;
String fuel_type="petrol";
String make="copper";
System.out.println(model + year + fuel_type + make);
}
}
class motorcycle
{
void motor()
{
String model="BMW";
int year=2014;
String fuel_type="petrol";
String make="copper";
System.out.println(model + year + fuel_type + make);
}
public static void main(String args[])
{
truck a=new truck();
car b=new car();
motorcycle c=new motorcycle();
a.kurt();
b.rac();
c.motor();
}
}



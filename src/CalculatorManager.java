class Calculator{
int first;
int second;
int sumResult;
Calculator()
{
}Calculator(int a,int b)
{
first=a;
second=b;
}
public void performAdd()
{
sumResult=first+second;
}
public void displaySum()
{
System.out.println(sumResult)
}
class CalculatorManager{
public static void main(String[]args)
{
Calculator c=new Calculator(10,20);
c.performAdd();
c.displaySum();
}
}


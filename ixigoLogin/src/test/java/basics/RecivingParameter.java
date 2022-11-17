package basics;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 

public class RecivingParameter 
{
@Test
@Parameters({"selenium","java"})
public void data1(@Optional("this is selenium")String data,@Optional("this is java")String data2 )
{
System.out.println(data);
System.out.println(data2);
}
}

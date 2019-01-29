package io.naztech.Daysinmonth;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner in =new Scanner(System.in);
		String s=in.next();
		Month mon=Month.JANUARY;
		Month mon2=mon.parse(s);
		if(mon2!=null)
		{
			System.out.println(mon2.getTitle().substring(0,1).toUpperCase()+mon2.getTitle().substring(1,mon2.getTitle().length())+" has "+mon2.getDays()+" days ");
		}
		else
		{
			System.out.println("sorry no such month");
		}

	}

    
}

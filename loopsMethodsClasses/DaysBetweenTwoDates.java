package loopsMethodsClasses;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DaysBetweenTwoDates {

	public static void main(String[] args) {
		int year = 0;
		int month = 0;
		int day = 0;
		Scanner input= new Scanner(System.in);
		String old=input.next();
		String novo=input.next();
		String[] oldInput= old.split("-");
		String[] newInput= novo.split("-");
		year=Integer.parseInt(oldInput[2]);
		month=Integer.parseInt(oldInput[1]);
		day=Integer.parseInt(oldInput[0]);
		
		Date oldDate = new Date(year, month, day);
		
		year=Integer.parseInt(newInput[2]);
		month=Integer.parseInt(newInput[1]);
		day=Integer.parseInt(newInput[0]);
		
		Date newDate = new Date(year, month, day);
		BigInteger delitel = BigInteger.valueOf(86400000);
		BigInteger result = BigInteger.valueOf((newDate.getTime() - oldDate.getTime()));
		System.out.println(result.divide(delitel));
		// 86400000
	}

}

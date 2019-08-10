package DateTimeCalender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/Y"); // Uppercase M for month
		System.out.println(sdf.format(d)); // we have to use format method and bring the date object
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/Y hh:mm:ss");
		System.out.println(sdf1.format(d));
	}

}

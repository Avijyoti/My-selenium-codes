package einkAutomation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFinder {

	public static void main(String[] args) {
		
	    //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		//LocalDateTime now = LocalDateTime.now();  
		//System.out.println(dtf.format(now));  

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        Date date = new Date();
        String todate = dateFormat.format(date);
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -5);
        Date todate1 = cal.getTime();    
        String fromDate = dateFormat.format(todate1);
        
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE, -1);
        Date todate2 = cal1.getTime();
        String endDate = dateFormat.format(todate2);
       
        System.out.println("Today's Date: "+todate);
        System.out.println("Start Date: "+fromDate);
        System.out.println("End Date: "+endDate);
	}

}


import org.joda.time.*;
import org.joda.time.format.*;


class JodaTimeExample{  
	public static void main(String args[]){  
    	//System.out.println("Hello Java");  

		    DateTime dateTime = new DateTime()
            	.withMonthOfYear(4)
            	.withDayOfMonth(17);



            dateTime = dateTime.minusDays(31);



            final DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            	.appendLiteral("The date is ")
            	.appendDayOfMonth(2)
            	.appendLiteral(' ')
            	.appendMonthOfYearText()
            	.toFormatter();


           	String output = formatter.print(dateTime);


           	System.out.println("The expected value: " + "The date is 17 March\n");

           	System.out.println(output);




    }  
}  





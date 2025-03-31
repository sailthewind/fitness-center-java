public class Date {
 
      	private String month;
      	private int day;
      	private int year;

         
      	public Date()
      	{
           	month = "11";
           	day = 22;
           	year = 1995;
      	}
         
         
      	public Date(int month, int day, int year)
      	{
           	this.month = monthName(month);
           	this.day = day;
           	this.year = year;
              
      	}
      	/*public void setDate(int month, int day, int year)
      	{
           	this.month = monthName(month);
           	this.day = day;
           	this.year = year;
              
      	}*/
    
      	public String monthName(int month)
      	{
              
           	switch (month)
           	{
           	case 1:
                 	return "January";
           	case 2:
                 	return "February";
           	case 3:
                 	return "March";
           	case 4:
                 	return "April";
           	case 5:
                 	return "May";
           	case 6:
                 	return "June";
           	case 7:
                 	return "July";
           	case 8:
                 	return "August";
           	case 9:
                 	return "September";
           	case 10:
                 	return "October";
           	case 11:
                 	return "November";
           	case 12:
                 	return "December";
           	default:
                 	System.out.println("Fatal Error");
                 	System.exit(0);
                 	return "Error";
           	}             
      }
 
      	public String getMonth()
      	{
           		return this.month;
      	}
         
      	public int getDay()
      	{
           		return this.day;
      	}
         
      	public int getYear()
      	{
           		return this.year;
      	}
         
      	public String toString()
      	{
           		return getMonth()+ " " + getDay() + ", " + getYear();
                         
      	}
}



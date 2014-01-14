public class Holiday extends Event{
  public String NameofHoliday;
  
  public Holiday(String NoH,int d,int m){
    super (d,m);
    NameofHoliday = NoH;
  }
/**
 * Method that gets day
 * @param none
 * @return Day the day
 */ 
  public int getDay(){
    return Day;
  }
/**
 * Method that gets Month
 * @param none
 * @return Month the month
 */     
  public int getMonth(){
    return Month;
  }
/**
 * Method that gets name of holiday
 * @param none
 * @return NameofHoliday the name of holiday
 */   
  public String getNameofHoliday(){
    return NameofHoliday;
  }
/**
 * Method that prints info of the Holiday
 * @param none
 * @return NameofHoliday + "  Day - >" + Day + "   Month ->" + Month info of holiday
 */   
  public String printInfo(){
    return NameofHoliday + "  Day - >" + Day + "   Month ->" + Month;
}
}
    
    
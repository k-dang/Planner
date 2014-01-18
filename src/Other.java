public class Other extends Event{
  public String ActionsOnEvent;
  
  public Other(String AoE,String NoE,int d,int m){
    super(NoE,d,m);
    ActionsOnEvent = AoE;
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
 * Method that gets name of event
 * @param none
 * @return NameofEvent the name of event
 */     
  public String getEventName(){
    return NameofEvent;
  }
/**
 * Method that gets actions on event day
 * @param none
 * @return ActionsOnEvent the actions on event day
 */     
  public String getActionsOnEvent(){
    return ActionsOnEvent;
  }
/**
 * Method that gets info of the "Other" event
 * @param none
 * @return ActionsOnEvent + " for "+ NameofEvent + "  Day - >" + Day + "   Month ->" + Month info of "Other"
 */   
  public String printInfo(){
    return ActionsOnEvent + " for "+ NameofEvent + "  Day - >" + Day + "   Month ->" + Month;
}
}
  
  
abstract public class Event{
  public int Day;
  public int Month;
  public String NameofEvent;
  
  public Event(String n,int d,int m){
    NameofEvent = n;
    Day = d;
    Month = m;
  }
  
  public Event(int d,int m){
    Day = d;
    Month = m;
  }
                                                           
  abstract public int getDay();
  abstract public int getMonth();
  abstract public String printInfo();

}

  
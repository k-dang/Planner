import java.io.*;
interface CalendarHelper{
  public Holiday[] sortHoliday(Holiday holiday[]);
  
  public Birthday[] sortBirthday(Birthday b[]);
  
  public Other[] sortOther(Other o[]);
  
  public int searchHoliday(String Holi,Holiday holiday[],int low, int high);
  
  
  public int searchBirthday(String name,String rela,Birthday birthday[],int low, int high);
  
  public int searchOther(String oth,Other other[],int low, int high);
  
  public Holiday[] readinHoliday()throws IOException;
  
  public Birthday[] readinBirthday()throws IOException;
  
  public Other[] readinOther()throws IOException;
  
  public void writeoutHoliday()throws IOException;
  
  public void writeoutBirthday()throws IOException;
  
  public void writeoutOther()throws IOException;
  
}
  
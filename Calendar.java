import java.io.*;
public class Calendar implements CalendarHelper{
  public int Year;
  public Holiday[] holiday;
  public Birthday[] birthday;
  public Other[] other;
  
  public Calendar(int y){
    Year = y;
  }
 
/**
 * Method that adds a Holiday
 * @param nameofholiday The name of Holiday to be added
 * @param day The day to set the holiday to in number form
 * @param month The month to set the holiday to in number form
 * @return none
 */
  public void addHoliday(String nameofholiday,int day,int month){
    Holiday h = new Holiday(nameofholiday,day,month);
    if(holiday == null){
      holiday = new Holiday[1];
      holiday[0] = h;
    }else{
      Holiday hol[] = holiday;
      holiday = new Holiday[holiday.length+1];
      holiday[holiday.length - 1] = h;
      for(int i = 0;i<holiday.length-1;i++){
        holiday[i] = hol[i];
      }
    }
  }
/**
 * Method that adds a Birthday
 * @param NameofPerson The name of person's Birthday to be added
 * @param Relationship Your Relationship to that person
 * @param d The day to set the birthday to in number form
 * @param m The month to set the birthday to in number form
 * @return none
 */  
  public void addBirthday(String NameofPerson,String Relationship,int d,int m){
    Birthday b = new Birthday(NameofPerson,Relationship,d,m);
    if(birthday == null){
      birthday = new Birthday[1];
      birthday[0] = b;
    }else{
      Birthday bir[] = birthday;
      birthday = new Birthday[birthday.length+1];
      birthday[birthday.length - 1] = b;
      for(int i = 0;i<birthday.length-1;i++){
        birthday[i] = bir[i];
      }
    }
  }
/**
 * Method that adds an "Other" event
 * @param AoE Actions you will be doing on that day
 * @param NoE Name of the event
 * @param day The day to set the birthday to in number form
 * @param month The month to set the birthday to in number form
 * @return none
 */    
  public void addOther(String AoE,String NoE,int day,int month){
    Other o = new Other(AoE,NoE,day,month);
    if(other == null){
      other = new Other[1];
      other[0] = o;
    }else{
      Other oth[] = other;
      other = new Other[other.length+1];
      other[other.length - 1] = o;
      for(int i = 0;i<other.length-1;i++){
        other[i] = oth[i];
      }
    }
  }
/**
 * Method that deletes a Holiday
 * @param position
 * @return holiday new array with deleted position
 */  
  public Holiday[] deleteHoliday(int position){
    for(int i = position+1;i<holiday.length;i++){   
    holiday[i-1] = holiday[i];
    }
    Holiday temp[] = holiday;
    holiday = new Holiday[holiday.length-1];
    for(int x = 0;x<holiday.length;x++){
      holiday[x] = temp[x];
    }
    return holiday;
  }
/**
 * Method that deletes a Birthday
 * @param position
 * @return birthday new array with deleted position
 */  
  public Birthday[] deleteBirthday(int position){
    for(int i = position+1;i<birthday.length;i++){   
    birthday[i-1] = birthday[i];
    }
    Birthday temp[] = birthday;
    birthday = new Birthday[birthday.length-1];
    for(int x = 0;x<birthday.length;x++){
      birthday[x] = temp[x];
    }
    return birthday;
  }

/**
 * Method that deletes an "other"
 * @param position
 * @return other new array with deleted position
 */  
  public Other[] deleteOther(int position){
    for(int i = position+1;i<other.length;i++){   
    other[i-1] = other[i];
    }
    Other temp[] = other;
    other = new Other[other.length-1];
    for(int x = 0;x<other.length;x++){
      other[x] = temp[x];
    }
    return other;
  }
/**
 * Method that sorts Holiday array based on date
 * @param holiday[] the input array
 * @return holiday the sorted array
 */
  public Holiday[] sortHoliday(Holiday holiday[]){
    int n = holiday.length;
    for(int a = 0;a<n;a++){
      for(int b = 1;b<n-a;b++){
        if(holiday[b-1].getDay() > holiday[b].getDay() && holiday[b-1].getMonth() > holiday [b].getMonth()){
          Holiday c = holiday[b-1];
          holiday[b-1] = holiday[b];
          holiday[b] = c;
        }
      }
    }
    return holiday;
  }
/**
 * Method that sorts Birthday array based on date
 * @param Birthday[] the input array
 * @return Birthday the sorted array
 */  
  public Birthday[] sortBirthday(Birthday Birthday[]){
    int n = Birthday.length;
    for(int a = 0;a<n;a++){
      for(int b = 1;b<n-a;b++){
        if(Birthday[b-1].getDay() > Birthday[b].getDay() && Birthday[b-1].getMonth() > Birthday[b].getMonth()){
          Birthday c = Birthday[b-1];
          Birthday[b-1] = Birthday[b];
          Birthday[b] = c;
        }
      }
    }
    return Birthday;
  }
/**
 * Method that sorts Other array based on date
 * @param Other[] the input array
 * @return other the sorted array
 */  
  public Other[] sortOther(Other Other[]){
    int n = Other.length;
    for(int a = 0;a<n;a++){
      for(int b = 1;b<n-a;b++){
        if(Other[b-1].getDay() > Other[b].getDay() && Other[b-1].getMonth() > Other[b].getMonth()){
          Other c = Other[b-1];
          Other[b-1] = Other[b];
          Other[b] = c;
        }
      }
    }
    return Other;
  }
/**
 * Method that searches for a Holiday based on the name of the Holiday in an array
 * @param Holidayname Holiday you are searching for
 * @param holiday[] the input array to search within
 * @param low the first array index
 * @param high the length of the array
 * @return mid the position of the holiday in the array
 */
  public int searchHoliday(String Holidayname,Holiday holiday[],int low, int high){
          if (high <= low) 
          {
               return -1;
          }//end if
          int mid = low + (high - low) / 2;
          int cmp = ( holiday[mid].getNameofHoliday().compareTo(Holidayname));
          if      (cmp < 0) 
          {
               return searchHoliday(Holidayname, holiday, low, mid);
          }//end if
          else if (cmp > 0) 
          {
               return searchHoliday(Holidayname, holiday, mid+1, high);
          }//end else if
          else              
          {
               return mid;  
          }//end else
     }
     
/**
 * Method that searches for a Birthday based on the name of the Person and Relationship to that person, in an array
 * @param name Name of person's birthday you are searching for
 * @param rela Relationship to person's birthday you are searching for
 * @param birthday[] input array to search within
 * @param low the first array index
 * @param high the length of the array
 * @return mid the position of the holiday in the array
 */  
  public int searchBirthday(String name,String rela,Birthday birthday[],int low, int high){
          if (high <= low) 
          {
               return -1;
          }//end if
          int mid = low + (high - low) / 2;
          int cmp1 = ( birthday[mid].getNameofPerson().compareTo(name));
          int cmp = ( birthday[mid].getRelationship().compareTo(rela));
          if      (cmp1 < 0 && cmp < 0) 
          {
               return searchBirthday(name,rela, birthday, low, mid);
          }//end if
          else if (cmp1 > 0 && cmp >0) 
          {
               return searchBirthday(name,rela, birthday, mid+1, high);
          }//end else if
          else              
          {
               return mid;  
          }//end else
     }
/**
 * Method that searches for an "Other" based on the name of the Event
 * @param oth Name of event you are searching for
 * @param other[] the input array to search within
 * @param low the first array index
 * @param high the length of the array
 * @return mid the position of the holiday in the array
 */  
  public int searchOther(String oth,Other other[],int low, int high){
              if (high <= low) 
          {
               return -1;
          }//end if
          int mid = low + (high - low) / 2;
          int cmp = ( other[mid].getEventName().compareTo(oth));
          if      (cmp < 0) 
          {
               return searchOther(oth, other, low, mid);
          }//end if
          else if (cmp > 0) 
          {
               return searchOther(oth, other, mid+1, high);
          }//end else if
          else              
          {
               return mid;  
          }//end else
     }
/**
 * Method that reads in HolidayTextFile and makes Holiday objects based on the file
 * @param none
 * @return holiday array of objects made from reaing in the file
 */
  public Holiday[] readinHoliday()throws IOException{
    String str = "";
    String hol[];
    String delimeter = ",";
    InputStreamReader input = new InputStreamReader (System.in);
    BufferedReader in = new BufferedReader (new FileReader ("HolidayTextFile.txt"));
    int b = 0;
    int i = 0;
     while ((str = in.readLine ()) != null){
        b++;
     }
     holiday = new Holiday[b];
     in.close();
     BufferedReader in1 = new BufferedReader (new FileReader ("HolidayTextFile.txt"));
     
     while((str = in1.readLine()) != null){
       hol = str.split(delimeter);
       String noh = hol[0].trim();
       int daa = Integer.parseInt(hol[1].trim());
       int moo = Integer.parseInt(hol[2].trim());
       //System.out.println(daa);
       //System.out.println(noh);
       holiday[i] = new Holiday(noh,daa,moo);
       i++;
     }
     in1.close();
     return holiday;
     }
/**
 * Method that reads in BirthdayTextFile and makes Birthday objects based on the file
 * @param none
 * @return birthday array of objects made from reaing in the file
 */  
  public Birthday[] readinBirthday()throws IOException{
    String str = "";
    String bir[];
    String delimeter = ",";
    InputStreamReader input = new InputStreamReader (System.in);
    BufferedReader in = new BufferedReader (new FileReader ("BirthdayTextFile.txt"));
    int b = 0;
    int i = 0;
     while ((str = in.readLine ()) != null){
        b++;
     }
     birthday = new Birthday[b];
     in.close();
     BufferedReader in1 = new BufferedReader (new FileReader ("BirthdayTextFile.txt"));
     
     while((str = in1.readLine()) != null){
       bir = str.split(delimeter);
       String name = bir[0].trim();
       String rel = bir[1].trim();
       int daa = Integer.parseInt(bir[2].trim());
       int moo = Integer.parseInt(bir[3].trim());
       birthday[i] = new Birthday(name,rel,daa,moo);
       i++;
     }
     return birthday;
     }
/**
 * Method that reads in OtherTextFile and makes Other objects based on the file
 * @param none
 * @return other array of objects made from reaing in the file
 */  
  public Other[] readinOther()throws IOException{
    String str = "";
    String oth[];
    String delimeter = ",";
    InputStreamReader input = new InputStreamReader (System.in);
    BufferedReader in = new BufferedReader (new FileReader ("OtherTextFile.txt"));
    int b = 0;
    int i = 0;
     while ((str = in.readLine ()) != null){
        b++;
     }
     other = new Other[b];
     in.close();
     BufferedReader in1 = new BufferedReader (new FileReader ("OtherTextFile.txt"));
     
     while((str = in1.readLine()) != null){
       oth = str.split(delimeter);
       String aoe = oth[0].trim();
       String noe = oth[1].trim();
       int daa = Integer.parseInt(oth[2].trim());
       int moo = Integer.parseInt(oth[3].trim());
       other[i] = new Other(aoe,noe,daa,moo);
       i++;
     }
     return other;
     }
/**
 * Method that writes all of the array objects from Holiday to a file seperating each info with a comma
 * @param none
 * @return none
 */
  public void writeoutHoliday()throws IOException{
      FileWriter fstream = new FileWriter ("HolidayTextFile.txt");
      BufferedWriter out = new BufferedWriter (fstream);
      for(int i = 0;i<holiday.length;i++){
              out.write(holiday[i].getNameofHoliday() + ",\t" + holiday[i].getDay() + ",\t" + holiday[i].getMonth()+",");
        out.newLine();
      }
      out.close();
  }
/**
 * Method that writes all of the array objects from Birthday to a file seperating each info with a comma
 * @param none
 * @return none
 */  
  public void writeoutBirthday()throws IOException{
          FileWriter fstream = new FileWriter ("BirthdayTextFile.txt");
      BufferedWriter out = new BufferedWriter (fstream);
      for(int i = 0;i<birthday.length;i++){
              out.write(birthday[i].getNameofPerson() + ",\t" + birthday[i].getRelationship() + ",\t" + birthday[i].getDay() + ",\t" + birthday[i].getMonth()+",");
      }
  out.newLine();
  }
/**
 * Method that writes all of the array objects from Other to a file seperating each info with a comma
 * @param none
 * @return none
 */  
  public void writeoutOther()throws IOException{
          FileWriter fstream = new FileWriter ("OtherTextFile.txt");
      BufferedWriter out = new BufferedWriter (fstream);
              for(int i = 0;i<birthday.length;i++){
                out.write(other[i].getActionsOnEvent() + ",\t" + other[i].getEventName() + ",\t" + other[i].getDay() + ",\t" + other[i].getMonth()+",");
              }
        out.newLine();
  }
}



public class Birthday extends Event{
  public String NameofPerson;
  public String Relationship;
  
  public Birthday(String NoP,String r,int d,int m){
    super(d,m);
    NameofPerson = NoP;
    Relationship = r;
  }
/**
 * Method that gets relationship
 * @param none
 * @return Relationship the relationship
 */
  public String getRelationship(){
    return Relationship;
  }
/**
 * Method that gets name of person
 * @param none
 * @return NameofPerson the name of person
 */ 
  public String getNameofPerson(){
    return NameofPerson;
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
 * Method that prints info of the BirthDay
 * @param none
 * @return NameofPerson+"'s"+" "+"Birthday "+ " Day;"+Day + "  Month:" + Month info of the birthday
 */
  public String printInfo(){
    return NameofPerson+"'s"+" "+"Birthday "+ " Day;"+Day + "  Month:" + Month;
  }
}
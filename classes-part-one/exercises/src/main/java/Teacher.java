public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }
    private void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    private void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getSubject(String subject){
        return subject;
    }
    private void setSubject(){
        this.subject = subject;
    }

    public int getYearsTeaching(){
        return yearsTeaching;
    }
    private void setYearsTeaching(int yearsTeaching){
        this.yearsTeaching = yearsTeaching;
    }


}

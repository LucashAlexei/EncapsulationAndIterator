import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTest implements Comparable<MainTest> {
    protected String fullName;
    protected int age;
    protected String occupation;

    MainTest(){
    }
    MainTest(String fullName, int age, String occupation){
        this.fullName=fullName;
        this.age=age;
        this.occupation=occupation;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setFullName(String fullName) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]");
        Matcher matcher = pattern.matcher(fullName);
        if(matcher.find()) {
            this.fullName = fullName;
        } else{
        this.fullName="NaN";
        }
    }

    public void setAge(int age) {
        if(age>18 && age<120){
        this.age = age;
        }else{
            this.age=0;
        }
    }

    public void setOccupation(String occupation) {
        Pattern pattern = Pattern.compile("[A-z]");
        Matcher matcher = pattern.matcher(occupation);
        if(matcher.find()) {
            this.occupation = occupation;
        }else{
            this.occupation="NaN";
        }
    }
    public void print(){
        System.out.println("/n"+fullName+ " "+age+" "+occupation);
    }
    @Override
    public int compareTo(MainTest o){
        return this.getFullName().compareTo(o.getFullName());
    }
}

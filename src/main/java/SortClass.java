import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortClass implements Comparator<MainTest> {

    ArrayList<MainTest> list= new ArrayList<>();

    public int compare(MainTest o1, MainTest o2){
        return o1.getFullName().compareTo(o2.getFullName());
    }
    public void pushMethod(MainTest tmp){
        list.add(tmp);
        Collections.sort(list, this::compare);
    }
    public void print(){
        for(MainTest i: list){
            System.out.println(i.getFullName() + "\t" + i.getAge() + "\t" + i.getOccupation());
        }
    }

}

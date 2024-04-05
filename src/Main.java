import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Long", 25, "BTL");
        Student student2 = new Student("Linh", 26, "HTR");
        Student student3 = new Student("Phuong", 24, "HET");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);

        Collections.sort(lists);
        for (Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st :lists){
            System.out.println(st.toString());
        }
    }
}
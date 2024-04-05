package March29th;
import javax.lang.model.element.Name;
import java.util.Scanner;
public class Student {
    String name;
    String department;
    Scanner scanner = new Scanner(System.in);
    private int age;
    Student(){
        name="황룡";
        age=21;
        department= "정기관";
    }

    Student(int ageInput){
        name="황룡";
        age=ageInput;
        department= "정기관";
    }

    public void set(String nameInput,String departmentInput,int ageInput) {
        name = nameInput;
        department= departmentInput;
        age=ageInput;
        return ;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("악!"+name+ " 해병님은 "+department+"에 계시며 "+age+"세이십니다!");
        return;
    }

}

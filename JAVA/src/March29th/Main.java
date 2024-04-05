package March29th;

public class Main {
    public static void main(String[] args) {
        hwang();
        return;
    }
    public static void hwang(){
        Student hwangguenchul = new Student();
        hwangguenchul.print();
        hwangguenchul.set("황근출","해병성채",99);
        String nameOfHwang = hwangguenchul.getName();
        System.out.println(nameOfHwang);
        String departmentOfHwang = hwangguenchul.getDepartment();
        System.out.println(departmentOfHwang);
        int ageOfHwang = hwangguenchul.getAge();
        System.out.println(ageOfHwang);
        hwangguenchul.print();
        return;
    }
}

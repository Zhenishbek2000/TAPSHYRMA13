import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass=new MyClass("Jenishbek  ","  Asangaziev  ", 21,new String[]{" Java "," Boxing "," English "}," lagman");
        MyClass myClass1=new MyClass();
        myClass1.setName("Azamat");
        myClass1.setFullname("Asanov");
        myClass1.setAge(21);
        myClass1.setCourses(new String[]{"  JS  "," Boxsing "," English"});
        myClass1.setDishes("Kuurdak");
        System.out.println(myClass.getName()+" "+myClass.getFullname()+" "+myClass.getAge()+" "+ Arrays.toString(myClass.getCourses())+" "+myClass.getDishes());
        System.out.println(myClass1.getName()+" "+myClass1.getFullname()+" "+myClass1.getAge()+" "+Arrays.toString(myClass1.getCourses())+" ,"+myClass1.getDishes());
    }
}
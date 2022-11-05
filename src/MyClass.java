import javax.rmi.ssl.SslRMIClientSocketFactory;

public class MyClass {
    private String name;
    private String fullname;
    private int age ;
    private String[]courses;
    private String dishes;
    public MyClass(String name,String fullname,int age,String[]courses,String dishes){
        this.name=name;
        this.fullname=fullname;
        this.age=age;
        this.courses=courses;
        this.dishes=dishes;

    }
    public MyClass(){}
   public void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
   public void setFullname(String fullname){
        this.fullname=fullname;
    }
    String getFullname(){
        return fullname;
    }
   public void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return  age;
    }
     public void setCourses(String[] courses){
        this.courses=courses;
    }
    String[]getCourses(){
        return courses;
    }
    public void setDishes(String dishes){
        this.dishes=dishes;
    }
    String getDishes(){
        return dishes;
    }
    }


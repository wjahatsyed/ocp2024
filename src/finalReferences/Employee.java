package finalReferences;

public class Employee {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

}

class FinalReferenceExample{
    public static void main(String[] args){
        System.out.println("They are no final objects, only final references");
        Employee employee = new Employee();
        employee.setAge(10);
        employee.setName("Abdul Hadi");
        final Employee employee1 = employee;
        System.out.println(employee1.getName());
        employee1.setName("Abdul Moiz");
        System.out.println(employee1.getName());


    }
}

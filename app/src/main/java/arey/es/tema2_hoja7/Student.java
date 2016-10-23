package arey.es.tema2_hoja7;

/**
 * Created by ireneyera on 23/10/16.
 */

public class Student {
        private String name;
        private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ". Edad: " + age;
    }

    public void happyBirthday() {
        age++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

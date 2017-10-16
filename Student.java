package task05;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class Student<T> implements Comparable{

    String name;
    Task05ForEnumsAndParametrization.Subjects s;

    public String getName() {
        return name;
    }

    public Student(String s) {
        this.name = s;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return name.compareTo(((Student)o).getName());
    }

    @Override
    public String toString(){
        return name;
    }
}

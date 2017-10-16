package task05;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class GroupStudents<T> implements Comparable{

    Task05ForEnumsAndParametrization.Subjects subject;
    Map<Student, ArrayList<T>> journalOfGroup = new TreeMap<>();

    public GroupStudents(Task05ForEnumsAndParametrization.Subjects subject, String path) throws IOException {
        this.subject = subject;
        addStudents(Files.lines(Paths.get(path), StandardCharsets.UTF_8).toArray());
    }

    void addStudent(Student student){
        journalOfGroup.put(student, new ArrayList<>());
    }
    void addStudents(Object[] students){
        for (Object s:
             students) {
            journalOfGroup.put(new Student((String)s), new ArrayList<T>());
        }
    }

    boolean isContains(Student student){
        return journalOfGroup.containsKey(student);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if(((GroupStudents) o).journalOfGroup.equals(this.journalOfGroup))
            return 0;
        for (Student s: journalOfGroup.keySet()) {
            if(((GroupStudents)o).isContains(s))
                return -1;
        }
        return 0;
    }
}

package task05;

import java.io.IOException;

public class Example extends GroupStudents<Number>{

    private final GroupStudents t;

    public Example(GroupStudents t) throws IOException {
        super(Task05ForEnumsAndParametrization.Subjects.LITERATURE, "");
        this.t = t;
    }
}

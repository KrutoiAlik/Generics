package task05;

import java.io.*;
import java.util.*;

public class Task05ForEnumsAndParametrization {

    static String path = "oop/src/main/java/task05/";

    enum Subjects implements Addeable {

        LITERATURE {

            boolean isInt = true;

            @Override
            public boolean isInt() {
                System.out.println("INTEGER");
                return isInt;
            }
        },

        MATHEMATICS {

            boolean isInt = false;

            @Override
            public boolean isInt() {

                System.out.println("DOUBLE");
                return isInt;
            }
        }
    }

    static HashMap<Subjects, ArrayList<GroupStudents>> enumGroups = new HashMap<>();

    public static void main(String[] args) throws IOException {
        init();
        enumGroups.get(Subjects.LITERATURE).add(initGroup(Subjects.LITERATURE, new File("Example.txt")));
        ArrayList<GroupStudents> set = enumGroups.get(Subjects.LITERATURE);
        for (Object s : set.get(0).journalOfGroup.keySet()) System.out.println(((Student) s).getName());
    }

    static GroupStudents initGroup(Subjects s, File group) throws IOException {
        return new GroupStudents(s, path + group.getPath());
    }

    static void init() {
        for (Subjects s : Subjects.values())
            if (s.isInt())
                enumGroups.put(s, new ArrayList<GroupStudents<Integer>>());
            else
                enumGroups.put(s, new ArrayList<GroupStudents<Double>>());
    }
}

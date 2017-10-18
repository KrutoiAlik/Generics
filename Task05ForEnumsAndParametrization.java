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

    static HashMap<Subjects, ArrayList<? extends GroupStudents<? extends Number>>> enumGroups = new HashMap<>();

    public static void main(String[] args) throws IOException {

        /**
         * Создание бланка (Предмет, Группа)
         */
        init();

        Subjects s = Subjects.LITERATURE;
        enumGroups.get(s).add(initGroup(s, new File("Example.txt")));

        ArrayList<? extends GroupStudents> set = enumGroups.get(Subjects.LITERATURE);
        for (Object o : set.get(0).journalOfGroup.keySet()) System.out.println(((Student) o).getName());
    }

    static GroupStudents<? extends Number> initGroup(Subjects s, File group) throws IOException {
        return new GroupStudents(s, "" + group.getPath());
    }

    static <T extends Number> void init() {
        for (Subjects s : Subjects.values()) enumGroups.put(s, new ArrayList<GroupStudents<T>>());
    }
}

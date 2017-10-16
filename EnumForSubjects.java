package task05;

import java.util.ArrayList;

public enum EnumForSubjects{

    MATHEMATICS(){

        public void addGraceIn(double grace, ArrayList<Double> in){
            in.add(grace);
        }
    },

    LITERATURE{

        public void addGraceIn(int grace, ArrayList<Integer> in){
            in.add(grace);
        }
    };

    static void listSubjects(){
        for (EnumForSubjects e: EnumForSubjects.values()) {
            System.out.println(e.name());
        }
    }
}

package io.codelex.typesandvariables.practice;

public class Table {
    public static void main(String[] args){
        String  course1="English III",
                course2="Precalculus",
                course3="Music Theory",
                course4="Biotechnology",
                course5="Principles of Technology I",
                course6="Latin II",
                course7="AP US History",
                course8="Business Computer Information Systems",
                teacher1="Ms. Lapan",
                teacher2="Mrs. Gideon",
                teacher3="Mr. Davis",
                teacher4="Ms. Palmer",
                teacher5="Ms. Garcia",
                teacher6="Mrs. Barnett",
                teacher7="Ms. Johannessen",
                teacher8=" Mr. James";

            int courseWidth=37;
        System.out.println("+------------------------------------------------------------+");
        System.out.printf("| 1 | %" + courseWidth + "s| %15s |%n", course1, teacher1);
        System.out.printf("| 2 | %" + courseWidth + "s| %15s |%n", course2, teacher2);
        System.out.printf("| 3 | %" + courseWidth + "s| %15s |%n", course3, teacher3);
        System.out.printf("| 4 | %" + courseWidth + "s| %15s |%n", course4, teacher4);
        System.out.printf("| 5 | %" + courseWidth + "s| %15s |%n", course5, teacher5);
        System.out.printf("| 6 | %" + courseWidth + "s| %15s |%n", course6, teacher6);
        System.out.printf("| 7 | %" + courseWidth + "s| %15s |%n", course7, teacher7);
        System.out.printf("| 8 | %" + courseWidth + "s| %15s |%n", course8, teacher8);
        System.out.println("+------------------------------------------------------------+");

    }
}

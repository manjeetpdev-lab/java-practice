package practice;

public class Main {

    public static void main(String[] args) {

        // =========================
        // Part A - String
        // =========================

        String name = "  Manjeet Pandey  ";

        String cleanedName = name.trim();

        System.out.println(cleanedName);
        System.out.println(cleanedName.toUpperCase());
        System.out.println(cleanedName.toLowerCase());


        // =========================
        // Part B - Comparison
        // =========================

        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b);
        System.out.println(a.equals(b));


        // =========================
        // Part C - StringBuilder
        // =========================

        StringBuilder result = new StringBuilder();

        result.append("Employee: Manjeet\n");
        result.append("Employee: Rahul\n");
        result.append("Employee: Amit\n");

        System.out.println(result);


        // =========================
        // Part D - Array
        // =========================

        int[] salaries = {50000, 60000, 75000, 90000, 120000};

        int total = 0;

        for (int i = 0; i < salaries.length; i++) {

            System.out.println(salaries[i]);

            total = total + salaries[i];
        }

        System.out.println("Total salary: " + total);


        // =========================
        // Part E - split + for-each
        // =========================

        String employees = "Manjeet,Rahul,Amit,Neha";

        String[] employeeArray = employees.split(",");

        for (String employee : employeeArray) {

            System.out.println("Employee: " + employee);
        }


        // =========================
        // Part F - String immutability
        // =========================

        String s = "Java";

        s = s.concat(" Developer");

        System.out.println(s);
    }
}
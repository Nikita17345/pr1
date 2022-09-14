public class Main {
    public static void main(String[] args) {
        try {

            Employee[] e_arr = new Employee[3];

            e_arr[0] = new Employee("Sasha", "Karpenko", 0);
            e_arr[1] = new Employee("Yaroslav", "Kyslenko", 0);
            e_arr[2] = new Employee("Anton", "Rodionov", -50);

            for (int i = 0; i < e_arr.length; i++)
                System.out.println(e_arr[i]);

        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            e.printStackTrace();
        }

    }
}
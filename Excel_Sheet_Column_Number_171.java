public class Excel_Sheet_Column_Number_171 {
    public int titleToNumber(String columnTitle) {

        int result = 0;
        int n = columnTitle.length();
        for (int i = 0; i < n; i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Excel_Sheet_Column_Number_171 solution = new Excel_Sheet_Column_Number_171();
        System.out.println(solution.titleToNumber("Adfa"));

    }
}

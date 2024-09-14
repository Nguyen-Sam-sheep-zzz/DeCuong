package DeCuong.Phan2_1.Bai2;

import java.util.regex.Pattern;

public class NameValidator {
    public static boolean isValidName(String name) {
        // Tên sách và tên tác giả chỉ chứa chữ cái, dấu cách, và dấu gạch ngang
        String namePattern = "^[a-zA-Z\\s\\-]+$";
        return Pattern.matches(namePattern, name);
    }

    public static void main(String[] args) {
        System.out.println(isValidName("Harry Potter")); // true
        System.out.println(isValidName("J.K. Rowling")); // false (có dấu chấm)
        System.out.println(isValidName("George R.R. Martin")); // false (có dấu chấm)
        System.out.println(isValidName("Isaac Asimov")); // true
        System.out.println(isValidName("The Catcher in the Rye-")); // true
    }
}

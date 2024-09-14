package DeCuong.Phan2_1.Bai2;

import java.util.regex.Pattern;

public class ISBNValidator {
    public static boolean isValidISBN(String isbn) {
        // Kiểm tra ISBN-10
        String isbn10Pattern = "^(\\d{9}[\\dX])$";
        // Kiểm tra ISBN-13
        String isbn13Pattern = "^(97[89]\\d{10})$";

        return Pattern.matches(isbn10Pattern, isbn) || Pattern.matches(isbn13Pattern, isbn);
    }

    public static void main(String[] args) {
        System.out.println(isValidISBN("123456789X")); // true (ISBN-10)
        System.out.println(isValidISBN("9781234567897")); // true (ISBN-13)
        System.out.println(isValidISBN("1234567890")); // true (ISBN-10)
        System.out.println(isValidISBN("9791234567890")); // true (ISBN-13)
        System.out.println(isValidISBN("123456789")); // false
    }
}

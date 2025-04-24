package meryem_nobatova_1.midterm1.t2.carrot.sub;

import meryem_nobatova_1.midterm1.t2.carrot.A21;
import meryem_nobatova_1.midterm1.t2.grater.recitative.A22;

import java.lang.reflect.Field;

public class R21 {
    public static void main(String[] args) {
        A21 rectangle = new A21();

        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of the rectangle: " + area);

        A22 date = new A22();
        try {
            Field monthField = A22.class.getDeclaredField("month");
            monthField.setAccessible(true); // Bypass private access
            int monthNumber = (int) monthField.get(date);

            if (monthNumber >= 1 && monthNumber <= 12) {
                String[] months = {
                        "January", "February", "March", "April", "May", "June",
                        "July", "August", "September", "October", "November", "December"
                };
                System.out.println("Month name: " + months[monthNumber - 1]);
            } else {
                System.out.println("Invalid month number: " + monthNumber);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Error accessing month field: " + e.getMessage());
        }
    }
}

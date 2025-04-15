package Lesson1_JavaGetStarted;

public class JavaGetStarted2 {
    public static void main(String args[]) {        // psvm:   public static void main
        //  sout:   System.out.println();
        System.out.println(1);                      // Xuất ra số nguyên
        System.out.println(1.0);                    // Xuất ra số thực
        System.out.println("Java Get Started");     // Xuất ra chuỗi (Xuất chuỗi dữ liệu) theo dòng và tự động xuống dòng

        /**
         *  println (print line)
         *  In ra dữ liệu một cách đơn giản và tự động xuống dòng sau khi in.
         *  Dùng khi bạn chỉ cần in text, số, biến… một cách nhanh chóng.
        */
        System.out.printf("Tên: %s, Tuổi: %d%n", "Anh", 21);
        // In: Tên: Anh, Tuổi: 21 (rồi xuống dòng)
        /**
         *  printf (print formatted)
         *  Dùng để định dạng chuỗi trước khi in (giống printf trong C).
         *  Không tự động xuống dòng (nếu muốn, bạn phải thêm \n hoặc %n).
         *  Hữu ích khi in số, chuỗi theo định dạng cụ thể (ví dụ: làm tròn số, căn lề, in tiền tệ, v.v.)
         *
         *  Ký hiệu	    Ý nghĩa
         *  %s	        Chuỗi (String)
         *  %d	        Số nguyên (int)
         *  %f	        Số thực (float/double)
         *  %.          Làm tròn số thực tới 2 chữ số sau dấu chấm
         *  %n	        Xuống dòng (tốt hơn \n vì tương thích mọi HĐH)
         */
    }
}

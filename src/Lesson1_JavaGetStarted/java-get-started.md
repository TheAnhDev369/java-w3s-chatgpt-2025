# Học Java từ W3Schools - Ghi chú Tiếng Việt

## Cài đặt Java

Một số máy tính có thể đã cài sẵn Java.

### Kiểm tra Java trên Windows

1. Mở thanh Start, tìm từ khóa “Java”.
2. Hoặc mở Command Prompt (cmd.exe), gõ lệnh:

```bash
- java -version
- Nếu Java đã được cài, bạn sẽ thấy dòng tương tự như:
java version "22.0.0" 2024-08-21 LTS
Java(TM) SE Runtime Environment 22.9 (build 22.0.0+13-LTS)
Java HotSpot(TM) 64-Bit Server VM 22.9 (build 22.0.0+13-LTS, mixed mode)

- Nếu chưa cài, bạn có thể tải miễn phí tại:
- https://www.oracle.com/java/technologies/javase-downloads.html

💡 Lưu ý: 
- Trong hướng dẫn này, ta sẽ viết mã Java bằng trình soạn thảo văn bản như Notepad. 
- Với dự án lớn, có thể dùng IDE như IntelliJ IDEA, NetBeans hoặc Eclipse.
```
---

## Bắt đầu với Java

Trong Java, mọi chương trình đều bắt đầu bằng một **class (lớp)**, và tên class phải **giống tên file**.

Ví dụ: tạo file `Main.java` có nội dung như sau:

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```
```
-   📝 Đừng lo nếu bạn chưa hiểu mã – phần sau sẽ giải thích kỹ. 
-   Bây giờ tập trung chạy chương trình.
-   Shift + F10 => chạy chương trình Java (IDEA JetBrains)
```

##  Cách chạy chương trình:
-   Lưu file với tên Main.java.
-   Mở Command Prompt và chuyển đến thư mục chứa file (dùng cd).
-   Biên dịch mã Java:

```
javac Main.java
```
-   Nếu không có lỗi, chạy chương trình:
```
java Main
```
-   Kết quả:
```
Hello World
```
```
🎉 Chúc mừng! Bạn đã chạy thành công chương trình Java đầu tiên.
```
---
##  Dùng trình biên tập trực tuyến của W3Schools

```bash
- Bạn có thể học Java trực tiếp trên W3Schools bằng công cụ “Try it Yourself”:
- https://www.w3schools.com/java/tryjava.asp_
```
Ví dụ:  
```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```
Trình biên tập này rất tiện lợi để viết và chạy mã ngay trong trình duyệt.
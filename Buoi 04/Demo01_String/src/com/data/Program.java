package com.data;

public class Program {
    public static void main(String[] args) {
        // String
        // hàm cơ bản String:
        // trim: cắt khoảng trắng trước và sau chuỗi
        // trim cắt "    Nguyen Ngoc  " => "Nguyen Ngoc"

        // split: Cắt chuỗi theo ký tự: "Space", ",", ";", "|", ...
        // split: Cắt chuỗi "Nguyen Van Ngoc" theo dấu cách
        // split: kết quả là mảng: "Nguyen", "Van", "Ngoc"

        // equals: so sáng giá trị chuỗi
        // equals: String ("Nam") == String("Nam") ( chắc chắn true)
        // ==: So sánh giá trị tham chiếu
        // ==: String ("Nam") != String("Nam") (chưa chắc true)

        // indexOf: lấy vị trí chuỗi:
        // indexOf:Chuỗi "xin": trong chuỗi "Toi xin phep nghi 1 hom"
        // indexOf: trả về vị trí 4
        // indexOf: nếu k có vị trí = -1

        // length: lấy độ dài chuỗi
        // length: chuỗi "Nguyen" => length: 6

        // replace: thay thế chuỗi
        // replace: thay chuỗi "ab" thành chuỗi "xx"
        // replace: trong chuỗi "phanh abs cua anh absan bi hong"
        // replace: "phanh xxs cua anh xxsan bi hong"

        String fullName = "   Ton Ngo Khong   ";
        System.out.println("Chuoi truoc khi cat: " + fullName);
        String result1 = fullName.trim();
        System.out.println("Ham trim: " + result1);

        String fullName2 = "Ton Hanh Gia";
        String fullName3 = "Ton; Hanh ;Gia 2 ";
        String[] result2 = fullName2.split(" ");
        String[] result3 = fullName3.split(";");

        System.out.println(result3[2]);
    }
}

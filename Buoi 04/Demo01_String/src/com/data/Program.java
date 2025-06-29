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

        // ham indexOf
        System.out.println("ham indexOf");
        String time = "Thoi gian nghi he den 15/8";
        String chuoiA = "gia";
        String chuoiB = "Gia";
        String chuoiC = "i";

        int viTri1 = time.indexOf(chuoiA);
        int viTri2 = time.indexOf(chuoiB);
        int viTri3 = time.indexOf(chuoiC);

        System.out.println("Vi tri 1: " + viTri1);
        System.out.println("Vi tri 2: " + viTri2);
        System.out.println("Vi tri 3: " + viTri3);

        System.out.println("Length: " + time.length());

        String chuoi6 = "phanh abs cua anh absan bi hong";
        String chuoiRe = "xx";

        String result6 = chuoi6.replace("ab", "xx");
        System.out.println("Replace: " + result6);

        // So sánh String
        String name1 = "a";
        String name2 = new String("a");
        String name3 = "a";

        System.out.println("Ket qua so sanh name1 vs name3: " + (name1 == name3));
        System.out.println("Ket qua so sanh name2 vs name3: " + (name2 == name3));

        // so sanh equals: giá trị đều là a, nên sẽ là true
        System.out.println("Ket qua so sanh name1 'equals' name3: " + (name1.equals(name3)));
        System.out.println("Ket qua so sanh name2 'equals' name3: " + (name2.equals(name3)));

    }
}

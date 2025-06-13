package com.data.thuchanh1;

public class Student extends Person {
    public int id;

    public double diemTrungBinh;

    public String email;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", diemTrungBinh=" + diemTrungBinh +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

package com.data.model;

public class Program {
    private static String companyName = "OpenAI";

    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public void showInfo() {
            System.out.println(name + " làm việc tại " + companyName);
        }
    }

    public static void main(String[] args) {
        Program.Employee employee = new Program.Employee(companyName);
        employee.showInfo();
    }
}

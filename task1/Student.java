package lesson9.task1;

public class Student {
        private String firstName;
        private String lastName;
        private int mark;
        private int age;

        public Student (String firstName, String lastName, int mark, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.mark = mark;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getMark() {
            return mark;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public int getAge() {
            return age;
        }
    }
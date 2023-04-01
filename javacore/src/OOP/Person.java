package OOP;

import java.util.Scanner;

public class Person {
        private int id;
        private String name;
        private int age;

        public Person(){

        }
        public Person(int id, String name, int age) {
                this.id = id;
                this.name = name;
                this.age = age;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }


        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        @Override
        public String toString() {
                return "Person{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        '}';
        }
        public void nhapThongTin(Scanner sc){
                System.out.println("Mời bạn nhập id: ");
                id= Integer.parseInt(sc.nextLine());
                System.out.println("Mời bạn nhập name: ");
                name= sc.nextLine();
                System.out.println("Mời bạn nhập age: ");
                age= Integer.parseInt(sc.nextLine());
        }
        public  void hienThiThongTin(){
                System.out.println(id);
                System.out.println(name);
                System.out.println(age);
        }
}

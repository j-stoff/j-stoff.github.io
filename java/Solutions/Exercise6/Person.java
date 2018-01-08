public class Person {
 private String name;
 private int age;

 public Person() {
 }

 public Person(String personName, int personAge) {
    this.name = personName;
    this.age = personAge;
 }

 public String getName() {
    return this.name;
 }

 public void setName(String name) {
    this.name = name;
 }

 public int getAge() {
    return this.age;
 }

 public void setAge(int age) {
    this.age = age;
 }
}
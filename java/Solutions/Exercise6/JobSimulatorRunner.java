public class JobSimulatorRunner {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Jake");
        person1.setAge(26);

        System.out.println("Person 1 stats: " + person1.getName() 
            + ", Age: " + person1.getAge());

        Person person2 = new Person("Bob", 60);

        System.out.println("Person 2 stats: " + person2.getName() 
            + ", Age: " + person2.getAge());

        Employee employee1 = new Employee();
        employee1.setName("Bill");
        employee1.setAge(40);
        employee1.setJobType("Plumber");

        System.out.println("Employee 1: " + employee1.getName()
            + ", Age: " + employee1.getAge() + ", Job type: " + employee1.getJobType());
        
        Employee employee2 = new Employee("Astronaught", "John", 44);

        System.out.println("Employee 1: " + employee2.getName()
            + ", Age: " + employee2.getAge() + ", Job type: " + employee2.getJobType());
        

        System.out.println("Employee 2 makes: " + employee2.getPaid());

        ITWorker itworker1 = new ITWorker("Infastructure", "Kenny", 66, "Application Developer");

        System.out.println("IT worker: " + itworker1.getName() 
            + ", Age: " + itworker1.getAge() 
            + ", Job Type: " + itworker1.getJobType()
            + ", Division: " + itworker1.getDivision());
    }
}
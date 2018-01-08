public class Employee extends Person {
    private String jobType;

    public Employee() {
        super();
    }

    public Employee(String jobType, String name, int age) {
        super(name, age);
        this.jobType = jobType;
    }

    public String getJobType() {
        return this.jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public int getPaid() {
        return super.getAge() * 100;
    }
}
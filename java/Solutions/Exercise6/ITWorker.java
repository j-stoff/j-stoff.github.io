public class ITWorker extends Employee {
    private String division;

    public ITWorker(String division, String name, int age, String jobType) {
        super(jobType, name, age);
        this.division = division;
    }

    public String getDivision() {
        return this.division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
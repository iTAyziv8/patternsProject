package Entities;

public class Configuration
{
    private String version;
    private String StudentName1;
    private String StudentName2;

    public Configuration(ConfigurationInput input) {
        this.version = input.getVersion();
        this.StudentName1 = input.getStudentName1();
        this.StudentName2 = input.getStudentName2();
    }

    public String getVersion() {
        return version;
    }

    public String getStudentName1() {
        return StudentName1;
    }

    public String getStudentName2() {
        return StudentName2;
    }
}

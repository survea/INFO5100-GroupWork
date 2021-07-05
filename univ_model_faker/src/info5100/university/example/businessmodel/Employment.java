package info5100.university.example.businessmodel;

/**
 * @author Moumita
 */
public class Employment {
    String employmentId;
    Employer employer;
    String tenure;
    String designation;
    int numberOfTimesPromoted;

    public Employment(String employmentId,
            Employer employer,
            String tenure,
            String designation,
            int numberOfTimesPromoted){
        this.employmentId = employmentId;
        this.employer = employer;
        this.tenure = tenure;
        this.designation = designation;
        this.numberOfTimesPromoted = numberOfTimesPromoted;
    }

    public Employer getEmployer(){return employer;}

    @Override
    public String toString() {
        return "Employment{" +
                "employmentId='" + employmentId + '\'' + "\n" +
                ", employer=" + employer + "\n" +
                ", tenure='" + tenure + '\'' + "\n" +
                ", designation='" + designation + '\'' + "\n" +
                ", numberOfTimesPromoted=" + numberOfTimesPromoted + "\n" +
                '}';
    }
}

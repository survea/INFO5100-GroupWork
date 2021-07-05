package info5100.university.example.businessmodel;

/**
 * @author Moumita
 */
public class Employer implements Comparable<Employer> {
    String employerId;
    String employerName;

    String website; //"Website": "www.marni-company.com",
    String industry; //"Industry": "Nonprofit Organization Management",

    Reputation reputation;

    public Employer(String employerId,
                    String employerName,
                    String website,
                    String industry,
                    Reputation reputation){
        this.employerId = employerId;
        this.employerName = employerName;
        this.website = website;
        this.industry = industry;
        this.reputation = reputation;
    }

    public String getEmployerName(){
        return employerName;
    }

    public String getReputation(){
        return reputation.name();
    }

    @Override
    public String toString() {
        return "Employer{" +
                "employerId='" + employerId + '\'' + "\n" +
                ", employerName='" + employerName + '\'' + "\n" +
                ", website='" + website + '\'' + "\n" +
                ", industry='" + industry + '\'' + "\n" +
                ", reputation=" + reputation + "\n" +
                '}';
    }

    @Override
    public int compareTo(Employer employer) {
        if(employer.reputation.ordinal() < this.reputation.ordinal())
            return 1;
        else if(employer.reputation.ordinal() > this.reputation.ordinal())
            return -1;
        else
            return 1;
    }
}

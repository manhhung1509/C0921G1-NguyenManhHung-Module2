package bai_tap_lam_them_arraylist_va_oop.model;

public class ExperienceCandiDate extends Candidate {
    private int expInYear;
    private String proSkill;

    public ExperienceCandiDate() {
    }

    public ExperienceCandiDate(int candidateId, String firstName, String lastName, int birthDate, String address,
                               long phone, String email, int candidateType, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "ExperienceCandiDate{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                ", candidateId=" + candidateId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", candidateType=" + candidateType +
                '}';
    }
}

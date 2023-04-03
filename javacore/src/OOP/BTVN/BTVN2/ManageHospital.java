package OOP.BTVN.BTVN2;

public class ManageHospital {
    private Doctor doctor;
    private Patient patient;

    public ManageHospital() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "ManageHospital{" +
                "doctor{" + doctor +
                ", patient{" + patient +
                '}';
    }
}


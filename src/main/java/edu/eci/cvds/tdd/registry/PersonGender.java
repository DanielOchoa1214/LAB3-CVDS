package edu.eci.cvds.tdd.registry;

public class PersonGender {
    private Gender gender;
    private RegisterResult validGender;

    public PersonGender(Gender gender){
        this.gender = gender;
        this.validGender = this.gender != Gender.UNIDENTIFIED ? RegisterResult.VALID : RegisterResult.INVALID_GENDER;
    }

    public RegisterResult getValidGender() {
        return validGender;
    }
}

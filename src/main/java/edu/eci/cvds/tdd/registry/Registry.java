package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p){
        if (p.getAge() == 0) {
            return RegisterResult.VALID;
        } else if(p.getAge() < 1){
            return RegisterResult.INVALID_AGE;
        } else if (p.getAge() < 17) {
            return RegisterResult.UNDERAGE;
        } else if (p.getAge() < 90){
            return RegisterResult.VALID;
        } else {
            return RegisterResult.DEAD;
        }
        // TODO Validate person and return real result.
        // return RegisterResult.VALID;
    }
}

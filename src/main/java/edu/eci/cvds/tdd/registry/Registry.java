package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;
import java.util.Arrays;

public class Registry {
    public RegisterResult registerVoter(Person p){
        RegisterResult validAge = p.getAge() == null ? RegisterResult.VALID : p.getAge().getValidAge();
        RegisterResult validName = p.getName() == null ? RegisterResult.VALID : p.getName().getValidName();
        RegisterResult validId = p.getId() == null ? RegisterResult.VALID : p.getId().getValidId();
        RegisterResult validGender = p.getGender() == null ? RegisterResult.VALID : p.getGender().getValidGender();

        ArrayList<RegisterResult> validateVariables = new ArrayList<>(Arrays.asList(validAge, validName, validId, validGender));

        for(RegisterResult result : validateVariables){
            if(result != RegisterResult.VALID){
                return result;
            }
        }
        return RegisterResult.VALID;
    }
}

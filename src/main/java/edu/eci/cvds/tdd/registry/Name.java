package edu.eci.cvds.tdd.registry;

public class Name {
    private String nameStr;
    private RegisterResult validName;

    public Name(String name){
        this.nameStr = name;
        if(this.nameStr.length() == 0){
            this.validName = RegisterResult.NO_NAME;
        } else if (this.nameStr.length() < 31) {
            this.validName = RegisterResult.VALID;
        } else {
            this.validName = RegisterResult.NAME_TOO_LONG;
        }
    }

    public RegisterResult getValidName(){
        return this.validName;
    }
}

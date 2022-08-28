package edu.eci.cvds.tdd.registry;

public class Id {
    private long idNum;
    private RegisterResult validId;

    public Id(long idNum){
        this.idNum = idNum;
        if(String.valueOf(this.idNum).length() < 6){
            this.validId = RegisterResult.INVALID_ID;
        } else if (String.valueOf(this.idNum).length() < 12) {
            this.validId = RegisterResult.VALID;
        } else {
            this.validId = RegisterResult.INVALID_ID;
        }
    }

    public RegisterResult getValidId() {
        return this.validId;
    }
}

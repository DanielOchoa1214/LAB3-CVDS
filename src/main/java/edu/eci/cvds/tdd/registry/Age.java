package edu.eci.cvds.tdd.registry;

public class Age {
    private int ageNum;
    private final RegisterResult validAge;

    public Age(int ageNum){
        this.ageNum = ageNum;
        if(this.ageNum < 1){
            this.validAge = RegisterResult.INVALID_AGE;
        } else if (this.ageNum < 17) {
            this.validAge = RegisterResult.UNDERAGE;
        } else if (this.ageNum < 90){
            this.validAge = RegisterResult.VALID;
        } else {
            this.validAge = RegisterResult.DEAD;
        }
    }

    public RegisterResult getValidAge(){
        return this.validAge;
    }
}

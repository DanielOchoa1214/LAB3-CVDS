package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateSuperiorLimitAge(){
        Person person = new Person(new Name("Daniel"), new Id(123456), new Age(1001), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateValidAge(){
        Person person = new Person(new Name("Daniel"), new Id(123456), new Age(20), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateUnderageAge(){
        Person person = new Person(new Name("Daniel"), new Id(123456), new Age(5), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateLowerLimiteAge(){
        Person person = new Person(new Name("Daniel"), new Id(123456), new Age(-5), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateSuperiorLimitName(){
        Person person = new Person(new Name("Danielqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq"), new Id(123456), new Age(20), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.NAME_TOO_LONG, result);
    }

    @Test
    public void validateValidName(){
        Person person = new Person(new Name("Daniel"), new Id(123456), new Age(20), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateLowerLimitName(){
        Person person = new Person(new Name(""), new Id(123456), new Age(20), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.NO_NAME, result);
    }

    @Test
    public void validateSuperiorLimitId(){
        Person person = new Person(new Name("Daniel"), new Id(12345678911111L), new Age(20), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_ID, result);
    }

    @Test
    public void validateValidId(){
        Person person = new Person(new Name("Daniel"), new Id(12345678), new Age(20), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateLowerLimitId(){
        Person person = new Person(new Name("Daniel"), new Id(123), new Age(20), new PersonGender(Gender.MALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_ID, result);
    }

    @Test
    public void validateInvalidGender(){
        Person person = new Person(new Name("Daniel"), new Id(12345678), new Age(20), new PersonGender(Gender.UNIDENTIFIED), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_GENDER, result);
    }

    @Test
    public void validateValidGender(){
        Person person = new Person(new Name("Daniel"), new Id(12345678), new Age(20), new PersonGender(Gender.FEMALE), true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
}

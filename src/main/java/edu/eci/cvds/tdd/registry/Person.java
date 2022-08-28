package edu.eci.cvds.tdd.registry;

/**
 * Person representation Class
 */
public class Person {
    /** Person's name*/
    Name name;

    /** A person's identification number*/
    Id id;

    /** Person's age*/
    Age age;

    /** Person's gender*/
    private PersonGender gender;

    /** Flag to specify if a person is alive*/
    boolean alive;

    /** The class' default constructor*/
    public Person() {
        super();
    }

    /**
     * A person constructor with all the information
     *  @param name the name
     *  @param id the identification number
     *  @param age the age
     *  @param gender the gender
     *  @param alive if the person is alive
     */
    public Person(Name name, Id id, Age age, PersonGender gender, boolean alive) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.alive = alive;
    }

    /**
     * Returns the person name
     * @return the name
     */
    public Name getName() {
        return name;
    }

    /**
     * Returns the person identification number
     * @return the identification Number
     */
    public Id getId() {
        return id;
    }

    /**
     * Returns this person's age
     * @return the age
     */
    public Age getAge() {
        return age;
    }

    /**
     * Returns the gender
     * @return the gender
     */
    public PersonGender getGender() {
        return gender;
    }

    /**
     * Returns if the person is alive
     * @return the alive
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Sets the person name
     * @param name the name to set
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Sets the person identification number
     * @param id the identification Number to set
     */
    public void setId(Id id) {
        this.id = id;
    }

    /**
     * Sets the person age
     * @param age the age to set
     */
    public void setAge(Age age) {
        this.age = age;
    }

    /**
     * Sets the person gender
     * @param gender the gender to set
     */
    public void setGender(PersonGender gender) {
        this.gender = gender;
    }

    /**
     * Sets the flag to specify if this person is alive
     * @param alive the alive to set
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * @{inheritdoc}
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", alive=" + alive + "]";
    }
}

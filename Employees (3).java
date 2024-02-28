package com.mycompany.projectds;

/**
 * This is a class for employees who serving the customer..
 */
public class Employees {

    //Employees Infos
    String name;
    long ID;
    char gender;
    String job;

    //default constructor to create objects.

    /**
     *
     */
    public Employees() {
    }

    /**
     * Constructor to assign values for the employee information
     *
     * @param name the name of the employee who serving the customer.
     * @param ID the ID of the employee who serving the customer.
     * @param job The job of the employee who serves the customer.
     * @param gender the Gender of the employee who serving the customer.
     */
    public Employees(String name, long ID, String job, char gender) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.job = job;
    }

}//End class

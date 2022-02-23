package com.company.strategypattern.exampleone;

import java.util.Locale;

public class Employee {
    private String name;
    private final long id;
    private IRole iRole;
    private ICode iCode;

    public Employee(String name, long id, IRole iRole, ICode iCode) {
        this.name = name;
        this.id = id;
        this.iRole = iRole;
        this.iCode = iCode;
    }

    public long hasEmployeeId(){
        return this.id;
    };

    public String getRole(){
        char letter = this.iRole.role().toLowerCase(Locale.ROOT).charAt(0);
        if( letter  == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ){
            return this.name + " has an " + this.iRole.role();

        }
        return this.name + " has a " + this.iRole.role();
    }

    public String canCode(){
        return this.iCode.canCode();
    }

    public void setRole(IRole iRole) {
        this.iRole = iRole;
    }

    public void setCode(ICode iCode) {
        this.iCode = iCode;
    }

    public String getEmployeeDetails(){
        return getRole() + " and " + canCode();
    }
}

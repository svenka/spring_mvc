package com.fyodork.spring.mvc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2,message = "Name must be minimum 2 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    private int salary;
    private String department;
    private Map<String,String> departments;

    private  String carBrand;
    private Map<String,String> carbrands;
    private String[] languages;
    private Map<String,String> languagesList;

    public Employee() {
    departments=new HashMap<>();
    departments.put("Information Technology","IT");
    departments.put("Human Resources","HR");
    departments.put("Sales","Sales");

    carbrands=new HashMap<>();
    carbrands.put("BMW","BMW");
    carbrands.put("Audi","Audi");
    carbrands.put("Mercedes-Benz","MB");

    languagesList=new LinkedHashMap<>();
    languagesList.put("English","EN");
    languagesList.put("Deutsch","DE");
    languagesList.put("French","FR");

    }

    public String getName() {
        return name;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarbrands() {
        return carbrands;
    }

    public void setCarbrands(Map<String, String> carbrands) {
        this.carbrands = carbrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }
}

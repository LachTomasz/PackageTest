package com.lach.corejava;

//Klasy znajdujące się w tym pliku należą do powyższego pakietu.
//The classes contained in this file belong to the above package.

import java.time.LocalDate; //java.util.*;

//Instrukcje import następują po instrukcji package.
//The import statements follow the package statement.

/**
 * @author Tomek
 *
 */

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    /**
     * Tworzy profil nowego pracownika
     * @param name imie i nazwisko pracownika
     * @param salary pensja
     * @param year rok zatrudnienia
     * @param month miesiąc zatrudnienia 1-styczen .. 12 grudzien
     * @param day	dzien
     */
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);

    }

    /**
     * Zwraca Imię i Nazwisko pracownika.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Zwraca wartość pensji
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Zwraca date zatrudnienia
     * @return hireDay
     */
    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * Podnosi pensję pracownika
     * @param byPercent
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
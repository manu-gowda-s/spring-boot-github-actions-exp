package com.manu.s.githubactiondemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee
{
    private int empId;
    private String dept;
    private String name;
    private double salary;
    private String city;
}

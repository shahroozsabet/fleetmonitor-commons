package com.fleetmonitor.integration.xml;

import lombok.Data;

import java.util.Stack;

/**
 * Created by Shahrooz on 12/13/2019.
 */
@Data
public class DataEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String town;
    private String postalCode;
    private String mobile;
    private String landPhone;
    private Stack<Family> families = new Stack<>();
}

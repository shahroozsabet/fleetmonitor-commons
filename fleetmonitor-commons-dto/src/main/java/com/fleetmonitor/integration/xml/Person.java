package com.fleetmonitor.integration.xml;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.Stack;

/**
 * Created by Shahrooz on 12/13/2019.
 */
@XmlRootElement
@Data
@XmlType
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @XmlElement
    private String firstname;
    @XmlElement
    private String lastname;
    @XmlElement
    private Address address;
    @XmlElement
    private Phone phone;
    @XmlElement
    private Stack<Family> family = new Stack<>();

}

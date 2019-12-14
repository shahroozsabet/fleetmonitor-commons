package com.fleetmonitor.integration.xml;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shahrooz on 12/13/2019.
 */
@XmlRootElement
@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class People {

    @XmlElement
    private List<Person> person = new ArrayList<>();

    public People(List<Person> person) {
        this.person = person;
    }

}

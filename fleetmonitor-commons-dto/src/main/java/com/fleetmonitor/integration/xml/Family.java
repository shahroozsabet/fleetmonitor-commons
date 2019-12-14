package com.fleetmonitor.integration.xml;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

/**
 * Created by Shahrooz on 12/13/2019.
 */
@XmlRootElement
@Data
@XmlType
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Family {
    @XmlElement
    private String name;
    @XmlElement
    private String born;
    @XmlElement
    private Phone phone;
    @XmlElement
    private Address address;
}

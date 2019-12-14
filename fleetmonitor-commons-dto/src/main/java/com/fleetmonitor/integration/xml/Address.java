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
public class Address {
    @XmlElement
    private String street;
    @XmlElement
    private String town;
    @XmlElement
    private String postalCode;
}

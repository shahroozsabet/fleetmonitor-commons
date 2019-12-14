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
public class Phone {
    @XmlElement
    private String mobile;
    @XmlElement
    private String landPhone;
}

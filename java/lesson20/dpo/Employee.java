package lesson20.dpo;

import lombok.Data;
import lombok.experimental.Accessors;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Data
@Accessors(chain = true)
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

    @XmlAttribute
    private String tabNumber;
    @XmlAttribute
    private String login;
    private String fullName;
    private Department department;
    private Position position;
}

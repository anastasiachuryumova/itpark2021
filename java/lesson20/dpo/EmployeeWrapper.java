package lesson20.dpo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lesson20.dpo.EmployeeWrapper.Fields;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = Fields.employees)
@JsonRootName(value = Fields.employees)
public class EmployeeWrapper {

    @XmlElement(name = "employee")
    @JsonProperty("employee")
    private List<Employee> employees;
}

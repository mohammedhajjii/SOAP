package hajji.mohammed;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;


@AllArgsConstructor @NoArgsConstructor @Builder
@Getter @Setter
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {
    public int code;
    public double amount;
    public Date creationDate;
}

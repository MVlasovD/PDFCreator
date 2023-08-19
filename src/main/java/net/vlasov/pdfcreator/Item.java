package net.vlasov.pdfcreator;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Item {

    private String name;

    private Integer age;

    private String lastname;

}

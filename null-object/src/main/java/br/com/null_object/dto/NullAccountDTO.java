package br.com.null_object.dto;

import java.math.BigDecimal;

public class NullAccountDTO extends AccountDTO {
    public NullAccountDTO() {
        super("", BigDecimal.ZERO);
    }
}

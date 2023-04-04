package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accpeted extends AbstractEvent {

    private Long id;

    public Accpeted(Cooking aggregate) {
        super(aggregate);
    }

    public Accpeted() {
        super();
    }
}

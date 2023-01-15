package filipszydlak.springframework.springrecipeapp.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude ={"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String decription;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(String decription, BigDecimal amount, UnitOfMeasure uom) {
        this.decription = decription;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(String decription, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.decription = decription;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }

}

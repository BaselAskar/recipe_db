package se.baselcode.recipedatabaseassignment.model;


import javax.persistence.*;

@Entity
public class RecipeIngredient {

    @Id
    private int id;
    private double amount;
    private Measurement measurement;

    @ManyToOne(
            cascade = {CascadeType.DETACH,CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "fk_ingredient_id")
    private Ingredient ingredient;

    @ManyToOne(
            cascade = {CascadeType.DETACH,CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "fk_recipe_id")
    private Recipe recipe;


    public RecipeIngredient() {
    }

    public RecipeIngredient(double amount, Measurement measurement) {
        this.amount = amount;
        this.measurement = measurement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}

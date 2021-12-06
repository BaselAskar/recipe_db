package se.baselcode.recipedatabaseassignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecipeInstruction {

    @Id
    private int id;
    private String instructions;

    public RecipeInstruction() {
    }

    public RecipeInstruction(int id, String instructions) {
        this.id = id;
        this.instructions = instructions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}

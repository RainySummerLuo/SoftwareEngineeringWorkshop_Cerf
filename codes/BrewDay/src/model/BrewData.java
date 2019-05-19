package model;

import java.util.ArrayList;

public class BrewData {
    private static ArrayList<Recipe> recipeList;
    public static ArrayList<StorageIngredient> storageIngredientList;
    private static ArrayList<Note> noteList;
    private static ArrayList<Equipment> equipmentList;

    public static void init() {
        recipeList = new ArrayList<>();
        storageIngredientList = new ArrayList<>();
        equipmentList = new ArrayList<>();

        Recipe beer = new Recipe("Beer", 1000);
        beer.AddIngredient(new RecipeIngredient("Water", 500, "ml"));
        recipeList.add(beer);

        storageIngredientList.add(new StorageIngredient("Water", 5000, "ml"));
        storageIngredientList.add(new StorageIngredient("Suger", 5000, "ml"));
        storageIngredientList.add(new StorageIngredient("Yeast", 5000, "ml"));

        equipmentList.add(new Equipment("Brewer One", 1000));
    }

    public static ArrayList<Recipe> getRecipeList() {
        return BrewData.recipeList;
    }

    public static void setRecipeList(ArrayList<Recipe> recipeList) {
        BrewData.recipeList = recipeList;
    }

    public static ArrayList<StorageIngredient> getStorageIngredientList() {
        return BrewData.storageIngredientList;
    }

    public static void setStorageIngredientList(ArrayList<StorageIngredient> storageIngredientList) {
        BrewData.storageIngredientList = storageIngredientList;
    }

    public static ArrayList<Note> getNoteList() {
        return BrewData.noteList;
    }

    public static void setNoteList(ArrayList<Note> noteList) {
        BrewData.noteList = noteList;
    }

    public static ArrayList<Equipment> getEquipmentList() {
        return BrewData.equipmentList;
    }

    public static void setEquipmentList(ArrayList<Equipment> equipmentList) {
        BrewData.equipmentList = equipmentList;
    }
}
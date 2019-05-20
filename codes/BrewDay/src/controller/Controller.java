package controller;

import model.BrewData;
import model.Equipment;
import model.Recipe;
import model.StorageIngredient;
import view.*;

import javax.swing.*;


public class Controller {
    private static final Controller instance = new Controller();
    private MainPage mainPage;

    private Controller() {
        Init();
        BrewData.init();
    }

    public static Controller GetInstance() {
        return instance;
    }

    private void Init() {
        mainPage = new MainPage();
    }

    public void getMainPage(JFrame frame) {
        mainPage = new MainPage();
        frame.dispose();
    }

    public void getRecipeListPage(JFrame frame) {
        new RecipeListPage();
        frame.dispose();
    }

    public void getIngredientListPage(JFrame frame) {
        new IngredientListPage();
        frame.dispose();
    }

    public void getEquipmentListPage(JFrame frame) {
        EquipmentListPage equipmentListPage = new EquipmentListPage();
        frame.dispose();
    }

    public void getNotePage(JFrame frame) {
        NotePage notePage = new NotePage();
        frame.dispose();
    }

    public void getRecipeDetialPage(JFrame frame, Recipe recipe) {
        RecipeDetailPage recipeDetailPage = new RecipeDetailPage(recipe);
        frame.dispose();
    }

    public void getAddIngredientsPage(JFrame frame) {
        AddIngredientsPage addIngredientPage = new AddIngredientsPage();
        frame.dispose();
    }

    public void getEditIngredientsPage(JFrame frame, StorageIngredient si) {
        EditIngredientsPage editIngredientPage = new EditIngredientsPage(si);
        frame.dispose();
    }

    public void getAddEquipmentPage(JFrame frame) {
        AddEquipmentPage addEquipmentPage = new AddEquipmentPage();
        frame.dispose();
    }

    public void getEditEquipmentPage(JFrame frame, Equipment equip) {
        EditEquipmentPage editEquipmentPage = new EditEquipmentPage(equip);
        frame.dispose();
    }

    public void getNewRecipePage(JFrame frame) {
        NewRecipePage newRecipePage = new NewRecipePage();
        frame.dispose();
    }
    
}

package controller;

import view.*;

import javax.swing.*;

import model.Recipe;

public class Controller {
    private static Controller instance = new Controller();
    private MainPage mainPage;

    private Controller() {
        Init();
    }

    private void Init() {
        mainPage = new MainPage();
    }

    public void getMainPage(JFrame frame) {
        mainPage = new MainPage();
        frame.dispose();
    }

    public void getRecipeListPage(JFrame frame) {
        RecipeListPage recipeListPage = new RecipeListPage();
        frame.dispose();
    }

    public void getIngredientListPage(JFrame frame) {
        IngredientListPage ingredientListPage = new IngredientListPage();
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
    
    public void getRecipeDetialPage(JFrame frame,Recipe recipe) {
    	RecipeDetailPage recipeDetailPage = new RecipeDetailPage(recipe);
    	frame.dispose();
    }
    
    public void getNewRecipePage(JFrame frame) {
    	NewRecipePage newRecipePage = new NewRecipePage();
    	frame.dispose();
    }

    public void getConfirmPage(JFrame frame, int situation) {
    	ConfirmPage confirmPage = new ConfirmPage(situation);
    	frame.dispose();
    }
    
    public static Controller GetInstance() {
        return instance;
    }
}

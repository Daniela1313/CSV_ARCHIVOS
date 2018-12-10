
package main;

import view.View;
import model.Model;
import Controller.Controller;
/**
 *
 * @author Daniela Garcia Rios
 */
public class Main {
    private static View view;
    private static Model model;
    private static Controller controller;
    
    public static void main(String[] args)
    {
        view = new View();
        model = new Model();
        controller = new Controller(model, view);
    }
}
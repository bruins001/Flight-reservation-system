package net.nielsbruinsma;

import net.nielsbruinsma.menu.SelectionChoice;
import net.nielsbruinsma.menu.SelectionMenu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Build selectionChoices
        List<SelectionChoice> selectionChoicesList = new ArrayList<>();
        selectionChoicesList.add(new SelectionChoice(1, "Order ticket"));
        selectionChoicesList.add(new SelectionChoice(2, "Modify ticket"));
        selectionChoicesList.add(new SelectionChoice(3, "Cancel ticket"));
        selectionChoicesList.add(new SelectionChoice(4, "Get support"));

        // Selection menu
        SelectionMenu mainMenu = new SelectionMenu(selectionChoicesList);
        System.out.println(mainMenu.getSelectionMenu());
    }
}

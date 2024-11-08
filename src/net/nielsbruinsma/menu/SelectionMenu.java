package net.nielsbruinsma.menu;

import java.util.List;

public class SelectionMenu {
    private final List<SelectionChoice> selectionChoicesList;

    public SelectionMenu(List<SelectionChoice> selectionChoicesList) {
        if (selectionChoicesList.isEmpty()) {
            throw new IllegalArgumentException("selectionChoicesList is invalid. The minimum size is 1 and size " +
                    selectionChoicesList.size() + " was given.");
        }
        this.selectionChoicesList = selectionChoicesList;
    }

    /**
     * Converts a selectionChoicesList to a string.
     * Creates a selection menu in String.
     * If selection menu is empty returns null.
     *
     * @return  String with selection menu text or null.
     */
    public String getSelectionMenu() {
        // Don't have to check if selectionChoicesList is empty because the constructor handles that

        StringBuilder selectionMenuStringBuilder = new StringBuilder();

        selectionMenuStringBuilder.append("Select a choice:").append(System.lineSeparator());

        for (int idx = 0; idx < selectionChoicesList.size(); idx++) {
            selectionMenuStringBuilder.append((idx + 1)).append(". ").append(selectionChoicesList.get(idx).getName()).append(System.lineSeparator());
        }

        return selectionMenuStringBuilder.isEmpty() ? null : selectionMenuStringBuilder.toString();
    }
}

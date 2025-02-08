package view;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {
    protected String title; // Title of the menu
    protected ArrayList<T> options; // List of options

    public Menu() {
    }

    public Menu(String title, T[] optionsArray) {
        this.title = title;
        this.options = new ArrayList<>();
        for (T option : optionsArray) {
            this.options.add(option);
        }
    }

    public void display() {
        System.out.println("\n" + title);
        System.out.println("--------------------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.println("--------------------------------");
    }

    public int getSelected() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= options.size()) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please select a number between 1 and " + options.size() + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return choice;
    }

    public abstract void execute(int choice);

    public void run() {
        while (true) {
            display();
            int choice = getSelected();
            execute(choice);
            if (choice > options.size()) {
                break;
            }
        }
    }
}

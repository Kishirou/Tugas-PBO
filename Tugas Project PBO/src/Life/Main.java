package Life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    private JTextArea outputArea;
    private JTextField nameField;
    private JComboBox<String> categoryBox, typeBox, subclassBox;
    private JButton showInfoButton;

    public Main() {
        setTitle("Lifeform Info");

        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Select Category:"));
        String[] categoryOptions = {"Human", "Animal", "Plant"};
        categoryBox = new JComboBox<>(categoryOptions);
        inputPanel.add(categoryBox);

        inputPanel.add(new JLabel("Select Type:"));
        typeBox = new JComboBox<>();
        inputPanel.add(typeBox);

        inputPanel.add(new JLabel("Select Subtype:"));
        subclassBox = new JComboBox<>();
        inputPanel.add(subclassBox);

        showInfoButton = new JButton("Show Info");
        inputPanel.add(showInfoButton);

        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        showInfoButton.addActionListener(this);
        categoryBox.addActionListener(this);
        typeBox.addActionListener(this);

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        updateTypeBox("Human");
        updateSubclassBox("Male");
    }

    private void updateTypeBox(String category) {
        typeBox.removeAllItems(); // Clear all items

        switch (category) {
            case "Human":
                typeBox.addItem("Male");
                typeBox.addItem("Female");
                break;
            case "Animal":
                typeBox.addItem("Mammal");
                typeBox.addItem("Bird");
                typeBox.addItem("Reptile");
                break;
            case "Plant":
                typeBox.addItem("Tree");
                typeBox.addItem("Flower");
                typeBox.addItem("Shrub");
                break;
        }

        if (typeBox.getItemCount() > 0) {
            typeBox.setSelectedIndex(0); // Set default type
            updateSubclassBox((String) typeBox.getSelectedItem());
        }
    }

    private void updateSubclassBox(String type) {
        subclassBox.removeAllItems();

        if (type == null || type.isEmpty()) return;

        switch (type) {
            case "Male":
                subclassBox.addItem("Father");
                subclassBox.addItem("Son");
                subclassBox.addItem("Grandfather");
                break;
            case "Female":
                subclassBox.addItem("Mother");
                subclassBox.addItem("Daughter");
                subclassBox.addItem("Grandmother");
                break;
            case "Mammal":
                subclassBox.addItem("Dog");
                subclassBox.addItem("Cat");
                subclassBox.addItem("Rabbit");
                break;
            case "Bird":
                subclassBox.addItem("Parrot");
                subclassBox.addItem("Eagle");
                subclassBox.addItem("Macaw");
                break;
            case "Reptile":
                subclassBox.addItem("Lizard");
                subclassBox.addItem("Snake");
                subclassBox.addItem("Chameleon");
                break;
            case "Tree":
                subclassBox.addItem("Fruit Tree");
                subclassBox.addItem("Decoration Tree");
                break;
            case "Flower":
                subclassBox.addItem("Rose");
                subclassBox.addItem("Rafflesia");             
                break;
            case "Shrub":
                subclassBox.addItem("Bush");
                subclassBox.addItem("Tumbleweed");               
                break;
        }

        if (subclassBox.getItemCount() > 0) {
            subclassBox.setSelectedIndex(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == categoryBox) {
            String selectedCategory = (String) categoryBox.getSelectedItem();
            updateTypeBox(selectedCategory);
        } else if (e.getSource() == typeBox) {
            String selectedType = (String) typeBox.getSelectedItem();
            updateSubclassBox(selectedType);
        } else if (e.getSource() == showInfoButton) {
            String name = nameField.getText();
            String selectedCategory = (String) categoryBox.getSelectedItem();
            String selectedType = (String) typeBox.getSelectedItem();
            String selectedSubtype = (String) subclassBox.getSelectedItem();

            if (name.isEmpty() || selectedType == null || selectedSubtype == null) {
                outputArea.setText("Please fill in all fields.");
                return;
            }

            Lifeform lifeform = null;

            switch (selectedSubtype) {
                case "Father":
                    lifeform = new Father(name, 40, 2);
                    break;
                case "Son":
                	lifeform = new Son(name, 10);
                	break;
                case "Grandfather":
                	lifeform = new GrandFather(name, 69, 3, 7);
                	break;
                case "Mother":
                    lifeform = new Mother(name, 38, 3);
                    break;
                case "Daughter":
                	lifeform = new Daughter(name, 10);
                	break;
                case "Grandmother":
                	lifeform = new GrandMother(name, 65, 4, 9);
                	break;
                case "Dog":
                    lifeform = new Dog(name, 5, "Golden Retriever", "Loud");
                    break;
                case "Cat":
                	lifeform = new Cat(name, 3, "British Shorthair", "Gently");
                	break;
                case "Rabbit":
                	lifeform = new Rabbit(name, 2, "Flemish Giant", "High");
                	break;
                case "Parrot":
                    lifeform = new Parrot(name, 2, 0.5, "fluent");
                    break;
                case "Eagle":
                	lifeform = new Parrot(name, 2, 1.8, "Pro");
                	break;
                case "Macaw":
                	lifeform = new Parrot(name, 2, 1.2, "Beautiful");
                	break;
                case "Lizard":
                    lifeform = new Lizard(name, 3, 3);
                    break;
                case "Snake":
                	lifeform = new Snake(name, 3, 5);
                	break;
                case "Chameleon":
                	lifeform = new Chameleon(name, 3, "Good");
                	break;
                case "Fruit Tree":
                    lifeform = new FruitTree(name, 15, "Apple");
                    break;
                case "Decoration Tree":
                	lifeform = new DecorationTree(name, 3, "Winter");
                	break;
                case "Rose":
                    lifeform = new Rose(name, 2, "Red");
                    break;
                case "Rafflesia":
                	lifeform = new Rafflesia(name, 4, "Red", "Strong");
                	break;
                case "Bush":
                    lifeform = new Bush(name, 5);
                    break;
                case "Tumbleweed":
                	lifeform = new Tumbleweed(name, 5, "Speedy");
                	break;
            }

            if (lifeform != null) {
                outputArea.setText(lifeform.info());
            } else {
                outputArea.setText("Invalid selection.");
            }
        }
    }

    public static void main(String[] args) {
        // Run the GUI
        new Main();
    }
}

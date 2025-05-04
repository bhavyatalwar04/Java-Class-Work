
import javax.swing.*;

public class prac {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Feedback Form");
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");

        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"Java", "Python", "C++"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        JLabel ratingLabel = new JLabel("Rate the course:");
        JList<String> ratingList = new JList<>(new String[]{"Excellent", "Good", "Average",
            "Poor"});
        JCheckBox practical = new JCheckBox("Practical");
        JCheckBox theory = new JCheckBox("Theory");
        JButton submitButton = new JButton("Submit");
        JLabel outputLabel = new JLabel("");
// Setting Bounds
        nameLabel.setBounds(30, 20, 100, 25);
        nameField.setBounds(140, 20, 150, 25);
        genderLabel.setBounds(30, 60, 100, 25);
        male.setBounds(140, 60, 70, 25);
        female.setBounds(210, 60, 80, 25);
        courseLabel.setBounds(30, 100, 100, 25);
        courseBox.setBounds(140, 100, 150, 25);
        ratingLabel.setBounds(30, 140, 120, 25);
        ratingList.setBounds(140, 140, 150, 60);
        practical.setBounds(30, 210, 100, 25);
        theory.setBounds(140, 210, 100, 25);
        submitButton.setBounds(100, 250, 120, 30);
        outputLabel.setBounds(30, 290, 300, 40);
// Adding components
        genderGroup.add(male);
        genderGroup.add(female);
        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(genderLabel);
        frame.add(male);
        frame.add(female);
        frame.add(courseLabel);
        frame.add(courseBox);
        frame.add(ratingLabel);
        frame.add(ratingList);
        frame.add(practical);
        frame.add(theory);
        frame.add(submitButton);
        frame.add(outputLabel);
// Action Listener
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female"
                    : "Unspecified");
            String course = (String) courseBox.getSelectedItem();
            String rating = ratingList.getSelectedValue();
            String modules = "";
            if (practical.isSelected()) {
                modules += "Practical ";
            }
            if (theory.isSelected()) {
                modules += "Theory";
            }
            outputLabel.setText("<html>Name: " + name + "<br>Gender: " + gender
                    + "<br>Course: " + course + "<br>Rating: " + rating
                    + "<br>Modules: " + modules + "</html>");
        });
        frame.setSize(350, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

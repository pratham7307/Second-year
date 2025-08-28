// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class GradeTracker {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("Student Grade Tracker");
//         frame.setSize(400, 300);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//         JLabel label = new JLabel("Welcome to Grade Tracker!", JLabel.CENTER);
//         frame.add(label);
        
//         frame.setVisible(true);
//     }
// }
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class StudentGradeTracker extends JFrame {
    private DefaultTableModel tableModel;
    private JTable gradeTable;
    private JTextField subjectField, assignmentField, gradeField;
    private JButton addButton, editButton, deleteButton;

    public StudentGradeTracker() {
        setTitle("Student Grade Tracker");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Table model with columns
        tableModel = new DefaultTableModel(new Object[]{"Subject", "Assignment", "Grade"}, 0);
        gradeTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(gradeTable);

        // Input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 4, 10, 10));

        subjectField = new JTextField();
        assignmentField = new JTextField();
        gradeField = new JTextField();

        inputPanel.add(new JLabel("Subject:"));
        inputPanel.add(new JLabel("Assignment:"));
        inputPanel.add(new JLabel("Grade:"));
        inputPanel.add(new JLabel("")); // Empty placeholder

        inputPanel.add(subjectField);
        inputPanel.add(assignmentField);
        inputPanel.add(gradeField);

        addButton = new JButton("Add");
        editButton = new JButton("Edit");
        deleteButton = new JButton("Delete");
        editButton.setEnabled(false);
        deleteButton.setEnabled(false);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);

        // Layout main panel
        setLayout(new BorderLayout(10, 10));
        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        // Table selection listener
        gradeTable.getSelectionModel().addListSelectionListener(event -> {
            int selectedRow = gradeTable.getSelectedRow();
            if (selectedRow >= 0) {
                subjectField.setText((String) tableModel.getValueAt(selectedRow, 0));
                assignmentField.setText((String) tableModel.getValueAt(selectedRow, 1));
                gradeField.setText(tableModel.getValueAt(selectedRow, 2).toString());
                editButton.setEnabled(true);
                deleteButton.setEnabled(true);
                addButton.setEnabled(false);
            } else {
                clearFields();
            }
        });

        // Add button action
        addButton.addActionListener(e -> {
            if (validateInput()) {
                tableModel.addRow(new Object[]{
                        subjectField.getText().trim(),
                        assignmentField.getText().trim(),
                        gradeField.getText().trim()
                });
                clearFields();
            }
        });

        // Edit button action
        editButton.addActionListener(e -> {
            int selectedRow = gradeTable.getSelectedRow();
            if (selectedRow >= 0 && validateInput()) {
                tableModel.setValueAt(subjectField.getText().trim(), selectedRow, 0);
                tableModel.setValueAt(assignmentField.getText().trim(), selectedRow, 1);
                tableModel.setValueAt(gradeField.getText().trim(), selectedRow, 2);
                clearFields();
                gradeTable.clearSelection();
            }
        });

        // Delete button action
        deleteButton.addActionListener(e -> {
            int selectedRow = gradeTable.getSelectedRow();
            if (selectedRow >= 0) {
                tableModel.removeRow(selectedRow);
                clearFields();
                gradeTable.clearSelection();
            }
        });
    }

    private boolean validateInput() {
        if (subjectField.getText().trim().isEmpty() ||
                assignmentField.getText().trim().isEmpty() ||
                gradeField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate grade number
        try {
            double gradeVal = Double.parseDouble(gradeField.getText().trim());
            if (gradeVal < 0 || gradeVal > 100) {
                JOptionPane.showMessageDialog(this, "Grade must be between 0 and 100.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Grade must be a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void clearFields() {
        subjectField.setText("");
        assignmentField.setText("");
        gradeField.setText("");
        addButton.setEnabled(true);
        editButton.setEnabled(false);
        deleteButton.setEnabled(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentGradeTracker app = new StudentGradeTracker();
            app.setVisible(true);
        });
    }
}

package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VolView extends JFrame {
    // Champs pour entrer les infos du vol
    private JTextField numVolField = new JTextField(20);
    private JTextField lieuDepartField = new JTextField(20);
    private JTextField lieuDestinationField = new JTextField(20);
    private JTextField dateVolField = new JTextField(20); // format: yyyy-MM-dd
    private JTextField prixField = new JTextField(20);
    private JTextField dureeField = new JTextField(20);
    private JTextField nbPlacesField = new JTextField(20);

    private JButton creerVolButton = new JButton("Créer le vol");

    public VolView() {
        setTitle("Création d'un vol");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrer la fenêtre à l'écran
        setLayout(new BorderLayout());

        // Panel pour les champs et labels
        JPanel panelForm = new JPanel();
        panelForm.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espacement autour des éléments

        // Champs pour le formulaire
        addFormElement(panelForm, gbc, 0, "Numéro de vol :", numVolField);
        addFormElement(panelForm, gbc, 1, "Lieu de départ :", lieuDepartField);
        addFormElement(panelForm, gbc, 2, "Lieu de destination :", lieuDestinationField);
        addFormElement(panelForm, gbc, 3, "Date du vol (yyyy-MM-dd) :", dateVolField);
        addFormElement(panelForm, gbc, 4, "Prix :", prixField);
        addFormElement(panelForm, gbc, 5, "Durée (min) :", dureeField);
        addFormElement(panelForm, gbc, 6, "Nombre de places :", nbPlacesField);

        // Panel pour les boutons
        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelButton.add(creerVolButton);

        // Ajouter les panels à la fenêtre
        add(panelForm, BorderLayout.CENTER);
        add(panelButton, BorderLayout.SOUTH);

        // Personnaliser les composants
        setLookAndFeel();

        setVisible(true);
    }

    private void addFormElement(JPanel panel, GridBagConstraints gbc, int row, String label, JTextField textField) {
        gbc.gridx = 0;
        gbc.gridy = row;
        panel.add(new JLabel(label), gbc);
        
        gbc.gridx = 1;
        panel.add(textField, gbc);
    }

    // Méthode pour personnaliser l'apparence des composants
    private void setLookAndFeel() {
        // Choisir un thème de look and feel (si nécessaire)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Changer les couleurs des boutons et des champs
        creerVolButton.setBackground(new Color(34, 167, 240));
        creerVolButton.setForeground(Color.WHITE);
        creerVolButton.setFocusPainted(false);
        
        numVolField.setBackground(new Color(240, 240, 240));
        lieuDepartField.setBackground(new Color(240, 240, 240));
        lieuDestinationField.setBackground(new Color(240, 240, 240));
        dateVolField.setBackground(new Color(240, 240, 240));
        prixField.setBackground(new Color(240, 240, 240));
        dureeField.setBackground(new Color(240, 240, 240));
        nbPlacesField.setBackground(new Color(240, 240, 240));
        
        Font font = new Font("Arial", Font.PLAIN, 14);
        numVolField.setFont(font);
        lieuDepartField.setFont(font);
        lieuDestinationField.setFont(font);
        dateVolField.setFont(font);
        prixField.setFont(font);
        dureeField.setFont(font);
        nbPlacesField.setFont(font);
    }

    // Méthodes pour récupérer les données saisies
    public String getNumVol() { return numVolField.getText(); }
    public String getLieuDepart() { return lieuDepartField.getText(); }
    public String getLieuDestination() { return lieuDestinationField.getText(); }
    public String getDateVol() { return dateVolField.getText(); }
    public String getPrix() { return prixField.getText(); }
    public String getDuree() { return dureeField.getText(); }
    public String getNbPlaces() { return nbPlacesField.getText(); }

    // Pour le contrôleur
    public void addCreerVolListener(ActionListener listener) {
        creerVolButton.addActionListener(listener);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}

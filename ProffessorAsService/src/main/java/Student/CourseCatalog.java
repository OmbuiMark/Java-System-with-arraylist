
package Student;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP
 */
public class CourseCatalog extends javax.swing.JFrame {
 private ArrayList<String> courseAttributes = new ArrayList<>(Arrays.asList("Professor", "Course", "Description", "Materials"));
    /**
     * Creates new form CourseCatalog
     */
    public CourseCatalog() {
        initComponents();
        
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            courseAttributes.toArray()
        ));
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        addfromjcombo = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Engineering", "Maths", "Science", "History", "Bussiness", "information Technology" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Professor", "Course", "Description", "Materials"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        addfromjcombo.setText("Add To list");
        addfromjcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfromjcomboActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(addfromjcombo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addfromjcombo))
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addfromjcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfromjcomboActionPerformed
        // TODO add your handling code here:
    String selectedCourse = jComboBox1.getSelectedItem().toString();
    Object[] row = new Object[4];
    row[1] = selectedCourse;
    switch(selectedCourse) {
        case "History":
            row[0] = "Jane Doe";
            row[2] = "History of Ancient Civilizations";
            row[3] = "Textbooks and Online Resources";
            break;
        case "Science":
            row[0] = "John Smith";
            row[2] = "Introduction to Chemistry";
            row[3] = "Lab Manuals and Scientific Journals";
            break;
        case "Math":
            row[0] = "Sarah Williams";
            row[2] = "Calculus for Beginners";
            row[3] = "Math Textbooks and Online Lectures";
            break;
        case "Engineering":
            row[0] = "David Lee";
            row[2] = "Introduction to Mechanical Engineering";
            row[3] = "Engineering Textbooks and Lab Equipment";
            break;
        case "Business":
            row[0] = "Emily Johnson";
            row[2] = "Business Ethics and Law";
            row[3] = "Case Studies and Business Articles";
            break;
        case "information Technology":
            row[0] = "Michael Chen";
            row[2] = "Data Structures and Algorithms";
            row[3] = "Programming Assignments and Coding Exercises";
            break;
        default:
            row[0] = "Maria Hernandez";
            row[2] = "dbms";
            row[3] = "circulator";
            break;
    }
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.addRow(row);
    }//GEN-LAST:event_addfromjcomboActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         String selectedCourse = jComboBox1.getSelectedItem().toString();
    jLabel1.setText(selectedCourse);
       // TODO add your handling code here:
    int selectedRowIndex = jTable2.getSelectedRow();
   //var selectedCourse = jTable2.getValueAt(selectedRowIndex, 1).toString();


    jLabel1.setText(selectedCourse);

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
           // Exit the application
    System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(CourseCatalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
        new CourseCatalog().setVisible(true);
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addfromjcombo;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

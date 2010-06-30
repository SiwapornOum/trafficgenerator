/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GeneralWizardForm.java
 *
 * Created on 30-Jun-2010, 12:25:24
 */

package md.shaman.forms.wizard;

/**
 *
 * @author AlexandruC
 */
public class GeneralWizardPanel extends javax.swing.JPanel {

    /** Creates new form GeneralWizardForm */
    public GeneralWizardPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProtocolTypeButtonGroup = new javax.swing.ButtonGroup();
        udpRadioButton = new javax.swing.JRadioButton();
        tcpRadioButton = new javax.swing.JRadioButton();
        mcRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        ProtocolTypeButtonGroup.add(udpRadioButton);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(md.shaman.TrafficGeneratorApp.class).getContext().getResourceMap(GeneralWizardPanel.class);
        udpRadioButton.setText(resourceMap.getString("udpRadioButton.text")); // NOI18N
        udpRadioButton.setName("udpRadioButton"); // NOI18N

        ProtocolTypeButtonGroup.add(tcpRadioButton);
        tcpRadioButton.setText(resourceMap.getString("tcpRadioButton.text")); // NOI18N
        tcpRadioButton.setName("tcpRadioButton"); // NOI18N

        ProtocolTypeButtonGroup.add(mcRadioButton);
        mcRadioButton.setText(resourceMap.getString("mcRadioButton.text")); // NOI18N
        mcRadioButton.setName("mcRadioButton"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mcRadioButton)
                            .addComponent(tcpRadioButton)
                            .addComponent(udpRadioButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(udpRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tcpRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mcRadioButton)
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ProtocolTypeButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton mcRadioButton;
    private javax.swing.JRadioButton tcpRadioButton;
    private javax.swing.JRadioButton udpRadioButton;
    // End of variables declaration//GEN-END:variables

}

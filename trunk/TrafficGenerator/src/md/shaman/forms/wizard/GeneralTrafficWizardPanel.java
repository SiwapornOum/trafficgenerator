/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GeneralTrafficWizardPanel.java
 *
 * Created on 01.07.2010, 23:04:21
 */

package md.shaman.forms.wizard;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import md.shaman.utils.Unit;

/**
 *
 * @author Shaman
 */
public class GeneralTrafficWizardPanel extends javax.swing.JPanel {

    /** Creates new form GeneralTrafficWizardPanel */
    public GeneralTrafficWizardPanel() {
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

        packetNoLabel = new javax.swing.JLabel();
        packetDataSizeLabel = new javax.swing.JLabel();
        packetDelayLabel = new javax.swing.JLabel();
        trafficEstimateLabel = new javax.swing.JLabel();
        packetDataSizeSpinner = new javax.swing.JSpinner();
        packetNoSpinner = new javax.swing.JSpinner();
        packetDelaySpinner = new javax.swing.JSpinner();
        trafficEstimateValueLabel = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(md.shaman.TrafficGeneratorApp.class).getContext().getResourceMap(GeneralTrafficWizardPanel.class);
        packetNoLabel.setText(resourceMap.getString("packetNoLabel.text")); // NOI18N
        packetNoLabel.setName("packetNoLabel"); // NOI18N

        packetDataSizeLabel.setText(resourceMap.getString("packetDataSizeLabel.text")); // NOI18N
        packetDataSizeLabel.setName("packetDataSizeLabel"); // NOI18N

        packetDelayLabel.setText(resourceMap.getString("packetDelayLabel.text")); // NOI18N
        packetDelayLabel.setName("packetDelayLabel"); // NOI18N

        trafficEstimateLabel.setText(resourceMap.getString("trafficEstimateLabel.text")); // NOI18N
        trafficEstimateLabel.setName("trafficEstimateLabel"); // NOI18N

        packetDataSizeSpinner.addChangeListener(bitrateCalculatorChangeListener);
        packetDataSizeSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1024), Integer.valueOf(1), null, Integer.valueOf(1)));
        packetDataSizeSpinner.setName("packetDataSizeSpinner"); // NOI18N

        packetNoSpinner.setModel(new javax.swing.SpinnerNumberModel(Long.valueOf(100L), Long.valueOf(0L), null, Long.valueOf(1L)));
        packetNoSpinner.setName("packetNoSpinner"); // NOI18N

        packetDelaySpinner.addChangeListener(bitrateCalculatorChangeListener);
        packetDelaySpinner.setModel(new javax.swing.SpinnerNumberModel(Long.valueOf(1000L), Long.valueOf(1L), null, Long.valueOf(1L)));
        packetDelaySpinner.setName("packetDelaySpinner"); // NOI18N

        trafficEstimateValueLabel.setText(resourceMap.getString("trafficEstimateValueLabel.text")); // NOI18N
        trafficEstimateValueLabel.setName("trafficEstimateValueLabel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trafficEstimateLabel)
                    .addComponent(packetDataSizeLabel)
                    .addComponent(packetNoLabel)
                    .addComponent(packetDelayLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trafficEstimateValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(packetDelaySpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(packetDataSizeSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(packetNoSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packetNoLabel)
                    .addComponent(packetNoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packetDataSizeLabel)
                    .addComponent(packetDataSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packetDelayLabel)
                    .addComponent(packetDelaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trafficEstimateLabel)
                    .addComponent(trafficEstimateValueLabel))
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel packetDataSizeLabel;
    protected javax.swing.JSpinner packetDataSizeSpinner;
    private javax.swing.JLabel packetDelayLabel;
    protected javax.swing.JSpinner packetDelaySpinner;
    private javax.swing.JLabel packetNoLabel;
    protected javax.swing.JSpinner packetNoSpinner;
    private javax.swing.JLabel trafficEstimateLabel;
    private javax.swing.JLabel trafficEstimateValueLabel;
    // End of variables declaration//GEN-END:variables
    ChangeListener  bitrateCalculatorChangeListener  = new ChangeListener () {

        public void stateChanged(ChangeEvent e) {
            Double d = (0.0+(Integer)packetDataSizeSpinner.getValue())/(Integer)packetDelaySpinner.getValue();
            trafficEstimateValueLabel.setText(Unit.CapacityConvertor(d)+"ps");
        }
    };
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.healthylife.presentation;

import br.com.healthylife.controller.ControllerEmployee;
import br.com.healthylife.entity.Employee;
import br.com.healthylife.util.Constants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author ruann
 */
public class MainScreenEmployee extends javax.swing.JFrame {

    public MainScreenEmployee() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle(Constants.FRAME_TITLE);

        Date dateSystem = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jLDate.setText(dateFormat.format(dateSystem));

        Timer timer = new Timer(1000, new hora());
        timer.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLTimer = new javax.swing.JLabel();
        jLDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuRegister = new javax.swing.JMenu();
        jNewClient = new javax.swing.JMenuItem();
        jNewMedic = new javax.swing.JMenuItem();
        jNewHospital = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuUpdateClient = new javax.swing.JMenuItem();
        jMenuUpdateMedic = new javax.swing.JMenuItem();
        jMenuUpdateHospital = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuDeleteClient = new javax.swing.JMenuItem();
        jMenuDeleteMedic = new javax.swing.JMenuItem();
        jMenuDeleteHospital = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuMakeAppointment = new javax.swing.JMenuItem();
        jMenuItemUpdateConsult = new javax.swing.JMenuItem();
        jMenuItemCancelConsult = new javax.swing.JMenuItem();
        jMenuItemLeave = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuExhibitionClient = new javax.swing.JMenuItem();
        jMenuExhibitionHospital = new javax.swing.JMenuItem();
        jMenuExhibtionMedic = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExhibitionConsult = new javax.swing.JMenuItem();
        jMenuItemExhibitionConsultDone = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMInvoice = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 841, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jLTimer.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTimer.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLDate.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDate.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Healthy Life  - \"Tecnologia inovadora para ajudar seu dia - a - dia\"");

        jDesktopPane2.setLayer(jLTimer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLTimer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMenu1.setText("Arquivo");

        jMenuRegister.setText("Novo Cadastro");

        jNewClient.setText("Clientes");
        jNewClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewClientActionPerformed(evt);
            }
        });
        jMenuRegister.add(jNewClient);

        jNewMedic.setText("Médicos");
        jNewMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewMedicActionPerformed(evt);
            }
        });
        jMenuRegister.add(jNewMedic);

        jNewHospital.setText("Hospitais");
        jNewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewHospitalActionPerformed(evt);
            }
        });
        jMenuRegister.add(jNewHospital);

        jMenu1.add(jMenuRegister);

        jMenu4.setText("Editar Cadastro");

        jMenuUpdateClient.setText("Clientes");
        jMenuUpdateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUpdateClientActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuUpdateClient);

        jMenuUpdateMedic.setText("Médicos");
        jMenuUpdateMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUpdateMedicActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuUpdateMedic);

        jMenuUpdateHospital.setText("Hospitais");
        jMenuUpdateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUpdateHospitalActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuUpdateHospital);

        jMenu1.add(jMenu4);

        jMenu5.setText("Excluir");

        jMenuDeleteClient.setText("Cliente");
        jMenuDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteClientActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuDeleteClient);

        jMenuDeleteMedic.setText("Médico");
        jMenuDeleteMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteMedicActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuDeleteMedic);

        jMenuDeleteHospital.setText("Hospital");
        jMenuDeleteHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeleteHospitalActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuDeleteHospital);

        jMenu1.add(jMenu5);
        jMenu1.add(jSeparator1);

        jMenuMakeAppointment.setText("Marcar Consulta");
        jMenuMakeAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMakeAppointmentActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuMakeAppointment);

        jMenuItemUpdateConsult.setText("Remarcar Consulta");
        jMenuItemUpdateConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpdateConsultActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemUpdateConsult);

        jMenuItemCancelConsult.setText("Cancelar Consulta");
        jMenuItemCancelConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCancelConsultActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCancelConsult);

        jMenuItemLeave.setText("Sair");
        jMenuItemLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLeaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLeave);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exibir");

        jMenuExhibitionClient.setText("Clientes");
        jMenuExhibitionClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExhibitionClientActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuExhibitionClient);

        jMenuExhibitionHospital.setText("Hospitais");
        jMenuExhibitionHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExhibitionHospitalActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuExhibitionHospital);

        jMenuExhibtionMedic.setText("Médicos");
        jMenuExhibtionMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExhibtionMedicActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuExhibtionMedic);
        jMenu2.add(jSeparator2);

        jMenuItemExhibitionConsult.setText("Consultas Marcadas");
        jMenuItemExhibitionConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExhibitionConsultActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemExhibitionConsult);

        jMenuItemExhibitionConsultDone.setText("Consultas Efetuadas");
        jMenuItemExhibitionConsultDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExhibitionConsultDoneActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemExhibitionConsultDone);
        jMenu2.add(jSeparator3);

        jMInvoice.setText("Boleto");
        jMInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInvoiceActionPerformed(evt);
            }
        });
        jMenu2.add(jMInvoice);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Ajuda");
        jMenu6.add(jSeparator4);

        jMenuAbout.setText("Sobre");
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAboutActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuAbout);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAboutActionPerformed
        JOptionPane.showMessageDialog(this, Constants.ABOUT_MESSAGE, Constants.FRAME_TITLE,
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuAboutActionPerformed

    private void jMenuItemLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLeaveActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemLeaveActionPerformed

    private void jNewClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewClientActionPerformed
        jDesktopPane1.add(new RegistrationScreenClientIF()).setVisible(true);
    }//GEN-LAST:event_jNewClientActionPerformed

    private void jNewMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewMedicActionPerformed
        jDesktopPane1.add(new RegistrationScreenMedicIF()).setVisible(true);
    }//GEN-LAST:event_jNewMedicActionPerformed

    private void jNewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewHospitalActionPerformed
        jDesktopPane1.add(new RegistrationScreenHospitalIF()).setVisible(true);
    }//GEN-LAST:event_jNewHospitalActionPerformed

    private void jMInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInvoiceActionPerformed
        jDesktopPane1.add(new ExhibitionInvoiceIF()).setVisible(true);
    }//GEN-LAST:event_jMInvoiceActionPerformed

    private void jMenuUpdateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUpdateClientActionPerformed
        jDesktopPane1.add(new UpdateClientIF()).setVisible(true);
    }//GEN-LAST:event_jMenuUpdateClientActionPerformed

    private void jMenuUpdateMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUpdateMedicActionPerformed
        jDesktopPane1.add(new UpdateMedicIF()).setVisible(true);
    }//GEN-LAST:event_jMenuUpdateMedicActionPerformed

    private void jMenuUpdateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUpdateHospitalActionPerformed
        jDesktopPane1.add(new UpdateHospitalIF()).setVisible(true);
    }//GEN-LAST:event_jMenuUpdateHospitalActionPerformed

    private void jMenuDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteClientActionPerformed
       jDesktopPane1.add(new DeleteClientIF()).setVisible(true);
    }//GEN-LAST:event_jMenuDeleteClientActionPerformed

    private void jMenuDeleteMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteMedicActionPerformed
       jDesktopPane1.add(new DeleteMedicIF()).setVisible(true);
    }//GEN-LAST:event_jMenuDeleteMedicActionPerformed

    private void jMenuDeleteHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeleteHospitalActionPerformed
        jDesktopPane1.add(new DeleteHospitalIF()).setVisible(true);
    }//GEN-LAST:event_jMenuDeleteHospitalActionPerformed

    private void jMenuMakeAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMakeAppointmentActionPerformed
       jDesktopPane1.add(new MakeAnAppointmentScreenIF()).setVisible(true);
    }//GEN-LAST:event_jMenuMakeAppointmentActionPerformed

    private void jMenuItemUpdateConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpdateConsultActionPerformed
        jDesktopPane1.add(new UpdateConsultIF()).setVisible(true);
    }//GEN-LAST:event_jMenuItemUpdateConsultActionPerformed

    private void jMenuItemCancelConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCancelConsultActionPerformed
        jDesktopPane1.add(new CancelConsultIF()).setVisible(true);
    }//GEN-LAST:event_jMenuItemCancelConsultActionPerformed

    private void jMenuExhibitionClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExhibitionClientActionPerformed
        jDesktopPane1.add(new ExhibitionClientIF()).setVisible(true);
    }//GEN-LAST:event_jMenuExhibitionClientActionPerformed

    private void jMenuExhibitionHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExhibitionHospitalActionPerformed
        jDesktopPane1.add(new ExhibitionHospitalIF()).setVisible(true);
    }//GEN-LAST:event_jMenuExhibitionHospitalActionPerformed

    private void jMenuExhibtionMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExhibtionMedicActionPerformed
        jDesktopPane1.add(new ExhibitionMedicalIF()).setVisible(true);
    }//GEN-LAST:event_jMenuExhibtionMedicActionPerformed

    private void jMenuItemExhibitionConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExhibitionConsultActionPerformed
        jDesktopPane1.add(new ExhibitionConsultIF()).setVisible(true);
    }//GEN-LAST:event_jMenuItemExhibitionConsultActionPerformed

    private void jMenuItemExhibitionConsultDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExhibitionConsultDoneActionPerformed
        jDesktopPane1.add(new ExhibitionConsultDoneIF()).setVisible(true);
    }//GEN-LAST:event_jMenuItemExhibitionConsultDoneActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLDate;
    private javax.swing.JLabel jLTimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMInvoice;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuAbout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuDeleteClient;
    private javax.swing.JMenuItem jMenuDeleteHospital;
    private javax.swing.JMenuItem jMenuDeleteMedic;
    private javax.swing.JMenuItem jMenuExhibitionClient;
    private javax.swing.JMenuItem jMenuExhibitionHospital;
    private javax.swing.JMenuItem jMenuExhibtionMedic;
    private javax.swing.JMenuItem jMenuItemCancelConsult;
    private javax.swing.JMenuItem jMenuItemExhibitionConsult;
    private javax.swing.JMenuItem jMenuItemExhibitionConsultDone;
    private javax.swing.JMenuItem jMenuItemLeave;
    private javax.swing.JMenuItem jMenuItemUpdateConsult;
    private javax.swing.JMenuItem jMenuMakeAppointment;
    private javax.swing.JMenu jMenuRegister;
    private javax.swing.JMenuItem jMenuUpdateClient;
    private javax.swing.JMenuItem jMenuUpdateHospital;
    private javax.swing.JMenuItem jMenuUpdateMedic;
    private javax.swing.JMenuItem jNewClient;
    private javax.swing.JMenuItem jNewHospital;
    private javax.swing.JMenuItem jNewMedic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables

    class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            jLTimer.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }

    }

}

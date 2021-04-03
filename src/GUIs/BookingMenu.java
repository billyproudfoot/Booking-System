package GUIs;

import Classes.Methods;
import static GUIs.LogInMenu.textItems;
import java.awt.Component;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.JOptionPane;

public class BookingMenu extends javax.swing.JFrame {

    static String bookingDir = System.getProperty("user.dir") + "\\Bookings.txt";
    Date todaysDate = new Date();
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
    String now = df.format(todaysDate);
    Methods methods = new Methods();
    static String savedEmail;

    public BookingMenu(String email) {
        savedEmail = email;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        RoomLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        DateField = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        WhiteboardLabel = new javax.swing.JLabel();
        ProjectorLabel = new javax.swing.JLabel();
        FlipBoardLabel = new javax.swing.JLabel();
        MarkerLabel = new javax.swing.JLabel();
        PenPaperLabel = new javax.swing.JLabel();
        PastryLabel = new javax.swing.JLabel();
        SandwichLabel = new javax.swing.JLabel();
        CakeLabel = new javax.swing.JLabel();
        TeaCoffeeLabel = new javax.swing.JLabel();
        WaterLabel = new javax.swing.JLabel();
        ProjectorButton = new javax.swing.JRadioButton();
        WhiteBoardButton = new javax.swing.JRadioButton();
        FlipBoardButton = new javax.swing.JRadioButton();
        MarkersButton = new javax.swing.JRadioButton();
        PensPaperButton = new javax.swing.JRadioButton();
        PastryCombo = new javax.swing.JComboBox<>();
        CakeCombo = new javax.swing.JComboBox<>();
        SandwichCombo = new javax.swing.JComboBox<>();
        TeaCoffeeCombo = new javax.swing.JComboBox<>();
        WaterCombo = new javax.swing.JComboBox<>();
        BookRoomButton = new javax.swing.JButton();
        ViewAvailableButton = new javax.swing.JButton();
        RoomComboBox = new javax.swing.JComboBox<>();
        TimeStartLabel = new javax.swing.JLabel();
        TimeFinishLabel = new javax.swing.JLabel();
        TimeStart = new javax.swing.JComboBox<>();
        TimeFinish = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RoomLabel.setText("Room (num of people)");

        DateLabel.setText("Date (dd/MM/YY)");

        DateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        DateField.setText(now);
        DateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateFieldActionPerformed(evt);
            }
        });

        WhiteboardLabel.setText("Whiteboard");

        ProjectorLabel.setText("Projector");

        FlipBoardLabel.setText("Flip Board");

        MarkerLabel.setText("Markers");

        PenPaperLabel.setText("Pens + Paper");

        PastryLabel.setText("Pastries (09:00 - 12:00)");

        SandwichLabel.setText("Sandwiches (11:00 - 16:00)");

        CakeLabel.setText("Cakes (13:00 - 17:00)");

        TeaCoffeeLabel.setText("Tea + Coffee");

        WaterLabel.setText("Water");

        ProjectorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectorButtonActionPerformed(evt);
            }
        });

        PastryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00"}));

        CakeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00" }));

        SandwichCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00" }));

        TeaCoffeeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00" }));

        WaterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00" }));

        BookRoomButton.setText("Book Room");
        BookRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookRoomButtonActionPerformed(evt);
            }
        });

        ViewAvailableButton.setText("View Room Availibility");
        ViewAvailableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAvailableButtonActionPerformed(evt);
            }
        });

        RoomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room 1 (2)", "Room 2 (4)", "Room 3 (8)", "Room 4 (15)", "Room 5 (50)" }));
        RoomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomComboBoxActionPerformed(evt);
            }
        });

        TimeStartLabel.setText("Time Start");

        TimeFinishLabel.setText("Time Finish ");

        TimeStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30" }));

        TimeFinish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00" }));

        jLabel1.setText("Room 4 has disabled access");

        jButton1.setText("View Staff Availability");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Extra Resources and Refreshements");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TimeFinishLabel)
                                    .addComponent(TimeStartLabel)
                                    .addComponent(DateLabel))
                                .addGap(24, 24, 24))
                            .addComponent(RoomLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TimeFinish, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DateField, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ViewAvailableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(92, 92, 92))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RoomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(BookRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProjectorLabel)
                            .addComponent(FlipBoardLabel)
                            .addComponent(MarkerLabel)
                            .addComponent(PenPaperLabel)
                            .addComponent(PastryLabel)
                            .addComponent(SandwichLabel)
                            .addComponent(CakeLabel)
                            .addComponent(TeaCoffeeLabel)
                            .addComponent(WaterLabel)
                            .addComponent(WhiteboardLabel))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PensPaperButton)
                            .addComponent(MarkersButton)
                            .addComponent(FlipBoardButton)
                            .addComponent(ProjectorButton)
                            .addComponent(PastryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CakeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SandwichCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TeaCoffeeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WaterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WhiteBoardButton)))
                    .addComponent(jLabel2))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ViewAvailableButton)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProjectorLabel)
                                    .addComponent(ProjectorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                    .addComponent(jButton1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(WhiteboardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(WhiteBoardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FlipBoardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FlipBoardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MarkerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MarkersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PenPaperLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PensPaperButton, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PastryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PastryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SandwichLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SandwichCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RoomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(RoomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TimeStartLabel)
                                    .addComponent(TimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TimeFinishLabel)
                                    .addComponent(TimeFinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addComponent(BookRoomButton)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CakeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CakeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeaCoffeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeaCoffeeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WaterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WaterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateFieldActionPerformed

    private void ProjectorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectorButtonActionPerformed

    }//GEN-LAST:event_ProjectorButtonActionPerformed

    private void ViewAvailableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAvailableButtonActionPerformed
        AvailableRooms A = new AvailableRooms(DateField.getText());
        A.setVisible(true);
    }//GEN-LAST:event_ViewAvailableButtonActionPerformed

    private void BookRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookRoomButtonActionPerformed

        try {
            // <editor-fold defaultstate="collapsed" desc="PrintToFile">
            DateFormat t = new SimpleDateFormat("HH:mm");
            String date = df.format(df.parse(DateField.getText()));
            String Start = t.format(t.parse((String) TimeStart.getSelectedItem()));
            String Finish = t.format(t.parse((String) TimeFinish.getSelectedItem()));
            int room = RoomComboBox.getSelectedIndex() + 1;
            String startindex = Integer.toString(TimeStart.getSelectedIndex());
            String finishindex = Integer.toString(TimeFinish.getSelectedIndex());
            Boolean projector = ProjectorButton.isSelected();
            Boolean whiteboard = WhiteBoardButton.isSelected();
            Boolean flipboard = FlipBoardButton.isSelected();
            Boolean markers = MarkersButton.isSelected();
            Boolean penpaper = PensPaperButton.isSelected();
            String pastry = Integer.toString(PastryCombo.getSelectedIndex());
            String sandwich = (Integer.toString((SandwichCombo.getSelectedIndex()) + 4));
            if (sandwich.equals("4")) {
                sandwich = "0";
            }
            String cake = (Integer.toString((CakeCombo.getSelectedIndex()) + 8));
            if (cake.equals("8")) {
                cake = "0";
            }
            String teacoffee = Integer.toString(TeaCoffeeCombo.getSelectedIndex());
            String water = Integer.toString(WaterCombo.getSelectedIndex());
            String[] details;
            textItems = methods.readFile(bookingDir);
            boolean flag = false;
            Component frame = null;
            int loop = textItems.size();
            for (int i = 0; i < loop; i++) {
                details = textItems.get(i).split(",");
                // <editor-fold defaultstate="collapsed" desc="Very Messy Logic">
                if (details[0].equals(Integer.toString(room)) && details[1].equals(date)
                        && (((Integer.parseInt(startindex) >= Integer.parseInt(details[3])) && (Integer.parseInt(finishindex)) <= (Integer.parseInt(details[5])))
                        | ((Integer.parseInt(startindex) <= Integer.parseInt(details[5])) && (Integer.parseInt(finishindex) >= (Integer.parseInt(details[3]))))
                        | (((Integer.parseInt(finishindex) + 1) >= (Integer.parseInt(details[3]))) && (Integer.parseInt(finishindex)) <= (Integer.parseInt(details[5])))
                        | (startindex.equals(details[5]))
                        | details[5].equals(finishindex) | (((Integer.parseInt(details[5])) + 1) == (Integer.parseInt(finishindex))))) {
                    i = textItems.size();
                    JOptionPane.showMessageDialog(frame, "This booking is not valid, please check your inputs and try again.");
                    flag = true;
                }
                if (finishindex.equals(details[5])) {
                    JOptionPane.showMessageDialog(frame, "The cleaner is busy at this time, please change the finish time.");
                    flag = true;
                    loop = i;
                }
                if ((details[16].equals(savedEmail)) && (details[1].equals(date)) && (((Integer.parseInt(details[3]) > Integer.parseInt(startindex)) && Integer.parseInt(details[3]) < Integer.parseInt(finishindex))
                        | ((Integer.parseInt(details[5]) > Integer.parseInt(startindex)) && Integer.parseInt(details[5]) < Integer.parseInt(finishindex)))) {
                    JOptionPane.showMessageDialog(frame, "You already have a meeting room booked during this timeframe.");
                    flag = true;
                    loop = i;
                }
                for (int j = 11; j < 15; j++) {
                    if ((!(details[j].equals("0"))) && (((Integer.parseInt(details[j])) == ((Integer.parseInt(pastry)))
                            | ((Integer.parseInt(details[j])) == (Integer.parseInt(sandwich))) | ((Integer.parseInt(details[j])) == (Integer.parseInt(cake)))
                            | ((Integer.parseInt(details[j])) == (Integer.parseInt(teacoffee))) | ((Integer.parseInt(details[j])) == (Integer.parseInt(water)))))) {
                        JOptionPane.showMessageDialog(frame, "The catering staff are busy when you are ordering refresments, please try again.");
                        flag = true;
                        loop = i;
                    }

                }

                // </editor-fold>
            }
            if (flag == false) {
                textItems.add(Integer.toString(room) + "," + date + "," + Start + "," + startindex + "," + Finish + "," + finishindex + "," + projector + "," + whiteboard + ","
                        + flipboard + "," + markers + "," + penpaper + "," + pastry + "," + sandwich + "," + cake + "," + teacoffee + "," + water + "," + savedEmail);
                methods.writeFile(bookingDir, textItems);
                // </editor-fold>
            }

        } catch (ParseException ex) {
            Logger.getLogger(BookingMenu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BookRoomButtonActionPerformed

    private void RoomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminView a = new AdminView(DateField.getText());
                a.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingMenu(savedEmail).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookRoomButton;
    private javax.swing.JComboBox<String> CakeCombo;
    private javax.swing.JLabel CakeLabel;
    private javax.swing.JFormattedTextField DateField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JRadioButton FlipBoardButton;
    private javax.swing.JLabel FlipBoardLabel;
    private javax.swing.JLabel MarkerLabel;
    private javax.swing.JRadioButton MarkersButton;
    private javax.swing.JComboBox<String> PastryCombo;
    private javax.swing.JLabel PastryLabel;
    private javax.swing.JLabel PenPaperLabel;
    private javax.swing.JRadioButton PensPaperButton;
    private javax.swing.JRadioButton ProjectorButton;
    private javax.swing.JLabel ProjectorLabel;
    private javax.swing.JComboBox<String> RoomComboBox;
    private javax.swing.JLabel RoomLabel;
    private javax.swing.JComboBox<String> SandwichCombo;
    private javax.swing.JLabel SandwichLabel;
    private javax.swing.JComboBox<String> TeaCoffeeCombo;
    private javax.swing.JLabel TeaCoffeeLabel;
    private javax.swing.JComboBox<String> TimeFinish;
    private javax.swing.JLabel TimeFinishLabel;
    private javax.swing.JComboBox<String> TimeStart;
    private javax.swing.JLabel TimeStartLabel;
    private javax.swing.JButton ViewAvailableButton;
    private javax.swing.JComboBox<String> WaterCombo;
    private javax.swing.JLabel WaterLabel;
    private javax.swing.JRadioButton WhiteBoardButton;
    private javax.swing.JLabel WhiteboardLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

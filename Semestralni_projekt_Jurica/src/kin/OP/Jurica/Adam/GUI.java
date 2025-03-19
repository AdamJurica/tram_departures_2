///////////////////////////////////////
//////     Semestrální práce     //////
///////////// Jízdní řády /////////////
///////////// Adam Jurica /////////////
// KIN.OP ////////////////// 2024/25 //
///////////////////////////////////////
// Tento projekt si dává za cíl vytvořit funkční desktopovou aplikaci
// která díky grafickému rozhraní umožní rychle vyhledávat odjezdy
// tramvají linek 2 a 3 na úseku ZOO - Dolní Hanychov 
package kin.OP.Jurica.Adam;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// Třída GUI obsahující logiku grafických prvků
public class GUI extends javax.swing.JFrame {

    //inicializuje komponenty GUI
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jízdní řády");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dolní Hanychov", "Kubelíkova", "Janův Důl", "Vápenka", "Staré Pekárny", "Krkonošská", "Viadukt", "Nádraží", "Rybníček", "Fügnerova", "Šaldovo náměstí", "Ulice 5. května", "Průmyslová škola", "Muzeum - Galerie Lázně", "Botanická zahrada", "Riegrova", "Lidovésady - ZOO" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dolní Hanychov", "Kubelíkova", "Janův Důl", "Vápenka", "Staré Pekárny", "Krkonošská", "Viadukt", "Nádraží", "Rybníček", "Fügnerova", "Šaldovo náměstí", "Ulice 5. května", "Průmyslová škola", "Muzeum - Galerie Lázně", "Botanická zahrada", "Riegrova", "Lidovésady - ZOO" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cílová stanice:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Počáteční stanice:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Vyberte stanici");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Vyberte stanici");

        jButton2.setText("Vyhledat spoje");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        jButton1.setText("Zavřít");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1MouseClicked

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jList3MouseClicked

    // Získání vybrané hodnoty z listu 1
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        jList3.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Kontrola, zda byla vybrána položka
                if (!e.getValueIsAdjusting()) {

                    // Nastavení textu do JLabel
                    jLabel3.setText(jList3.getSelectedValue());
                }
            }
        });

        // Získání vybrané hodnoty z listu 2
        jList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Kontrola, zda byla vybrána položka
                if (!e.getValueIsAdjusting()) {

                    // Nastavení textu do JLabel
                    jLabel4.setText(jList1.getSelectedValue());
                }
            }
        });

    }//GEN-LAST:event_jList1ValueChanged

    private static int minutesToAdd = 0; // Globální proměnná int
    private static boolean error = false; // Globální proměnná boolean
    private static int dobaJizdy = 0;
    private static final String ODJEZDY_SMER_ZOO = "odjezdy_smer_zoo.csv";
    private static final String ODJEZDY_SMER_HANYCHOV = "odjezdy_smer_han.csv";
    private static final int MAX_POCET_NACTENI = 30;

    public static int getMinutesToAdd() {
        return minutesToAdd;
    }

    public static void setMinutesToAdd(int minutes) {
        minutesToAdd = minutes;
    }

    public static int getDobaJizdy() {
        return dobaJizdy;
    }

    public static void setDobaJizdy(int minuty) {
        dobaJizdy = minuty;
    }

    public static void setError(boolean err) {
        error = err;
    }

    public static boolean getError() {
        return error;
    }

    private static boolean buttonClicked = false;
    private static boolean smer = false;

    //Tlačítko zmáčknuto 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int[] dobyJizdySmerZOO = {0, 1, 2, 3, 4, 5, 7, 8, 10, 12, 13, 14, 15, 16, 17, 18, 20}; //Doba jízdy mezi konečnou a vybranou zastávkou
        int[] dobyJizdySmerHanychov = {0, 1, 2, 3, 4, 5, 6, 9, 11, 12, 13, 14, 15, 16, 17, 19, 20}; // Používáme pro zjištění doby odjezdu z vybrané zastávky

        buttonClicked = true;

        int index = jList1.getSelectedIndex();
        int index2 = jList3.getSelectedIndex();
        final int celkovaDobaJizdy = 20;  // jízda trvá 20 minut

        error = false;
        if (index >= 0 && index2 >= 0) {
            if (index < index2) {
                setMinutesToAdd(dobyJizdySmerZOO[index]);
                smer = true;
                setDobaJizdy(dobyJizdySmerZOO[index2] - dobyJizdySmerZOO[index]);

            } else if (index > index2) {
                setMinutesToAdd(celkovaDobaJizdy - dobyJizdySmerHanychov[index]);
                smer = false;
                setDobaJizdy((dobyJizdySmerHanychov[16 - index2]) - (dobyJizdySmerHanychov[16 - index]));

            } else {
                error = true;
            }

        } else {
            error = true;
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //ZAVRIT
        System.exit(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private static GUI instance;

    //aktualizace listu s odjezdy
    public void updateListModel(DefaultListModel<String> listModel) {
        jList2.setModel(listModel);
    }

    public static GUI getInstance() {
        return instance;
    }

    //MAIN - spousti  aplikaci
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            instance = new GUI(); // Uloží instanci GUI
            instance.setVisible(true);
        });

        // Kód který řeší co se stane po zmáčknutí tlačítka pro hledání spojů
        while (true) {
            if (buttonClicked) {
                buttonClicked = false; // Resetuj stav tlačítka

                DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
                LocalTime currentTime = LocalTime.now();

                OdjezdyLoader loader = new OdjezdyLoader();
                List<Odjezd> odjezdy;

                if (!smer) {
                    odjezdy = loader.nactiOdjezdy(ODJEZDY_SMER_ZOO);
                } else {
                    odjezdy = loader.nactiOdjezdy(ODJEZDY_SMER_HANYCHOV);
                }

                OdjezdyFilter filter = new OdjezdyFilter();
                List<Odjezd> vybraneOdjezdy = filter.filtrujOdjezdy(odjezdy, currentDay, currentTime, MAX_POCET_NACTENI, GUI.getMinutesToAdd());

                // Naplnění modelu daty
                DefaultListModel<String> listModel = new DefaultListModel<>();
                for (Odjezd odjezd : vybraneOdjezdy) {
                    String item = String.format("%s           Linka %d           Doba jízdy: %d minut", odjezd.getFormattedTime(), odjezd.getLine(), getDobaJizdy());
                    listModel.addElement(item);
                }
                if (GUI.getError()) {
                    listModel.clear();
                    listModel.addElement("Chyba. Zadejte správné stanice");
                }

                // Aktualizace JList v GUI
                java.awt.EventQueue.invokeLater(() -> {
                    GUI.getInstance().updateListModel(listModel);
                });
            }

            // Pauza pro zamezení neustálého cyklování
            try {
                Thread.sleep(100); // 100 ms čekání
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

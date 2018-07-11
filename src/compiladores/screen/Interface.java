/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores.screen;

import compiladores.analises.AnalysisError;
import compiladores.controller.Controlador;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Bruno Henrique
 */
public class Interface extends javax.swing.JFrame {

    File currentFile = null;
    String lastPath = "";
    Controlador controlador = null;
    String code = null;

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        this.loadTextAreaEdit();
        this.labelFile.setText("New file");
        this.labelStatus.setText("Not modified");
        this.initKeyboardDetect();
        controlador = new Controlador();
    }

    public void initKeyboardDetect() {
        KeyEventDispatcher keyEventDispatcher = new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(final KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED) {
                    if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S) {
                        saveFile();
                    } else if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_O) {
                        openFile();
                    } else if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_N) {
                        newFile();
                    } else if (e.getKeyCode() == KeyEvent.VK_F1) {
                        showMessageInfo();
                    } else if (e.getKeyCode() == KeyEvent.VK_F9) {
                        compile();
                    }
                }
                return false;
            }
        };

        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(keyEventDispatcher);
    }

    public void loadTextAreaEdit() {
        textareaEditor.setBorder(new NumberedBorder());
        textareaEditor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
                labelStatus.setText("Modified");
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                labelStatus.setText("Modified");
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {
                labelStatus.setText("Modified");
            }
        });
    }

    private void openFile() {
        JFileChooser jfcfile = new JFileChooser(lastPath);
        int selectedOpt = jfcfile.showOpenDialog(null);

        if (selectedOpt == JFileChooser.APPROVE_OPTION) {
            File file = jfcfile.getSelectedFile();
            if (file.exists()) {
                textareaMessages.setText("");
                textareaEditor.setText("");
                labelFile.setText(file.getAbsolutePath());
                lastPath = file.getAbsolutePath();
                currentFile = file;
                try {
                    BufferedReader bfr = new BufferedReader(new FileReader(file));
                    String line = bfr.readLine();
                    while (line != null) {
                        textareaEditor.append(line + "\n");
                        line = bfr.readLine();
                    }
                    labelStatus.setText("Not modified");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "File not found");
            }
        }
        textareaEditor.requestFocus();
    }

    private void newFile() {
        currentFile = null;
        textareaEditor.setText("");
        textareaMessages.setText("");
        textareaEditor.requestFocus();
        labelFile.setText("New file");
        labelStatus.setText("Not modified");
    }

    private void saveFile() {
        JFileChooser JFCFile = new JFileChooser(lastPath);
        if (currentFile != null) {
            JFCFile.setSelectedFile(currentFile);
        }
        if (JFCFile.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = JFCFile.getSelectedFile();
            boolean wantSave = true;
            if (file.exists() && currentFile == null) {
                wantSave = JOptionPane.showConfirmDialog(null, "File already exists, want to replace?") == JOptionPane.OK_OPTION;
            }
            if (wantSave) {
                try {
                    String lineSeparator = System.getProperty("line.separator");
                    BufferedWriter bfw = new BufferedWriter(new FileWriter(file));
                    String content[] = textareaEditor.getText().split("\n");
                    for (int i = 0; i < content.length; i++) {
                        bfw.write(content[i] + lineSeparator);
                    }
                    currentFile = file;
                    lastPath = file.getAbsolutePath();
                    labelFile.setText(lastPath);
                    labelStatus.setText("Not modified");
                    this.clearMessageArea();
                    bfw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void clearMessageArea() {
        this.textareaMessages.setText("");
    }

    private void showMessageInfo() {
        this.clearMessageArea();
        textareaMessages.setText("Aluno: Bruno Henrique Freiberger");
    }

    private void compile() {
        if (!textareaEditor.getText().trim().isEmpty()) {
            try {
                if (this.currentFile == null) {
                    this.saveFile();
                }
                String fileName = currentFile.getName().substring(0, currentFile.getName().lastIndexOf('.'));
                this.code = this.controlador.compile(textareaEditor.getText(), fileName);
                this.clearMessageArea();
                this.saveCodeCompiled();
                this.textareaMessages.setText("Programa compilado com sucesso");
            } catch (AnalysisError ae) {
                this.textareaMessages.setText("Erro na linha " + ae.getPosition() + ": " + ae.getMessage());
            }
        }
    }

    private void saveCodeCompiled() {
        try {
            File compiled = new File(currentFile.getAbsolutePath().replace(".txt", ".il"));
            BufferedWriter bfw = new BufferedWriter(new FileWriter(compiled));
            bfw.write(this.code);
            bfw.close();
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelButton = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        btnPaste = new javax.swing.JButton();
        btnCut = new javax.swing.JButton();
        btnCompile = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        scrollpanelMessage = new javax.swing.JScrollPane();
        textareaMessages = new javax.swing.JTextArea();
        panelStatus = new javax.swing.JPanel();
        labelStatus = new javax.swing.JLabel();
        labelFile = new javax.swing.JLabel();
        labelStatusFixed = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelEditor = new javax.swing.JPanel();
        scrollPanelEditor = new javax.swing.JScrollPane();
        textareaEditor = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compiler");
        setMinimumSize(new java.awt.Dimension(900, 650));
        setSize(new java.awt.Dimension(900, 650));

        panelButton.setMinimumSize(new java.awt.Dimension(145, 590));
        panelButton.setPreferredSize(new java.awt.Dimension(145, 590));

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiladores/icons/new.png"))); // NOI18N
        btnNew.setText("New [ctrl-n]");
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiladores/icons/save.png"))); // NOI18N
        btnSave.setText("Save [ctrl-s]");
        btnSave.setMaximumSize(new java.awt.Dimension(89, 23));
        btnSave.setMinimumSize(new java.awt.Dimension(89, 23));
        btnSave.setPreferredSize(new java.awt.Dimension(89, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiladores/icons/open.png"))); // NOI18N
        btnOpen.setText("Open [ctrl-o]");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiladores/icons/copy.png"))); // NOI18N
        btnCopy.setText("Copy [ctrl-c]");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        btnPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiladores/icons/paste.png"))); // NOI18N
        btnPaste.setText("Paste [ctrl-v]");
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });

        btnCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiladores/icons/cut.png"))); // NOI18N
        btnCut.setText("Cut [ctrl-x]");
        btnCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCutActionPerformed(evt);
            }
        });

        btnCompile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiladores/icons/build.png"))); // NOI18N
        btnCompile.setText("Compile [F9]");
        btnCompile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompileActionPerformed(evt);
            }
        });

        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiladores/icons/about.png"))); // NOI18N
        btnAbout.setText("About [F1]");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
            .addComponent(btnCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPaste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCompile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCut, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCompile, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        scrollpanelMessage.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollpanelMessage.setToolTipText("");
        scrollpanelMessage.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpanelMessage.setMinimumSize(new java.awt.Dimension(740, 105));
        scrollpanelMessage.setName(""); // NOI18N
        scrollpanelMessage.setPreferredSize(new java.awt.Dimension(740, 105));
        scrollpanelMessage.setRequestFocusEnabled(false);

        textareaMessages.setEditable(false);
        textareaMessages.setColumns(20);
        textareaMessages.setRows(5);
        textareaMessages.setPreferredSize(null);
        scrollpanelMessage.setViewportView(textareaMessages);

        panelStatus.setMinimumSize(new java.awt.Dimension(900, 25));
        panelStatus.setPreferredSize(new java.awt.Dimension(900, 25));

        labelStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelStatus.setToolTipText("");

        labelFile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        labelStatusFixed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelStatusFixed.setText("Status:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("File:");

        javax.swing.GroupLayout panelStatusLayout = new javax.swing.GroupLayout(panelStatus);
        panelStatus.setLayout(panelStatusLayout);
        panelStatusLayout.setHorizontalGroup(
            panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusLayout.createSequentialGroup()
                .addComponent(labelStatusFixed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelStatusLayout.setVerticalGroup(
            panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusLayout.createSequentialGroup()
                .addGroup(panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStatusLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(labelStatusFixed))
                    .addGroup(panelStatusLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFile, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEditor.setAutoscrolls(true);
        panelEditor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelEditor.setMinimumSize(new java.awt.Dimension(660, 410));
        panelEditor.setPreferredSize(new java.awt.Dimension(660, 410));

        scrollPanelEditor.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPanelEditor.setToolTipText("");
        scrollPanelEditor.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPanelEditor.setAutoscrolls(true);
        scrollPanelEditor.setMinimumSize(new java.awt.Dimension(720, 450));
        scrollPanelEditor.setPreferredSize(new java.awt.Dimension(720, 450));

        textareaEditor.setColumns(20);
        textareaEditor.setRows(5);
        textareaEditor.setMinimumSize(new java.awt.Dimension(720, 430));
        textareaEditor.setPreferredSize(null);
        scrollPanelEditor.setViewportView(textareaEditor);

        javax.swing.GroupLayout panelEditorLayout = new javax.swing.GroupLayout(panelEditor);
        panelEditor.setLayout(panelEditorLayout);
        panelEditorLayout.setHorizontalGroup(
            panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelEditor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEditorLayout.setVerticalGroup(
            panelEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPanelEditor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpanelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 745, Short.MAX_VALUE)
                    .addComponent(panelEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollpanelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        this.openFile();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.newFile();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        this.saveFile();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        textareaEditor.copy();
    }//GEN-LAST:event_btnCopyActionPerformed

    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
        textareaEditor.paste();
    }//GEN-LAST:event_btnPasteActionPerformed

    private void btnCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCutActionPerformed
        textareaEditor.cut();
    }//GEN-LAST:event_btnCutActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        this.showMessageInfo();
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnCompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompileActionPerformed
        this.compile();
    }//GEN-LAST:event_btnCompileActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnCompile;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnCut;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelFile;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelStatusFixed;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelEditor;
    private javax.swing.JPanel panelStatus;
    private javax.swing.JScrollPane scrollPanelEditor;
    private javax.swing.JScrollPane scrollpanelMessage;
    private javax.swing.JTextArea textareaEditor;
    private javax.swing.JTextArea textareaMessages;
    // End of variables declaration//GEN-END:variables
}

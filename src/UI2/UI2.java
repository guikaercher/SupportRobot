package UI2;

import CNPJstuff.TrataDadosCNPJ;
import UI1.*;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import supportrobot.Botao;
import supportrobot.HandleBotoes;
import supportrobot.HandleMacros;
import supportrobot.Macro;
import supportrobot.Typer;

/**
 *
 * @author Guilherme_Kaercher
 */
public class UI2 extends javax.swing.JFrame {

    private int posX = 0, posY = 0;
    //menus
    MenuEditarMacros menuEditarMacros;

    //para escrever apenas.
    Typer type;

    //configs
    private int delay = 3000;
    private boolean modoEdicaoHabilitado;

    //botoes           
    Macro macroBotao1, macroBotao2, macroBotao3, macroBotao4, macroBotao5, macroBotao6, macroBotao7, macroBotao8, macroBotao9, macroBotao10;

    /**
     * Creates new form UI
     */
    public UI2() {
        macroBotao1 = null;
        macroBotao2 = null;
        macroBotao3 = null;
        macroBotao4 = null;
        macroBotao5 = null;
        macroBotao6 = null;
        macroBotao7 = null;
        macroBotao8 = null;
        macroBotao9 = null;
        macroBotao10 = null;
        //se houverem botoes salvos, carrega do txt.
        carregaBotoesSalvos();

        modoEdicaoHabilitado = false;
        type = new Typer();
        menuEditarMacros = new MenuEditarMacros();

        initComponents();

        carregaNomeDosBotoes();
    }

    public void carregaBotoesSalvos() {
        if (HandleBotoes.getInstance().getBotaoPerName("botao1") != null) {
            macroBotao1 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao1").getNomeDaMacro());
            System.out.println("BOTAO 1 POPULADO");
        }
        if (HandleBotoes.getInstance().getBotaoPerName("botao2") != null) {
            macroBotao2 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao2").getNomeDaMacro());
            System.out.println("BOTAO 2 POPULADO");
        }
        if (HandleBotoes.getInstance().getBotaoPerName("botao3") != null) {
            macroBotao3 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao3").getNomeDaMacro());
            System.out.println("BOTAO 3 POPULADO");
        }
        if (HandleBotoes.getInstance().getBotaoPerName("botao4") != null) {
            macroBotao4 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao4").getNomeDaMacro());
            System.out.println("BOTAO 4 POPULADO");
        }
        if (HandleBotoes.getInstance().getBotaoPerName("botao5") != null) {
            macroBotao5 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao5").getNomeDaMacro());
            System.out.println("BOTAO 5 POPULADO");
        }
        if (HandleBotoes.getInstance().getBotaoPerName("botao6") != null) {
            macroBotao6 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao6").getNomeDaMacro());
            System.out.println("BOTAO 6 POPULADO");
        }
        if (HandleBotoes.getInstance().getBotaoPerName("botao7") != null) {
            macroBotao7 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao7").getNomeDaMacro());
            System.out.println("BOTAO 7 POPULADO");
        }
        if (HandleBotoes.getInstance().getBotaoPerName("botao8") != null) {
            macroBotao8 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao8").getNomeDaMacro());
            System.out.println("BOTAO 8 POPULADO");
        }
        if (HandleBotoes.getInstance().getBotaoPerName("botao9") != null) {
            macroBotao9 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao9").getNomeDaMacro());
            System.out.println("BOTAO 9 POPULADO");
        }
        if (HandleBotoes.getInstance().getBotaoPerName("botao10") != null) {
            macroBotao10 = HandleMacros.getInstance().getMacroPerName(HandleBotoes.getInstance().getBotaoPerName("botao10").getNomeDaMacro());
            System.out.println("BOTAO 10 POPULADO");
        }
    }

    public void carregaNomeDosBotoes() {
        if (macroBotao1 != null) {
            jButton1.setText(macroBotao1.getNome());
        }
        if (macroBotao2 != null) {
            jButton2.setText(macroBotao2.getNome());
        }
        if (macroBotao3 != null) {
            jButton3.setText(macroBotao3.getNome());
        }
        if (macroBotao4 != null) {
            jButton4.setText(macroBotao4.getNome());
        }
        if (macroBotao5 != null) {
            jButton5.setText(macroBotao5.getNome());
        }
        if (macroBotao6 != null) {
            jButton6.setText(macroBotao6.getNome());
        }
        if (macroBotao7 != null) {
            jButton7.setText(macroBotao7.getNome());
        }
//        if (macroBotao8 != null) {
//            jButton8.setText(macroBotao8.getNome());
//        }
//        if (macroBotao9 != null) {
//            jButton9.setText(macroBotao9.getNome());
//        }
//        if (macroBotao10 != null) {
//            jButton10.setText(macroBotao10.getNome());
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButtonBuscaCNPJ = new javax.swing.JButton();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.darkGray);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jButton1.setText("Botao 01");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cumprimentos");

        jButton2.setText("Botao 02");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setText("Garantias");

        jButton3.setText("Botao 03");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Botao 04");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Botao 05");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setText("Sayings 3");

        jButton6.setText("Botao 06");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Botao 07");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(54, 54, 54))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        jLabel4.setText("CNPJ");

        jButtonBuscaCNPJ.setText("Busca");
        jButtonBuscaCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaCNPJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 71, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jTextFieldCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscaCNPJ)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscaCNPJ))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 51));

        jButton11.setBackground(new java.awt.Color(51, 51, 51));
        jButton11.setText("Sair do app");
        jButton11.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setText("Send to tray");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setText("Menu");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jLabel6.setText("Copyright © 2016, guilhermekaercher.com.br");

        jMenu4.setText("Arquivo");
        jMenu4.setEnabled(false);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Editar");

        jMenuItem5.setText("Adcionar Macros");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jCheckBoxMenuItem1.setText("Editar Botoes");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem3.setText("Adcionar botoes");
        jCheckBoxMenuItem3.setEnabled(false);
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Configurações");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Manter app no topo");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jMenuItem2.setText("Resetar tamanho");
        jMenuItem2.setEnabled(false);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Atraso da escrita");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Debug Mode");
        jMenu3.setEnabled(false);
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (modoEdicaoHabilitado == true) {
            //deixa as opcoes no menu
            Object[] selectionValues = HandleMacros.getInstance().getAllMacrosNamesInArray();

            if (selectionValues.length == 0) {
                JOptionPane.showMessageDialog(this, "  \n Crie Macros antes de tentar adcionar ao botao! \n\n", "Nenhuma Macro nao encontrada", JOptionPane.ERROR_MESSAGE);
                return;

            }

            String initialSelection = (String) selectionValues[0];
            //pega em String o nome da macro selecionada
            Object selection = JOptionPane.showInputDialog(null, "Selecione a Macro para este botao",
                    "Alterar Macro do botao", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            //se != apertou botao CANCELAR no JoptionPane
            if (selection != null) {
                //configura o botao com a macro
                String result = (String) selection;
                macroBotao1 = HandleMacros.getInstance().getMacroPerName(result);
                HandleBotoes.getInstance().adcionaBotao(new Botao("botao1", result));
                if (macroBotao1 != null) {
                    System.out.println("macro " + result + " adcionada neste botao");
                    jButton1.setText(macroBotao1.getNome());
                } else {
                    System.out.println("macro " + result + " NAO ENCONTRADA");
                    JOptionPane.showMessageDialog(this, "  \n Macro nao encontrada! \n\n", "Modo de edicao habilitado", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else //se nao esta no modo edicao / usar o botao  
        //macroBotao1 = HandleMacros.getInstance().getMacroPerName("testez");
        if (macroBotao1 != null) {
            type.robot.delay(delay);
            type.typeThat(macroBotao1.getTexto());
        } else {
            JOptionPane.showMessageDialog(this, "  \n Botao ainda nao tem uma macro! \n\n", "Edite o botao para usar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = {"1 segundo", "2 segundos", "3 segundos"};
        String initialSelection = "1 segundo";
        String aux = "3";

        Object selection = JOptionPane.showInputDialog(null, "Quantos segundos de atraso para a escrita do texto?",
                "Alterar o atraso", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        //se o usuario marcou algo, pega apenas o NUMERO e seta o delay para este NUMERO
        if (selection != null) {
            aux = (String) selection;
            delay = Integer.parseInt(aux.substring(0, 1)) * 1000;
        }

        System.out.println("delay de digitacao: " + aux);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        menuEditarMacros.setVisible(true);
        double x = this.getLocation().getX() + 305;
        double y = this.getLocation().getY() + this.getLocation().getY() / 2;

        //se o jFrame menuEditarMacros estiver dentro da resolucao abaixo, desenha junto com o Jframe UI
        //se nao desenha no meio da tela
        if (x < 1024 && y < 768) {
            menuEditarMacros.setLocation((int) x, (int) y);
        } else {
            menuEditarMacros.setLocation(null);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        if (jCheckBoxMenuItem1.isSelected()) {
            modoEdicaoHabilitado = true;
            System.out.println("modo edicao, habilitado? == " + modoEdicaoHabilitado);
            JOptionPane.showMessageDialog(this, "  \n Clique nos botoes para ALTERAR a macro deles.\n\n", "Modo de edicao habilitado", JOptionPane.WARNING_MESSAGE);

        } else {
            modoEdicaoHabilitado = false;
            System.out.println("modo edicao, habilitado? == " + modoEdicaoHabilitado);
            JOptionPane.showMessageDialog(this, "  \n Clique nos botoes para USAR a macro deles.\n\n", "Modo de edicao desabilitado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (modoEdicaoHabilitado == true) {
            //deixa as opcoes no menu
            Object[] selectionValues = HandleMacros.getInstance().getAllMacrosNamesInArray();

            if (selectionValues.length == 0) {
                JOptionPane.showMessageDialog(this, "  \n Crie Macros antes de tentar adcionar ao botao! \n\n", "Nenhuma Macro nao encontrada", JOptionPane.ERROR_MESSAGE);
                return;

            }

            String initialSelection = (String) selectionValues[0];
            //pega em String o nome da macro selecionada
            Object selection = JOptionPane.showInputDialog(null, "Selecione a Macro para este botao",
                    "Alterar Macro do botao", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            //se != apertou botao CANCELAR no JoptionPane
            if (selection != null) {
                //configura o botao com a macro
                String result = (String) selection;
                macroBotao2 = HandleMacros.getInstance().getMacroPerName(result);
                HandleBotoes.getInstance().adcionaBotao(new Botao("botao2", result));
                if (macroBotao2 != null) {
                    System.out.println("macro " + result + " adcionada neste botao");
                    jButton2.setText(macroBotao2.getNome());
                } else {
                    System.out.println("macro " + result + " NAO ENCONTRADA");
                    JOptionPane.showMessageDialog(this, "  \n Macro nao encontrada! \n\n", "Modo de edicao habilitado", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else //se nao esta no modo edicao / usar o botao  
        //macroBotao2 = HandleMacros.getInstance().getMacroPerName("testez");
        if (macroBotao2 != null) {
            type.robot.delay(delay);
            type.typeThat(macroBotao2.getTexto());
        } else {
            JOptionPane.showMessageDialog(this, "  \n Botao ainda nao tem uma macro! \n\n", "Edite o botao para usar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        if (jCheckBoxMenuItem2.isSelected()) {
            this.setAlwaysOnTop(true);
        } else {
            this.setAlwaysOnTop(false);
        }

    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setSize(1059, 518);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (modoEdicaoHabilitado == true) {
            //deixa as opcoes no menu
            Object[] selectionValues = HandleMacros.getInstance().getAllMacrosNamesInArray();

            if (selectionValues.length == 0) {
                JOptionPane.showMessageDialog(this, "  \n Crie Macros antes de tentar adcionar ao botao! \n\n", "Nenhuma Macro nao encontrada", JOptionPane.ERROR_MESSAGE);
                return;

            }

            String initialSelection = (String) selectionValues[0];
            //pega em String o nome da macro selecionada
            Object selection = JOptionPane.showInputDialog(null, "Selecione a Macro para este botao",
                    "Alterar Macro do botao", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            //se != apertou botao CANCELAR no JoptionPane
            if (selection != null) {
                //configura o botao com a macro
                String result = (String) selection;
                macroBotao3 = HandleMacros.getInstance().getMacroPerName(result);
                HandleBotoes.getInstance().adcionaBotao(new Botao("botao3", result));
                if (macroBotao3 != null) {
                    System.out.println("macro " + result + " adcionada neste botao");
                    jButton3.setText(macroBotao3.getNome());
                } else {
                    System.out.println("macro " + result + " NAO ENCONTRADA");
                    JOptionPane.showMessageDialog(this, "  \n Macro nao encontrada! \n\n", "Modo de edicao habilitado", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else //se nao esta no modo edicao / usar o botao  
        //macroBotao3 = HandleMacros.getInstance().getMacroPerName("testez");
        if (macroBotao3 != null) {
            type.robot.delay(delay);
            type.typeThat(macroBotao3.getTexto());
        } else {
            JOptionPane.showMessageDialog(this, "  \n Botao ainda nao tem uma macro! \n\n", "Edite o botao para usar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (modoEdicaoHabilitado == true) {
            //deixa as opcoes no menu
            Object[] selectionValues = HandleMacros.getInstance().getAllMacrosNamesInArray();

            if (selectionValues.length == 0) {
                JOptionPane.showMessageDialog(this, "  \n Crie Macros antes de tentar adcionar ao botao! \n\n", "Nenhuma Macro nao encontrada", JOptionPane.ERROR_MESSAGE);
                return;

            }

            String initialSelection = (String) selectionValues[0];
            //pega em String o nome da macro selecionada
            Object selection = JOptionPane.showInputDialog(null, "Selecione a Macro para este botao",
                    "Alterar Macro do botao", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            //se != apertou botao CANCELAR no JoptionPane
            if (selection != null) {
                //configura o botao com a macro
                String result = (String) selection;
                macroBotao4 = HandleMacros.getInstance().getMacroPerName(result);
                HandleBotoes.getInstance().adcionaBotao(new Botao("botao4", result));
                if (macroBotao4 != null) {
                    System.out.println("macro " + result + " adcionada neste botao");
                    jButton4.setText(macroBotao4.getNome());
                } else {
                    System.out.println("macro " + result + " NAO ENCONTRADA");
                    JOptionPane.showMessageDialog(this, "  \n Macro nao encontrada! \n\n", "Modo de edicao habilitado", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else //se nao esta no modo edicao / usar o botao  
        //macroBotao4 = HandleMacros.getInstance().getMacroPerName("testez");
        if (macroBotao4 != null) {
            type.robot.delay(delay);
            type.typeThat(macroBotao4.getTexto());
        } else {
            JOptionPane.showMessageDialog(this, "  \n Botao ainda nao tem uma macro! \n\n", "Edite o botao para usar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (modoEdicaoHabilitado == true) {
            //deixa as opcoes no menu
            Object[] selectionValues = HandleMacros.getInstance().getAllMacrosNamesInArray();

            if (selectionValues.length == 0) {
                JOptionPane.showMessageDialog(this, "  \n Crie Macros antes de tentar adcionar ao botao! \n\n", "Nenhuma Macro nao encontrada", JOptionPane.ERROR_MESSAGE);
                return;

            }

            String initialSelection = (String) selectionValues[0];
            //pega em String o nome da macro selecionada
            Object selection = JOptionPane.showInputDialog(null, "Selecione a Macro para este botao",
                    "Alterar Macro do botao", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            //se != apertou botao CANCELAR no JoptionPane
            if (selection != null) {
                //configura o botao com a macro
                String result = (String) selection;
                macroBotao5 = HandleMacros.getInstance().getMacroPerName(result);
                HandleBotoes.getInstance().adcionaBotao(new Botao("botao5", result));
                if (macroBotao5 != null) {
                    System.out.println("macro " + result + " adcionada neste botao");
                    jButton5.setText(macroBotao5.getNome());
                } else {
                    System.out.println("macro " + result + " NAO ENCONTRADA");
                    JOptionPane.showMessageDialog(this, "  \n Macro nao encontrada! \n\n", "Modo de edicao habilitado", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else //se nao esta no modo edicao / usar o botao  
        //macroBotao5 = HandleMacros.getInstance().getMacroPerName("testez");
        if (macroBotao5 != null) {
            type.robot.delay(delay);
            type.typeThat(macroBotao5.getTexto());
        } else {
            JOptionPane.showMessageDialog(this, "  \n Botao ainda nao tem uma macro! \n\n", "Edite o botao para usar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (modoEdicaoHabilitado == true) {
            //deixa as opcoes no menu
            Object[] selectionValues = HandleMacros.getInstance().getAllMacrosNamesInArray();

            if (selectionValues.length == 0) {
                JOptionPane.showMessageDialog(this, "  \n Crie Macros antes de tentar adcionar ao botao! \n\n", "Nenhuma Macro nao encontrada", JOptionPane.ERROR_MESSAGE);
                return;

            }

            String initialSelection = (String) selectionValues[0];
            //pega em String o nome da macro selecionada
            Object selection = JOptionPane.showInputDialog(null, "Selecione a Macro para este botao",
                    "Alterar Macro do botao", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            //se != apertou botao CANCELAR no JoptionPane
            if (selection != null) {
                //configura o botao com a macro
                String result = (String) selection;
                macroBotao6 = HandleMacros.getInstance().getMacroPerName(result);
                HandleBotoes.getInstance().adcionaBotao(new Botao("botao6", result));
                if (macroBotao6 != null) {
                    System.out.println("macro " + result + " adcionada neste botao");
                    jButton6.setText(macroBotao6.getNome());
                } else {
                    System.out.println("macro " + result + " NAO ENCONTRADA");
                    JOptionPane.showMessageDialog(this, "  \n Macro nao encontrada! \n\n", "Modo de edicao habilitado", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else //se nao esta no modo edicao / usar o botao  
        //macroBotao6 = HandleMacros.getInstance().getMacroPerName("testez");
        if (macroBotao6 != null) {
            type.robot.delay(delay);
            type.typeThat(macroBotao6.getTexto());
        } else {
            JOptionPane.showMessageDialog(this, "  \n Botao ainda nao tem uma macro! \n\n", "Edite o botao para usar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (modoEdicaoHabilitado == true) {
            //deixa as opcoes no menu
            Object[] selectionValues = HandleMacros.getInstance().getAllMacrosNamesInArray();

            if (selectionValues.length == 0) {
                JOptionPane.showMessageDialog(this, "  \n Crie Macros antes de tentar adcionar ao botao! \n\n", "Nenhuma Macro nao encontrada", JOptionPane.ERROR_MESSAGE);
                return;

            }

            String initialSelection = (String) selectionValues[0];
            //pega em String o nome da macro selecionada
            Object selection = JOptionPane.showInputDialog(null, "Selecione a Macro para este botao",
                    "Alterar Macro do botao", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            //se != apertou botao CANCELAR no JoptionPane
            if (selection != null) {
                //configura o botao com a macro
                String result = (String) selection;
                macroBotao7 = HandleMacros.getInstance().getMacroPerName(result);
                HandleBotoes.getInstance().adcionaBotao(new Botao("botao7", result));
                if (macroBotao7 != null) {
                    System.out.println("macro " + result + " adcionada neste botao");
                    jButton7.setText(macroBotao7.getNome());
                } else {
                    System.out.println("macro " + result + " NAO ENCONTRADA");
                    JOptionPane.showMessageDialog(this, "  \n Macro nao encontrada! \n\n", "Modo de edicao habilitado", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else //se nao esta no modo edicao / usar o botao  
        //macroBotao7 = HandleMacros.getInstance().getMacroPerName("testez");
        if (macroBotao7 != null) {
            type.robot.delay(delay);
            type.typeThat(macroBotao7.getTexto());
        } else {
            JOptionPane.showMessageDialog(this, "  \n Botao ainda nao tem uma macro! \n\n", "Edite o botao para usar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        //sets frame position when mouse dragged			
        setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_formMouseDragged

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButtonBuscaCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaCNPJActionPerformed
        String cnpj = jTextFieldCNPJ.getText();
       
        if(cnpj == null || cnpj.length() < 14){
            JOptionPane.showMessageDialog(this, "  \n Por favor, insira um CNPJ válido! \n\n", "CNPJ inválido", JOptionPane.ERROR_MESSAGE);
            jTextFieldCNPJ.setText("");
            return;
        } 
        
        TrataDadosCNPJ trata = new TrataDadosCNPJ();
        trata.recebeDados(cnpj);
        
        //cep é feito separado para tirar caracteres especiais
        String cep = trata.trataDado("cep");
                cep = cep.replace("-", "");
                cep = cep.replace(".", "");
                cep = cep.replace("/", "");
                
        if(cep.equalsIgnoreCase("nao encontrou este CNPJ")){
            JOptionPane.showMessageDialog(this, "  \n CNPJ nao encontrado, verifique o numero digitado! \n\n", "CNPJ inválido", JOptionPane.ERROR_MESSAGE);
            jTextFieldCNPJ.setText("");
            return;
        } 

        //rua, numero, complemento, bairro, cidade, estado, cep       
        MenuCNPJ menuCNPJ = new MenuCNPJ(trata.trataDado("logradouro"), 
                                         trata.trataDado("numero"), 
                                         trata.trataDado("complemento"), 
                                         trata.trataDado("bairro"), 
                                         trata.trataDado("municipio"), 
                                         trata.trataDado("uf"), 
                                         cep);
            
        menuCNPJ.setVisible(true);
        
        //jTextFieldCNPJ.setText(trata.trataDado("logradouro", cnpj));

        
    }//GEN-LAST:event_jButtonBuscaCNPJActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      
        final JFrame j = this;
        j.setVisible(false);
        j.dispose();
        
        
        String icoPath = System.getProperty("user.dir") + "\\icontray.png";

        if (SystemTray.isSupported()) {
            final SystemTray systemTray = SystemTray.getSystemTray();
            final TrayIcon trayIcon = new TrayIcon(new ImageIcon(icoPath, "omt").getImage(), "Java App");
            trayIcon.setImageAutoSize(true);// Autosize icon base on space

            MouseAdapter mouseAdapter = new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    j.setVisible(true);
                    systemTray.remove(trayIcon);
                }
            };
            trayIcon.addMouseListener(mouseAdapter);
            try {
                systemTray.add(trayIcon);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(UI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonBuscaCNPJ;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextFieldCNPJ;
    // End of variables declaration//GEN-END:variables
}

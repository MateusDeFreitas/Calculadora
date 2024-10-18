package Pck_view;

import javax.swing.JOptionPane;

public class InterfaceCalculadora extends javax.swing.JFrame {
    
    String vazio = "";
    String resultado;
    int operacao;
    int contador = 0; //contador de operadores pendentes
    String ultimoBotao;
    double total;
    
    public void limpar() {
        labelTela.setText("");
    }
    
    public void digitar(String tecla) {
        String tela = labelTela.getText();
        
        if (ultimoBotao == "=") {
            limpar();
            tela = labelTela.getText();
        }
        if (tela == "0" || tela == "0.0" || tela == "0.00") {
            limpar();
            tela = labelTela.getText();
        }
        if (tecla == ".") {
            if (tela.contains(".")) {

            } else {
                if (tela == "") {
                    labelTela.setText("0");
                    tela = labelTela.getText();
                }
                labelTela.setText(tela + ".");
            }
        } else if (tecla == "%") {        
            if (tela == "0" || tela == "") {

            } else {
                tela = labelTela.getText();
                double valor;

                try {
                    valor = Double.parseDouble(tela);
                    total = valor/100;
                    tela = Double.toString(total);
                    labelTela.setText(tela);
                } catch (NumberFormatException e) {}
            }
        } else {
            labelTela.setText(tela + tecla);
        }
        ultimoBotao = tecla;
    }
    
    public void zerar() {
        labelTela.setText("0");
        ultimoBotao = "";
        resultado = "";
        total = 0;
        contador = 0;
        operacao = 0;
    }
    
    public void operar(int operador) {
        resultado = labelTela.getText(); 
        
        if (operador == 2 && resultado == "") {
            digitar("-");
        } else {
            if (contador > 0) {
                calcular();
            }
            try {
                resultado = labelTela.getText();
                total = Double.parseDouble(resultado);
                operacao = operador;
                contador++;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Formato de número inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (ultimoBotao != "=") {
            limpar();
        } 
    }
    
    public void calcular() {
        String tela = labelTela.getText();
        double valor;
        
        try {
            valor = Double.parseDouble(tela);
            
            if (operacao == 1) {
                total += valor;
            } else if (operacao == 2) {
                total -= valor;
            } else if (operacao == 3) {
                total *= valor;
            } else if (operacao == 4) {
                total /= valor;
            }
            
            
            
            resultado = String.format("%.2f", total);
            String resultadoComPonto = resultado.replace(",", ".");
            labelTela.setText(resultadoComPonto);
            contador--;
            ultimoBotao = "=";
        } catch (NumberFormatException e) {} 
    }
    
    
    public InterfaceCalculadora() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTela = new java.awt.Label();
        jLabelTeclaDivisao = new javax.swing.JLabel();
        jLabelTeclaPorCentagem = new javax.swing.JLabel();
        jLabelTeclaMaisMenos = new javax.swing.JLabel();
        jLabelTeclaAC = new javax.swing.JLabel();
        jLabelTeclaVezes = new javax.swing.JLabel();
        jLabelTeclaNove = new javax.swing.JLabel();
        jLabelTeclaOito = new javax.swing.JLabel();
        jLabelTeclaSete = new javax.swing.JLabel();
        jLabelTeclaMenos = new javax.swing.JLabel();
        jLabelTeclaSeis = new javax.swing.JLabel();
        jLabelTeclaCinco = new javax.swing.JLabel();
        jLabelTeclaQuatro = new javax.swing.JLabel();
        jLabelTeclaMais = new javax.swing.JLabel();
        jLabelTeclaTres = new javax.swing.JLabel();
        jLabelTeclaDois = new javax.swing.JLabel();
        jLabelTeclaUm = new javax.swing.JLabel();
        jLabelTeclaIgual = new javax.swing.JLabel();
        jLabelTeclaVirgula = new javax.swing.JLabel();
        jLabelTeclaZero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 26, 28));
        setMaximumSize(new java.awt.Dimension(270, 469));
        setMinimumSize(new java.awt.Dimension(270, 469));

        jPanel1.setBackground(new java.awt.Color(25, 26, 28));
        jPanel1.setForeground(new java.awt.Color(25, 26, 28));
        jPanel1.setAlignmentX(1.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(270, 469));

        labelTela.setAlignment(java.awt.Label.RIGHT);
        labelTela.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        labelTela.setForeground(new java.awt.Color(255, 255, 255));
        labelTela.setMaximumSize(new java.awt.Dimension(250, 128));
        labelTela.setMinimumSize(new java.awt.Dimension(250, 128));
        labelTela.setPreferredSize(new java.awt.Dimension(250, 128));
        labelTela.setText("0");

        jLabelTeclaDivisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/divisao.png"))); // NOI18N
        jLabelTeclaDivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaDivisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaDivisaoMouseClicked(evt);
            }
        });

        jLabelTeclaPorCentagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/%.png"))); // NOI18N
        jLabelTeclaPorCentagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaPorCentagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaPorCentagemMouseClicked(evt);
            }
        });

        jLabelTeclaMaisMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/+-.png"))); // NOI18N
        jLabelTeclaMaisMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaMaisMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaMaisMenosMouseClicked(evt);
            }
        });

        jLabelTeclaAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/AC.png"))); // NOI18N
        jLabelTeclaAC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaACMouseClicked(evt);
            }
        });

        jLabelTeclaVezes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/multiplicacao.png"))); // NOI18N
        jLabelTeclaVezes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaVezes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaVezesMouseClicked(evt);
            }
        });

        jLabelTeclaNove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/9.png"))); // NOI18N
        jLabelTeclaNove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaNove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaNoveMouseClicked(evt);
            }
        });

        jLabelTeclaOito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/8.png"))); // NOI18N
        jLabelTeclaOito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaOito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaOitoMouseClicked(evt);
            }
        });

        jLabelTeclaSete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/7.png"))); // NOI18N
        jLabelTeclaSete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaSete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaSeteMouseClicked(evt);
            }
        });

        jLabelTeclaMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/subtracao.png"))); // NOI18N
        jLabelTeclaMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaMenosMouseClicked(evt);
            }
        });

        jLabelTeclaSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/6.png"))); // NOI18N
        jLabelTeclaSeis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaSeisMouseClicked(evt);
            }
        });

        jLabelTeclaCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/5.png"))); // NOI18N
        jLabelTeclaCinco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaCincoMouseClicked(evt);
            }
        });

        jLabelTeclaQuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/4.png"))); // NOI18N
        jLabelTeclaQuatro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaQuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaQuatroMouseClicked(evt);
            }
        });

        jLabelTeclaMais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/adicao.png"))); // NOI18N
        jLabelTeclaMais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaMaisMouseClicked(evt);
            }
        });

        jLabelTeclaTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/3.png"))); // NOI18N
        jLabelTeclaTres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaTresMouseClicked(evt);
            }
        });

        jLabelTeclaDois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/2.png"))); // NOI18N
        jLabelTeclaDois.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaDois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaDoisMouseClicked(evt);
            }
        });

        jLabelTeclaUm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/1.png"))); // NOI18N
        jLabelTeclaUm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaUm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaUmMouseClicked(evt);
            }
        });

        jLabelTeclaIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/igual.png"))); // NOI18N
        jLabelTeclaIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaIgualMouseClicked(evt);
            }
        });

        jLabelTeclaVirgula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/,.png"))); // NOI18N
        jLabelTeclaVirgula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaVirgula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaVirgulaMouseClicked(evt);
            }
        });

        jLabelTeclaZero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pck_imagens/0.2.png"))); // NOI18N
        jLabelTeclaZero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTeclaZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTeclaZeroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTela, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTeclaQuatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTeclaCinco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTeclaSeis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTeclaMenos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTeclaAC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTeclaMaisMenos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTeclaPorCentagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTeclaDivisao))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTeclaSete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTeclaOito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTeclaNove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTeclaVezes)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelTeclaZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelTeclaUm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelTeclaDois)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelTeclaTres)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelTeclaMais))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelTeclaVirgula)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelTeclaIgual))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelTela, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTeclaPorCentagem)
                    .addComponent(jLabelTeclaMaisMenos)
                    .addComponent(jLabelTeclaAC)
                    .addComponent(jLabelTeclaDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTeclaNove)
                    .addComponent(jLabelTeclaOito)
                    .addComponent(jLabelTeclaSete)
                    .addComponent(jLabelTeclaVezes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTeclaSeis)
                    .addComponent(jLabelTeclaCinco)
                    .addComponent(jLabelTeclaQuatro)
                    .addComponent(jLabelTeclaMenos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTeclaTres)
                    .addComponent(jLabelTeclaDois)
                    .addComponent(jLabelTeclaUm)
                    .addComponent(jLabelTeclaMais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTeclaVirgula)
                    .addComponent(jLabelTeclaZero)
                    .addComponent(jLabelTeclaIgual))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTeclaUmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaUmMouseClicked
        digitar("1");
    }//GEN-LAST:event_jLabelTeclaUmMouseClicked

    private void jLabelTeclaACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaACMouseClicked
        zerar();
    }//GEN-LAST:event_jLabelTeclaACMouseClicked

    private void jLabelTeclaSeteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaSeteMouseClicked
        digitar("7");
    }//GEN-LAST:event_jLabelTeclaSeteMouseClicked

    private void jLabelTeclaOitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaOitoMouseClicked
        digitar("8");
    }//GEN-LAST:event_jLabelTeclaOitoMouseClicked

    private void jLabelTeclaNoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaNoveMouseClicked
        digitar("9");
    }//GEN-LAST:event_jLabelTeclaNoveMouseClicked

    private void jLabelTeclaQuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaQuatroMouseClicked
        digitar("4");
    }//GEN-LAST:event_jLabelTeclaQuatroMouseClicked

    private void jLabelTeclaCincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaCincoMouseClicked
        digitar("5");
    }//GEN-LAST:event_jLabelTeclaCincoMouseClicked

    private void jLabelTeclaSeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaSeisMouseClicked
        digitar("6");
    }//GEN-LAST:event_jLabelTeclaSeisMouseClicked

    private void jLabelTeclaDoisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaDoisMouseClicked
        digitar("2");
    }//GEN-LAST:event_jLabelTeclaDoisMouseClicked

    private void jLabelTeclaTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaTresMouseClicked
        digitar("3");
    }//GEN-LAST:event_jLabelTeclaTresMouseClicked

    private void jLabelTeclaZeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaZeroMouseClicked
        digitar("0");
    }//GEN-LAST:event_jLabelTeclaZeroMouseClicked

    private void jLabelTeclaVirgulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaVirgulaMouseClicked
        digitar(".");
    }//GEN-LAST:event_jLabelTeclaVirgulaMouseClicked

    private void jLabelTeclaPorCentagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaPorCentagemMouseClicked
        digitar("%");       
    }//GEN-LAST:event_jLabelTeclaPorCentagemMouseClicked

    private void jLabelTeclaIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaIgualMouseClicked
        calcular();
    }//GEN-LAST:event_jLabelTeclaIgualMouseClicked

    private void jLabelTeclaDivisaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaDivisaoMouseClicked
        operar(4);
    }//GEN-LAST:event_jLabelTeclaDivisaoMouseClicked

    private void jLabelTeclaVezesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaVezesMouseClicked
        operar(3);
    }//GEN-LAST:event_jLabelTeclaVezesMouseClicked

    private void jLabelTeclaMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaMenosMouseClicked
        operar(2);
    }//GEN-LAST:event_jLabelTeclaMenosMouseClicked

    private void jLabelTeclaMaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaMaisMouseClicked
        operar(1);
    }//GEN-LAST:event_jLabelTeclaMaisMouseClicked

    private void jLabelTeclaMaisMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTeclaMaisMenosMouseClicked
        String tela = labelTela.getText();
        
        try {
            double valor = Double.parseDouble(tela); 
            valor *= -1; 
            tela = Double.toString(valor); 
            labelTela.setText(tela);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de número inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jLabelTeclaMaisMenosMouseClicked

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
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTeclaAC;
    private javax.swing.JLabel jLabelTeclaCinco;
    private javax.swing.JLabel jLabelTeclaDivisao;
    private javax.swing.JLabel jLabelTeclaDois;
    private javax.swing.JLabel jLabelTeclaIgual;
    private javax.swing.JLabel jLabelTeclaMais;
    private javax.swing.JLabel jLabelTeclaMaisMenos;
    private javax.swing.JLabel jLabelTeclaMenos;
    private javax.swing.JLabel jLabelTeclaNove;
    private javax.swing.JLabel jLabelTeclaOito;
    private javax.swing.JLabel jLabelTeclaPorCentagem;
    private javax.swing.JLabel jLabelTeclaQuatro;
    private javax.swing.JLabel jLabelTeclaSeis;
    private javax.swing.JLabel jLabelTeclaSete;
    private javax.swing.JLabel jLabelTeclaTres;
    private javax.swing.JLabel jLabelTeclaUm;
    private javax.swing.JLabel jLabelTeclaVezes;
    private javax.swing.JLabel jLabelTeclaVirgula;
    private javax.swing.JLabel jLabelTeclaZero;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label labelTela;
    // End of variables declaration//GEN-END:variables
}

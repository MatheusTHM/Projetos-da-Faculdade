//Autor: Matheus Thommesani Marcelino Morais - ADS 2ºSemestre
package calculadora2;

import java.text.DecimalFormat;

public class UI_Calculadora extends javax.swing.JFrame {

    public UI_Calculadora() {
        initComponents();
    }
    
    //int ;
    Double[] historico;
    Double valor1, valor2, resultado, visor;
    String operacao = "", ultima_operacao = "", substituicao, substituicao2, simbolo;
    DecimalFormat f = new DecimalFormat("####0.00#######");
    DecimalFormat g = new DecimalFormat("0.#####");
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtVisor = new javax.swing.JTextField();
        btnPorcentagem = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnFracao = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnInverter = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        labelHistorico = new javax.swing.JLabel();

        jButton4.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        jPanel1.setForeground(new java.awt.Color(224, 224, 224));
        jPanel1.setToolTipText("");

        txtVisor.setBackground(new java.awt.Color(240, 240, 240));
        txtVisor.setFont(new java.awt.Font("Verdana", 0, 32)); // NOI18N
        txtVisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtVisor.setToolTipText("");
        txtVisor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        txtVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisorActionPerformed(evt);
            }
        });

        btnPorcentagem.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnPorcentagem.setText("%");
        btnPorcentagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnPorcentagem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });

        btnCE.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnCE.setText("CE");
        btnCE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnFracao.setText("⅟x");
        btnFracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnFracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFracaoActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn7.setMaximumSize(new java.awt.Dimension(71, 21));
        btn7.setMinimumSize(new java.awt.Dimension(71, 21));
        btn7.setPreferredSize(new java.awt.Dimension(71, 21));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnC.setText("C");
        btnC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnApagar.setText("⇽");
        btnApagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnApagar.setMaximumSize(new java.awt.Dimension(71, 21));
        btnApagar.setMinimumSize(new java.awt.Dimension(71, 21));
        btnApagar.setPreferredSize(new java.awt.Dimension(71, 21));
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnPotencia.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnPotencia.setText("x²");
        btnPotencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn8.setMaximumSize(new java.awt.Dimension(71, 21));
        btn8.setMinimumSize(new java.awt.Dimension(71, 21));
        btn8.setPreferredSize(new java.awt.Dimension(71, 21));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn5.setMaximumSize(new java.awt.Dimension(71, 21));
        btn5.setMinimumSize(new java.awt.Dimension(71, 21));
        btn5.setPreferredSize(new java.awt.Dimension(71, 21));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn2.setMaximumSize(new java.awt.Dimension(71, 21));
        btn2.setMinimumSize(new java.awt.Dimension(71, 21));
        btn2.setPreferredSize(new java.awt.Dimension(71, 21));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn0.setMaximumSize(new java.awt.Dimension(71, 21));
        btn0.setMinimumSize(new java.awt.Dimension(71, 21));
        btn0.setPreferredSize(new java.awt.Dimension(71, 21));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn4.setMaximumSize(new java.awt.Dimension(71, 21));
        btn4.setMinimumSize(new java.awt.Dimension(71, 21));
        btn4.setPreferredSize(new java.awt.Dimension(71, 21));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn1.setMaximumSize(new java.awt.Dimension(71, 21));
        btn1.setMinimumSize(new java.awt.Dimension(71, 21));
        btn1.setPreferredSize(new java.awt.Dimension(71, 21));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnInverter.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnInverter.setText("+/-");
        btnInverter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnInverter.setMaximumSize(new java.awt.Dimension(71, 21));
        btnInverter.setMinimumSize(new java.awt.Dimension(71, 21));
        btnInverter.setPreferredSize(new java.awt.Dimension(71, 21));
        btnInverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInverterActionPerformed(evt);
            }
        });

        btnRaiz.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnRaiz.setText("√x");
        btnRaiz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnVirgula.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnVirgula.setText(",");
        btnVirgula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnVirgula.setMaximumSize(new java.awt.Dimension(71, 21));
        btnVirgula.setMinimumSize(new java.awt.Dimension(71, 21));
        btnVirgula.setPreferredSize(new java.awt.Dimension(71, 21));
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });

        btnDivisao.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnDivisao.setText("/");
        btnDivisao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnDivisao.setMaximumSize(new java.awt.Dimension(71, 21));
        btnDivisao.setMinimumSize(new java.awt.Dimension(71, 21));
        btnDivisao.setPreferredSize(new java.awt.Dimension(71, 21));
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnMultiplicacao.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnMultiplicacao.setText("X");
        btnMultiplicacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnMultiplicacao.setMaximumSize(new java.awt.Dimension(71, 21));
        btnMultiplicacao.setMinimumSize(new java.awt.Dimension(71, 21));
        btnMultiplicacao.setPreferredSize(new java.awt.Dimension(71, 21));
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnSubtracao.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnSubtracao.setText("-");
        btnSubtracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnSubtracao.setMaximumSize(new java.awt.Dimension(71, 21));
        btnSubtracao.setMinimumSize(new java.awt.Dimension(71, 21));
        btnSubtracao.setPreferredSize(new java.awt.Dimension(71, 21));
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnAdicao.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnAdicao.setText("+");
        btnAdicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnAdicao.setMaximumSize(new java.awt.Dimension(71, 21));
        btnAdicao.setMinimumSize(new java.awt.Dimension(71, 21));
        btnAdicao.setPreferredSize(new java.awt.Dimension(71, 21));
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnIgual.setMaximumSize(new java.awt.Dimension(71, 21));
        btnIgual.setMinimumSize(new java.awt.Dimension(71, 21));
        btnIgual.setPreferredSize(new java.awt.Dimension(71, 21));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn9.setMaximumSize(new java.awt.Dimension(71, 21));
        btn9.setMinimumSize(new java.awt.Dimension(71, 21));
        btn9.setPreferredSize(new java.awt.Dimension(71, 21));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn6.setMaximumSize(new java.awt.Dimension(71, 21));
        btn6.setMinimumSize(new java.awt.Dimension(71, 21));
        btn6.setPreferredSize(new java.awt.Dimension(71, 21));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btn3.setMaximumSize(new java.awt.Dimension(71, 21));
        btn3.setMinimumSize(new java.awt.Dimension(71, 21));
        btn3.setPreferredSize(new java.awt.Dimension(71, 21));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        labelHistorico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFracao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInverter, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(213, 213, 213)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtVisor)
                            .addComponent(labelHistorico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnAdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnFracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnInverter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        txtVisor.setText("");
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
       if(!(txtVisor.getText().equals(""))){
            visor = Double.parseDouble(txtVisor.getText().replace(",","."));
            visor = visor * visor; 
            txtVisor.setText(f.format(visor));
            labelHistorico.setText("sqr("+txtVisor.getText().replace(",",".")+")");
            resultado = null;
       }
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
        txtVisor.setText(txtVisor.getText()+"8");
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"8");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
        txtVisor.setText(txtVisor.getText()+"5");
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"5");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
        txtVisor.setText(txtVisor.getText()+"2");
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText("2");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
        if(!(txtVisor.getText().equals("0"))){
            txtVisor.setText(txtVisor.getText()+"0");
        }
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"0");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        if(!(txtVisor.getText().equals(""))){
                if(operacao.equals("")){
                valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));

                if((txtVisor.getText().contains(",")) || (txtVisor.getText().contains("."))){
                    labelHistorico.setText(txtVisor.getText().replace(",",".")+" ÷ ");
                }else{
                    labelHistorico.setText((txtVisor.getText()+".0").replace(",",".")+" ÷ ");
                }

                operacao = "divisao";
                simbolo = " / ";
                txtVisor.setText("");
                resultado = null;
            }else{
                if(resultado == null){
                    labelHistorico.setText(valor1+" / ");
                }else{
                    labelHistorico.setText(resultado+" / ");
                    valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));
                    txtVisor.setText("");
                }

                simbolo = " / ";
                operacao = "divisao";
                resultado = null;
            }
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
       if(!(txtVisor.getText().equals(""))){
            if(operacao.equals("")){
             valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));

             if((txtVisor.getText().contains(",")) || (txtVisor.getText().contains("."))){
                 labelHistorico.setText(txtVisor.getText().replace(",",".")+" * ");
             }else{
                 labelHistorico.setText((txtVisor.getText()+".0").replace(",",".")+" * ");
             }

             operacao = "multiplicacao";
             simbolo = " * ";
             txtVisor.setText("");
             resultado = null;
         }else{
             if(resultado == null){
                 labelHistorico.setText(valor1+" * ");
             }else{
                 labelHistorico.setText(resultado+" * ");
                 valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));
                 txtVisor.setText("");
             }

             operacao = "multiplicacao";
             simbolo = " * ";
             resultado = null;
         }
       }
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        if(!(txtVisor.getText().equals(""))){
                if(operacao.equals("")){
                valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));

                if((txtVisor.getText().contains(",")) || (txtVisor.getText().contains("."))){
                    labelHistorico.setText(txtVisor.getText().replace(",",".")+" - ");
                }else{
                    labelHistorico.setText((txtVisor.getText()+".0").replace(",",".")+" - ");
                }

                operacao = "subtracao";
                simbolo = " - ";
                txtVisor.setText("");
                resultado = null;
            }else{
                if(resultado == null){
                    labelHistorico.setText(valor1+" - ");
                }else{
                    labelHistorico.setText(resultado+" - ");
                    valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));
                    txtVisor.setText("");
                }

                operacao = "subtracao";
                simbolo = " - ";
                resultado = null;
            }
        }
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        if(!(txtVisor.getText().equals(""))){
                if(operacao.equals("")){
                valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));

                if((txtVisor.getText().contains(",")) || (txtVisor.getText().contains("."))){
                    labelHistorico.setText(txtVisor.getText().replace(",",".")+" + ");
                }else{
                    labelHistorico.setText((txtVisor.getText()+".0").replace(",",".")+" + ");
                }

                operacao = "adicao";
                simbolo = " + ";
                txtVisor.setText("");
                resultado = null; 
            }else{
                if(resultado == null){
                    labelHistorico.setText(valor1+" + ");
                }else{
                    labelHistorico.setText(resultado+" + ");
                    valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));
                    txtVisor.setText("");
                }


                operacao = "adicao";
                simbolo = " + ";
                resultado = null;
            }
        }
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        if(resultado != null){
            
            substituicao = String.valueOf(valor1);
            valor1 = resultado;
               
            
            if(!(ultima_operacao.equals(""))){
                valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));
                labelHistorico.setText(String.valueOf(valor1)+simbolo+String.valueOf(valor2));
                operacao = ultima_operacao;
            }
            
            substituicao2 = String.valueOf(valor1);
            labelHistorico.setText(labelHistorico.getText().replaceFirst(substituicao,substituicao2));
            
        }else{
            if(txtVisor.getText().equals("")){
                valor2 = valor1;
            }else{
                valor2 = Double.parseDouble(txtVisor.getText().replace(",","."));
            }
            
            if(!(operacao.equals(""))){
                labelHistorico.setText(labelHistorico.getText()+valor2);
                labelHistorico.setText(labelHistorico.getText()+" = ");
            }else{
                valor1 = Double.parseDouble(txtVisor.getText().replace(",","."));
                labelHistorico.setText(valor1+" = ");
            }
        }
        if(!(operacao.equals(""))){
            
            switch(operacao){
                case "adicao":
                    resultado = valor1 + valor2;
                    break;
                case "subtracao":
                    resultado = valor1 - valor2;
                    break;
                case "multiplicacao":
                    resultado = valor1 * valor2;
                    break;
                case "divisao":
                    resultado = valor1 / valor2;
                    break;
            }
            
            ultima_operacao = "";
            txtVisor.setText(g.format(resultado));
        }
        
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
        txtVisor.setText(txtVisor.getText()+"1");
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"1");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        if (resultado != null && (ultima_operacao.equals(""))) {
            labelHistorico.setText("");
        }else if((!(operacao.equals(""))) && (!(txtVisor.getText().equals("")))){
            txtVisor.setText(txtVisor.getText().substring(0,txtVisor.getText().length() - 1));
        }else if((!(ultima_operacao.equals("")))){
            txtVisor.setText(txtVisor.getText().substring(0,txtVisor.getText().length() - 1));
        }else if ((!(txtVisor.getText().equals("")))){
            txtVisor.setText(txtVisor.getText().substring(0,txtVisor.getText().length() - 1));
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
       txtVisor.setText(txtVisor.getText()+"7");
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"7");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
        txtVisor.setText(txtVisor.getText()+"3");
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"3");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
        txtVisor.setText(txtVisor.getText()+"6");
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"6");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
        txtVisor.setText(txtVisor.getText()+"9");
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"9");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
        if(!(txtVisor.getText().equals(""))){
            visor = Double.parseDouble(txtVisor.getText().replace(",","."));
            visor = visor * 0.01; 
            txtVisor.setText(String.valueOf(visor));
            labelHistorico.setText(txtVisor.getText().replace(",","."));
            resultado = null;
        }
    }//GEN-LAST:event_btnPorcentagemActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtVisor.setText("");
        valor1 = 0.0;
        valor2 = 0.0;
        labelHistorico.setText("");
        resultado = null;
        ultima_operacao = "";
        operacao = "";
        simbolo = "";
    }//GEN-LAST:event_btnCActionPerformed

    private void btnFracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFracaoActionPerformed
        if(!(txtVisor.getText().equals(""))){
            visor = Double.parseDouble(txtVisor.getText().replace(",","."));
            labelHistorico.setText("1/("+txtVisor.getText().replace(",",".")+")");
            visor = 1 / visor; 
            txtVisor.setText(String.valueOf(visor));
            resultado = null;
        }
    }//GEN-LAST:event_btnFracaoActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        if(!(txtVisor.getText().equals(""))){
            visor = Double.parseDouble(txtVisor.getText().replace(",","."));
            labelHistorico.setText("√("+txtVisor.getText().replace(",",".")+")");
            visor = java.lang.Math.sqrt(visor); 
            txtVisor.setText(String.valueOf(visor));
            resultado = null;
        }
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(txtVisor.getText().equals("null")){
            txtVisor.setText("");
        }
        txtVisor.setText(txtVisor.getText()+"4");
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"4");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnInverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInverterActionPerformed
        if(!(txtVisor.getText().equals(""))){
            visor = Double.parseDouble(txtVisor.getText().replace(",","."));
            visor = visor * -1; 
            txtVisor.setText(String.valueOf(visor));
            labelHistorico.setText("negate("+labelHistorico.getText().replace(",",".")+")");
            resultado = null;
        }
    }//GEN-LAST:event_btnInverterActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed
        if((txtVisor.getText().equals("null")) || ((txtVisor.getText().equals("")))){
            txtVisor.setText("0,");
        }else if((txtVisor.getText().contains(",")) || (txtVisor.getText().contains("."))){    
        
        }else{
            txtVisor.setText(txtVisor.getText()+",");
        }
        if(resultado != null && !(operacao.equals(""))){
            txtVisor.setText("");
            txtVisor.setText(txtVisor.getText()+"0,");
            ultima_operacao = operacao;
            operacao = "";
            labelHistorico.setText("");
        }
    }//GEN-LAST:event_btnVirgulaActionPerformed

    private void txtVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVisorActionPerformed
                                

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
            java.util.logging.Logger.getLogger(UI_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //Autor: Matheus Thommesani Marcelino Morais - ADS 2ºSemestre
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnFracao;
    public javax.swing.JButton btnIgual;
    private javax.swing.JButton btnInverter;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelHistorico;
    private javax.swing.JTextField txtVisor;
    // End of variables declaration//GEN-END:variables
}

package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class gui {
    int minuto = 5, segundo = 0;
    String sMinuto, sSegundo;
    Boolean rodando = false;
    private JPanel mainPane;
    private JPanel pTimer;
    private JLabel lMinuto;
    private JLabel lSegundo;

    private JButton bTwoPoint;
    private JButton bThreePoint;
    private JButton bFourPoint;
    private JButton bFault;
    private JButton bAdvantage;
    private JButton bTotal;

    private JPanel pCompetidorUm;

    private JButton bTwoPoint2;
    private JButton bThreePoint2;
    private JButton bFourPoint2;
    private JButton bAdvantage2;
    private JButton bFault2;
    private JButton bTotal2;

    private JPanel pCompetidorDois;

    private JPanel pPontoUm;
    private JPanel pPontoDois;
    private JButton xButton;
    private JTextField tfCompetidorUm;
    private JTextField tfCompetidorDois;

    public gui() {
        mainPane.setBackground(Color.GRAY);

        /*Timer*/
        /*Controle da pontuação*/
        bTwoPoint.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    doisPontos();
                    total();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bTwoPoint.getText()) > 0) {
                    doisPontosMinus();
                    total();
                }
            }
        });
        bThreePoint.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    tresPontos();
                    total();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bThreePoint.getText()) > 0) {
                    tresPontosMinus();
                    total();
                }
            }
        });
        bFourPoint.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    quatroPontos();
                    total();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bFourPoint.getText()) > 0) {
                    quatroPontosMinus();
                    total();
                }
            }
        });
        bFault.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    fault();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bFault.getText()) > 0) {
                    faultMinus();
                }
            }
        });
        bAdvantage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    advantage();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bAdvantage.getText()) > 0) {
                    advantageMinus();
                }
            }
        });

        bTwoPoint2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    doisPontos2();
                    total2();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bTwoPoint2.getText()) > 0) {
                    doisPontosMinus2();
                    total2();
                }
            }
        });
        bThreePoint2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    tresPontos2();
                    total2();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bThreePoint2.getText()) > 0) {
                    tresPontosMinus2();
                    total2();
                }
            }
        });
        bFourPoint2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    quatroPontos2();
                    total2();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bFourPoint2.getText()) > 0) {
                    quatroPontosMinus2();
                    total2();
                }
            }
        });
        bFault2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    fault2();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bFault2.getText()) > 0) {
                    faultMinus2();
                }
            }
        });
        bAdvantage2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    advantage2();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.valueOf(bAdvantage2.getText()) > 0) {
                    advantageMinus2();
                }
            }
        });

        xButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.exit(0);
            }
        });
        pTimer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1 && rodando == false) {
                    super.mouseReleased(e);
                    iniciar();
                } else if (e.getButton() == MouseEvent.BUTTON3) {
                    super.mouseReleased(e);
                    rodando = false;
                    reset();
                } else if (e.getButton() == MouseEvent.BUTTON1 && rodando == true) {
                    rodando = false;
                }
            }
        });
    }

    /*Timer*/

    private void reset() {
        minuto = 5;
        segundo = 0;
        sMinuto = (minuto <= 9 ? "0" : "") + minuto;
        sSegundo = (segundo <= 9 ? "0" : "") + segundo;
        lMinuto.setText(sMinuto + ":");
        lSegundo.setText(sSegundo);

        bTwoPoint.setText("0");
        bThreePoint.setText("0");
        bFourPoint.setText("0");
        bFault.setText("0");
        bAdvantage.setText("0");
        bTotal.setText("0");

        bTwoPoint2.setText("0");
        bThreePoint2.setText("0");
        bFourPoint2.setText("0");
        bAdvantage2.setText("0");
        bFault2.setText("0");
        bTotal2.setText("0");

        tfCompetidorUm.setText("Competidor Um");
        tfCompetidorDois.setText("Competidor Dois");
    }

    private void iniciar() {
        rodando = true;
        Thread fazer = new Thread(() -> {
            for (; ; ) {
                if (rodando == true) {
                    try {
                        if (segundo == 0) {
                            segundo = 59;
                            minuto--;
                        }
                        atualizaLSegundo();
                        atualizaLMinuto();
                        segundo--;
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }
                } else {
                    break;
                }
            }
        });
        fazer.start();
    }

    private void atualizaLSegundo() {
        sSegundo = (segundo <= 9 ? "0" : "") + segundo;
        System.out.println(sSegundo);
        lSegundo.setText(sSegundo);
    }

    private void atualizaLMinuto() {
        sMinuto = (minuto <= 9 ? "0" : "") + minuto;
        System.out.println(sMinuto + ":");
        lMinuto.setText(sMinuto + ":");
    }

    /*    início da pontuação do primeiro competidor     */
    private void doisPontos() {
        int valor = Integer.parseInt(bTwoPoint.getText());
        int bTwoPointValue = valor + 2;
        bTwoPoint.setText(String.valueOf(bTwoPointValue));
    }

    private void doisPontosMinus() {
        int valor = Integer.parseInt(bTwoPoint.getText());
        int bTwoPointValue = valor - 2;
        bTwoPoint.setText(String.valueOf(bTwoPointValue));
    }

    private void tresPontos() {
        int valor = Integer.parseInt(bThreePoint.getText());
        int bThreePointValue = valor + 3;
        bThreePoint.setText(String.valueOf(bThreePointValue));
    }

    private void tresPontosMinus() {
        int valor = Integer.parseInt(bThreePoint.getText());
        int bThreePointValue = valor - 3;
        bThreePoint.setText(String.valueOf(bThreePointValue));
    }

    private void quatroPontos() {
        int valor = Integer.parseInt(bFourPoint.getText());
        int bFourPointValue = valor + 4;
        bFourPoint.setText(String.valueOf(bFourPointValue));
    }

    private void quatroPontosMinus() {
        int valor = Integer.parseInt(bFourPoint.getText());
        int bFourPointValue = valor - 4;
        bFourPoint.setText(String.valueOf(bFourPointValue));
    }

    private void fault() {
        int valor = Integer.parseInt(bFault.getText());
        int bFaultValue = valor + 1;
        bFault.setText(String.valueOf(bFaultValue));
    }

    private void faultMinus() {
        int valor = Integer.parseInt(bFault.getText());
        int bFaultValue = valor - 1;
        bFault.setText(String.valueOf(bFaultValue));
    }

    private void advantage() {
        int valor = Integer.parseInt(bAdvantage.getText());
        int bAdvantageValue = valor + 1;
        bAdvantage.setText(String.valueOf(bAdvantageValue));
    }

    private void advantageMinus() {
        int valor = Integer.parseInt(bAdvantage.getText());
        int bAdvantageValue = valor - 1;
        bAdvantage.setText(String.valueOf(bAdvantageValue));
    }

    private void total() {
        int queda = Integer.parseInt(bTwoPoint.getText());
        int passagem = Integer.parseInt(bThreePoint.getText());
        int montada = Integer.parseInt(bFourPoint.getText());
        int bTotalValue = queda + passagem + montada;
        bTotal.setText(String.valueOf(bTotalValue));
    }

    /*
    início da pontuação do segundo competidor
    */
    private void doisPontos2() {
        int valor = Integer.parseInt(bTwoPoint2.getText());
        int bTwoPointValue = valor + 2;
        bTwoPoint2.setText(String.valueOf(bTwoPointValue));
    }

    private void doisPontosMinus2() {
        int valor = Integer.parseInt(bTwoPoint2.getText());
        int bTwoPointValue = valor - 2;
        bTwoPoint2.setText(String.valueOf(bTwoPointValue));
    }

    private void tresPontos2() {
        int valor = Integer.parseInt(bThreePoint2.getText());
        int bThreePointValue = valor + 3;
        bThreePoint2.setText(String.valueOf(bThreePointValue));
    }

    private void tresPontosMinus2() {
        int valor = Integer.parseInt(bThreePoint2.getText());
        int bThreePointValue = valor - 3;
        bThreePoint2.setText(String.valueOf(bThreePointValue));
    }

    private void quatroPontos2() {
        int valor = Integer.parseInt(bFourPoint2.getText());
        int bFourPointValue = valor + 4;
        bFourPoint2.setText(String.valueOf(bFourPointValue));
    }

    private void quatroPontosMinus2() {
        int valor = Integer.parseInt(bFourPoint2.getText());
        int bFourPointValue = valor - 4;
        bFourPoint2.setText(String.valueOf(bFourPointValue));
    }

    private void fault2() {
        int valor = Integer.parseInt(bFault2.getText());
        int bFaultValue = valor + 1;
        bFault2.setText(String.valueOf(bFaultValue));
    }

    private void faultMinus2() {
        int valor = Integer.parseInt(bFault2.getText());
        int bFaultValue = valor - 1;
        bFault2.setText(String.valueOf(bFaultValue));
    }

    private void advantage2() {
        int valor = Integer.parseInt(bAdvantage2.getText());
        int bAdvantageValue = valor + 1;
        bAdvantage2.setText(String.valueOf(bAdvantageValue));
    }

    private void advantageMinus2() {
        int valor = Integer.parseInt(bAdvantage2.getText());
        int bAdvantageValue = valor - 1;
        bAdvantage2.setText(String.valueOf(bAdvantageValue));
    }

    private void total2() {
        int queda = Integer.parseInt(bTwoPoint2.getText());
        int passagem = Integer.parseInt(bThreePoint2.getText());
        int montada = Integer.parseInt(bFourPoint2.getText());
        int bTotalValue = queda + passagem + montada;
        bTotal2.setText(String.valueOf(bTotalValue));
    }

    public JPanel getMainPane() {
        return mainPane;
    }
}

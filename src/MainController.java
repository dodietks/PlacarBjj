import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainController {
    private JPanel mainPane;

    private JPanel pTimer;
    private JLabel lTimer;

    private JButton bTwoPoint;
    private JButton bThreePoint;
    private JButton bFourPoint;
    private JButton bFault;
    private JButton bAdvantage;
    private JButton bTotal;

    private JPanel pCompetidorUm;
    private JLabel lCompetidorUm;

    private JButton bTwoPoint2;
    private JButton bThreePoint2;
    private JButton bFourPoint2;
    private JButton bAdvantage2;
    private JButton bFault2;
    private JButton bTotal2;

    private JPanel pCompetidorDois;
    private JLabel lCompetidorDois;

    private JPanel pPontoUm;
    private JPanel pPontoDois;

    public MainController() {
        mainPane.setBackground(Color.GRAY);

        bTwoPoint.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    doisPontos();
                    total();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
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
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
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
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
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
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
                    faultMinus();
                }
            }
        });
        bAdvantage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    advantage();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
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
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
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
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
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
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
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
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
                    faultMinus2();
                }
            }
        });
        bAdvantage2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    advantage2();
                } else if (e.getButton() == MouseEvent.BUTTON3 && Integer.parseInt(bTwoPoint.getText()) > 0) {
                    advantageMinus2();
                }
            }
        });
    }

    /*
    início da pontuação do primeiro competidor
     */
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


/**
 * Implementação de exemplo que utiliza JOptionPane para construir um menu de opções com submenu.
 */
import javax.swing.JOptionPane;

public class Principal {

    /**
     * Submenu Triângulo.
     *
     */
    public static void menuTriangulo() {
        //Variáveis do problema, que são preenchidas e manipuladas pelo menu.
        double base = 0;
        double altura = 0;
        double area = 0;

        //Armazena opção lida
        int opcao = -1;
        while (opcao != 99) {
            //Realiza a leitura da opção
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t### Menu de Opções - Triângulo ###\n"
                    + " 1- Leitura dos dados\n"
                    + " 2- Impressão dos dados\n"
                    //Outras opções vão aqui
                    + " 3- Calcular área\n"
                    + "99- Voltar\n"
                    + "Digite a opção desejada:"));
            //Verifica a opção
            switch (opcao) {
                case 1: {
                    base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo:"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo:"));
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "O triângulo tem base: " + base + " e altura:" + altura);
                    break;
                }
                case 3: {
                    area = (base * altura) / 2.0;
                    JOptionPane.showMessageDialog(null, "A área do triângulo: " + area);
                    break;
                }
                //Opção de saída do programa
                case 99: {
                    System.out.println("Saindo do submenu - triângulo");
                    break;
                }
                //Opção inválida do menu
                default: {
                    System.out.println("Opção inválida!");
                    break;
                }
            }//Fim Swtich
        }//Fim While
    }//Fim MenuTriangulo

    /**
     * Submenu Retângulo.
     *
     */
    public static void menuRetangulo() {
        //Variáveis do problema, que são preenchidas e manipuladas pelo menu.
        double base = 0;
        double altura = 0;
        double area = 0;

        //Armazena opção lida
        int opcao = -1;
        while (opcao != 99) {
            //Realiza a leitura da opção
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t### Menu de Opções - Retângulo ###\n"
                    + " 1- Leitura dos dados\n"
                    + " 2- Impressão dos dados\n"
                    //Outras opções vão aqui
                    + " 3- Calcular área\n"
                    + "99- Voltar\n"
                    + "Digite a opção desejada:"));
            //Verifica a opção
            switch (opcao) {
                case 1: {
                    base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retângulo:"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retângulo:"));
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "O retângulo tem base: " + base + " e altura:" + altura);
                    break;
                }
                case 3: {
                    area = (base * altura);
                    JOptionPane.showMessageDialog(null, "A área do retângulo: " + area);
                    break;
                }
                //Opção de saída do programa
                case 99: {
                    System.out.println("Saindo do submenu - retângulo");
                    break;
                }
                //Opção inválida do menu
                default: {
                    System.out.println("Opção inválida!");
                    break;
                }
            }//Fim Swtich
        }//Fim While
    }//Fim MenuRetangulo

    public static void main(String[] args) {

        //Armazena opção lida
        int opcao = -1;
        while (opcao != 99) {
            //Realiza a leitura da opção
            opcao = Integer.parseInt(JOptionPane.showInputDialog("\t### Menu de Opções ###\n"
                    + " 1- Triângulo\n"
                    + " 2- Retângulo\n"
                    //Outras opções vão aqui                    
                    + "99- Sair\n"
                    + "Digite a opção desejada:"));
            //Verifica a opção
            switch (opcao) {
                case 1: {
                    menuTriangulo();
                    break;
                }
                case 2: {
                    menuRetangulo();
                    break;
                }
                //Outras opções vão aqui
                //Opção de saída do programa
                case 99: {
                    System.out.println("Saindo do programa - principal");
                    break;
                }
                //Opção inválida do menu
                default: {
                    System.out.println("Opção inválida!");
                    break;
                }
            }//Fim Switch
        }//Fim While
    }//Fim Main
}

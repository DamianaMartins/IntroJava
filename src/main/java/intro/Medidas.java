// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas


import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos  - Características

    // 3.2 - Métodos e funções
    public static void main(String[] args){
        // Condicional = Verifcar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   D E   O P Ç Õ E S");
        System.out.println("c - Calular Area Modo Curto");
        System.out.println("e - Calular Area Modo Extenso");
        System.out.println("i - If Simples ");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        // switch = selecionar o comportamento do programa conforme a escolhada pessoa ou do software

        //String opcao = "curto";

        switch (opcao){
            case "i":
            case "I":
                System.out.println( "Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "c":
            case "C":
                System.out.println( "Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "e":
            case "E":
                System.out.println( "Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println( "Você escolheu outro valor que não tem uma ação associada");
                break;
        }

    }

    public static void ifSimples(){
        // Condicional = Verifcar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        // else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de Areas Modo Curto");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de Areas Modo Extenso");

        // Cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; //Largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + resultado + "m²");
    }

}

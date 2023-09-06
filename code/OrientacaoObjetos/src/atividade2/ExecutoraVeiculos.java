package atividade2;

import java.util.Scanner;

public class ExecutoraVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha o tipo de veículo:");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Caminhão");
            System.out.println("4. Bicicleta");
            System.out.println("5. Sair");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                Carro carro = criarCarro(scanner);
                interagirComCarro(carro, scanner);
            } else if (escolha == 2) {
                Moto moto = criarMoto(scanner);
                interagirComMoto(moto, scanner);
            } else if (escolha == 3) {
                Caminhao caminhao = criarCaminhao(scanner);
                interagirComCaminhao(caminhao, scanner);
            } else if (escolha == 4) {
                Bicicleta bicicleta = criarBicicleta(scanner);
                interagirComBicicleta(bicicleta, scanner);
            } else if (escolha == 5) {
                System.out.println("Até logo!");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }


    private static Carro criarCarro(Scanner scanner) {
        System.out.print("Marca do carro: ");
        String marca = scanner.next();
        System.out.print("Modelo do carro: ");
        String modelo = scanner.next();
        System.out.print("Ano do carro: ");
        int ano = scanner.nextInt();
        System.out.print("Número de portas do carro: ");
        int numPortas = scanner.nextInt();
        return new Carro(marca, modelo, ano, numPortas);
    }

    private static void interagirComCarro(Carro carro, Scanner scanner) {
        while (true) {
            System.out.println("Escolha ação para o carro:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Colocar cinto");
            System.out.println("4. Fazer drift");
            System.out.println("5. Sair do carro");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                carro.acelerar();
            } else if (escolha == 2) {
                carro.frear();
            } else if (escolha == 3) {
                carro.colocarCinto();
            } else if (escolha == 4) {
                carro.fazerDrift();
            } else if (escolha == 5) {
                carro.sairDoCarro();
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    private static Moto criarMoto(Scanner scanner) {
        System.out.print("Marca da moto: ");
        String marca = scanner.next();
        System.out.print("Modelo da moto: ");
        String modelo = scanner.next();
        System.out.print("Ano da moto: ");
        int ano = scanner.nextInt();
        return new Moto(marca, modelo, ano);
    }

    private static void interagirComMoto(Moto moto, Scanner scanner) {
        while (true) {
            System.out.println("Escolha ação para a moto:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Colocar capacete");
            System.out.println("4. Empinar");
            System.out.println("5. Sair da moto");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                moto.acelerar();
            } else if (escolha == 2) {
                moto.frear();
            } else if (escolha == 3) {
                moto.colocarCapacete();
            } else if (escolha == 4) {
                if (moto.isCapaceteColocado()) {
                    moto.empinar();
                } else {
                    System.out.println("Coloque o capacete antes de empinar!");
                }
            } else if (escolha == 5) {
                moto.sairDaMoto();
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }


    private static Caminhao criarCaminhao(Scanner scanner) {
        System.out.print("Marca do caminhão: ");
        String marca = scanner.next();
        System.out.print("Modelo do caminhão: ");
        String modelo = scanner.next();
        System.out.print("Ano do caminhão: ");
        int ano = scanner.nextInt();
        System.out.print("O caminhão está carregado? (1 = sim | 2 = não): ");
        boolean carregado = validarRespostaCaminhao(scanner.nextInt());
        return new Caminhao(marca, modelo, ano, carregado);
    }

    private static void interagirComCaminhao(Caminhao caminhao, Scanner scanner) {
        while (true) {
            System.out.println("Escolha ação para o caminhão:");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Colocar cinto");
            System.out.println("4. Ver carregamento");
            System.out.println("5. Sair do caminhão");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                caminhao.acelerar();
            } else if (escolha == 2) {
                caminhao.frear();
            } else if (escolha == 3) {
                caminhao.colocarCinto();
            } else if (escolha == 4) {
                System.out.println("O caminhão " + (caminhao.isCarregado() ? "está carregado" : "não está carregado") + ".");
            } else if (escolha == 5) {
                caminhao.sairDoCaminhao();
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }



    private static boolean validarRespostaCaminhao(int resposta) {
        if (resposta == 1) {
            return true;
        } else if (resposta == 2) {
            return false;
        } else {
            System.out.println("Resposta inválida. Responda com 1 para sim ou 2 para não.");
            return validarRespostaCaminhao(resposta);
        }
    }

    private static void exibirEstadoCaminhao(Caminhao caminhao) {
        String estadoCarregado = caminhao.isCarregado() ? "está carregado" : "não está carregado";
        System.out.println("O caminhão " + estadoCarregado + ".");
    }

    private static Bicicleta criarBicicleta(Scanner scanner) {
        System.out.println("Digite a marca da bicicleta:");
        String marca = scanner.next();

        System.out.println("Digite o modelo da bicicleta:");
        String modelo = scanner.next();

        System.out.println("Digite o ano da bicicleta:");
        int ano = scanner.nextInt();

        return new Bicicleta(marca, modelo, ano);
    }

    private static void interagirComBicicleta(Bicicleta bicicleta, Scanner scanner) {
        while (true) {
            System.out.println("Escolha ação para a biciclera:");
            System.out.println("1. Pedalar");
            System.out.println("2. Colocar capacete");
            System.out.println("3. Ajustar marcha");
            System.out.println("4. Frear");
            System.out.println("5. Sair da biciclera");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                bicicleta.acelerar();
            } else if (escolha == 2) {
                bicicleta.colocarCapacete();
            } else if (escolha == 3) {
                System.out.println("Digite a nova marcha:");
                int novaMarcha = scanner.nextInt();
                bicicleta.ajustarMarcha(novaMarcha);
            } else if (escolha == 4) {
                bicicleta.frear();
            } else if (escolha == 5) {
                bicicleta.sairDaBicicleta();
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }


    private static void exibirInfoVeiculo(Veiculo veiculo) {
        System.out.println("Informações do veículo:");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());

        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;
            System.out.println("Número de portas: " + carro.getNumPortas());
        }

        veiculo.acelerar();
        veiculo.frear();
    }
}

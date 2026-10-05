import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println();
            System.out.println("===== LISTA DE HERANÇA E POLIMORFISMO =====");
            System.out.println(" 1 - Hierarquia de Veículos");
            System.out.println(" 2 - Funcionários e Salários");
            System.out.println(" 3 - Animais e Sons");
            System.out.println(" 4 - Sistema Bancário");
            System.out.println(" 5 - Personagens de um Jogo");
            System.out.println(" 6 - Sistema de Biblioteca");
            System.out.println(" 7 - Cadastro de Pessoas");
            System.out.println(" 8 - Lojinha de Produtos");
            System.out.println(" 9 - Calculadora de Áreas");
            System.out.println("10 - Pagamento de Funcionários");
            System.out.println("11 - Simulador de Transporte");
            System.out.println("12 - Instrumentos Musicais");
            System.out.println("13 - Gerenciamento de Tarefas");
            System.out.println("14 - Sistema de Notificações");
            System.out.println("15 - Jogo de Cartas");
            System.out.println("16 - Rodar TODOS");
            System.out.println(" 0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                opcao = -1;
                System.out.println("Digite um número válido!");
                continue;
            }

            if (opcao == 16) {
                for (int i = 1; i <= 15; i++) {
                    executar(i);
                }
            } else if (opcao != 0) {
                executar(opcao);
            }
        }
        System.out.println("Até mais!");
    }

    static void executar(int n) {
        System.out.println();
        System.out.println("---------- Exercício " + n + " ----------");
        switch (n) {
            case 1:  ex01(); break;
            case 2:  ex02(); break;
            case 3:  ex03(); break;
            case 4:  ex04(); break;
            case 5:  ex05(); break;
            case 6:  ex06(); break;
            case 7:  ex07(); break;
            case 8:  ex08(); break;
            case 9:  ex09(); break;
            case 10: ex10(); break;
            case 11: ex11(); break;
            case 12: ex12(); break;
            case 13: ex13(); break;
            case 14: ex14(); break;
            case 15: ex15(); break;
            default: System.out.println("Opção inválida!");
        }
    }



    static void ex01() {

        Veiculo[] veiculos = {
                new Carro("Fiat", "Uno", 2010, 4),
                new Moto("CG 160", "Honda", 2022, 160)
        };

        for (Veiculo v : veiculos) {
            v.exibirInfos();
            System.out.println();
        }
    }

    static void ex02() {
        FuncBase[] equipe = {
                new FuncBase("Carlos", 3000),
                new Gerente("Ana", 8000, 1500),
                new Dev("Gabriel", 5000, 500)
        };

        for (FuncBase f : equipe) {
            f.exibirInfo();
            System.out.println();
        }
    }

    static void ex03() {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex", 3));
        animais.add(new Gato("Mimi", 2));
        animais.add(new Passaro("Piupiu", 1));
        animais.add(new Peixe("Nemo", 1));

        for (Animal a : animais) {
            a.fazerSom();
        }
    }



    static void ex04() {
        ContaCorrente cc = new ContaCorrente(100, 200);
        ContaPoupanca cp = new ContaPoupanca(1000, 0.005);

        cc.depositar(50);
        System.out.println("Corrente: " + cc.getSaldo());

        cp.render();
        System.out.println("Poupança: " + cp.getSaldo());


        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);

        for (ContaBancaria c : contas) {
            c.sacar(500);
            System.out.println("Saldo depois: " + c.getSaldo());
        }
    }


    static void ex05() {
        Guerreiro g = new Guerreiro("Arthur", 100, 5);
        Mago m = new Mago("Merlin", 80, 30);

        int rodada = 1;

        while (g.estaVivo() && m.estaVivo()) {
            System.out.println("--- Rodada " + rodada + " ---");

            g.atacar(m);


            if (m.estaVivo()) {
                m.atacar(g);
            }

            System.out.println("Vida de " + g.nome + ": " + g.vida);
            System.out.println("Vida de " + m.nome + ": " + m.vida);
            rodada++;
        }

        if (g.estaVivo()) {
            System.out.println(g.nome + " venceu a batalha!");
        } else {
            System.out.println(m.nome + " venceu a batalha!");
        }
    }



    static void ex06() {
        LivroFisico lf = new LivroFisico("Dom Casmurro", "Machado de Assis", 1899, 256);
        Ebook eb = new Ebook("Java Básico", "Fulano de Tal", 2020, 4.5);

        lf.exibirInfo();
        System.out.println();
        eb.exibirInfo();
    }



    static void ex07() {
        Aluno a = new Aluno("Gabriel", 20, "2026001");
        Professor p = new Professor("Rodney", 45, "Programação em C");

        System.out.println("=== Aluno ===");
        a.exibirDados();
        System.out.println();
        System.out.println("=== Professor ===");
        p.exibirDados();
    }



    static void ex08() {
        Eletronico tv = new Eletronico("Smart TV 50\"", 2499.90, 12, "Bivolt");
        Alimento arroz = new Alimento("Arroz", 28.50, "10/12/2026", 5.0);

        tv.exibirDetalhes();
        System.out.println();
        arroz.exibirDetalhes();
    }



    static void ex09() {

        Forma[] formas = {
                new Circulo(3),
                new Retangulo(4, 5),
                new Circulo(1.5)
        };

        for (Forma f : formas) {
            System.out.printf("Área: %.2f%n", f.calcularArea());
        }
    }



    static void ex10() {
        FuncionarioPagamento[] equipe = {
                new FuncionarioPagamento("Carlos", 3000),
                new GerentePagamento("Ana", 8000),
                new DesenvolvedorPagamento("Gabriel", 5000)
        };

        for (FuncionarioPagamento f : equipe) {
            System.out.printf("%s recebe R$ %.2f%n", f.nome, f.calcularPagamento());
        }
    }



    static void ex11() {
        Transporte[] transportes = { new CarroTransporte(), new Bicicleta(), new Aviao() };

        for (Transporte t : transportes) {
            t.mover();
        }
    }



    static void ex12() {
        InstrumentoMusical[] instrumentos = {
                new Violao(),
                new Piano(),
                new InstrumentoMusical()
        };

        for (InstrumentoMusical i : instrumentos) {
            i.tocar();
        }
    }


    static void ex13() {
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(new TarefaEmail());
        tarefas.add(new TarefaBackup());
        tarefas.add(new Tarefa());

        for (Tarefa t : tarefas) {
            t.executar();
        }
    }


    static void ex14() {
        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email("gabriel@email.com", "Sua prova foi remarcada."));
        notificacoes.add(new SMS("(44) 99999-0000", "Seu código de verificação é 1234."));
        notificacoes.add(new Email("ana@email.com", "Trabalho entregue com sucesso."));

        for (Notificacao n : notificacoes) {
            n.enviar();
        }
    }



    static void ex15() {
        List<Carta> baralho = new ArrayList<>();
        baralho.add(new CartaAtaque("Espada Flamejante", 15));
        baralho.add(new CartaAtaque("Flecha Certeira", 8));
        baralho.add(new CartaAtaque("Golpe Brutal", 20));
        baralho.add(new CartaDefesa("Escudo de Ferro", 10));
        baralho.add(new CartaDefesa("Barreira Mágica", 14));
        baralho.add(new CartaDefesa("Armadura Pesada", 6));

        Collections.shuffle(baralho);

        System.out.println("Começando a partida!\n");
        int jogada = 1;
        for (Carta c : baralho) {
            System.out.print("Jogada " + jogada + " -> ");
            c.jogar();
            jogada++;
        }
    }
}
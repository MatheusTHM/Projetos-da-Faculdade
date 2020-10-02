//AC2 (Avaliação Continuada 2) - Fazer um "jogo" utilizando Java
package ac2;
import java.util.Scanner;

public class AC2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Insira o nome do seu personagem: ");                                                              
        String nome = ler.next();
        int vida = 100;
        int mana = 100;
        int[] posicao = new int[2];                                                                                         //Posição inicial do seu personagem.
        posicao[0] = (int) (Math.random()*10);                                                                              //Posição definida randomicamente
        posicao[1] = (int) (Math.random()*10);
        int[] fim = new int[2];                                                                                             //Posição do fim do jogo, também randomicamente
        fim[0] = (int) (Math.random()*10);
        fim[1] = (int) (Math.random()*10);
        int potencia_soco = 1;                                                                                              //variável usada para batalhas, para adicionar uma sensação de evolução
        int vital = 0;
        int acaso = 0;
        int fugir = 0;
        int decisao = 0;                                                                                                        //variável de escolha usada para o jogador poder escolher o que fazer ao encontrar um inimigo
        int luta;                                                                                                           // variável de escolha usada em batalha
        boolean inimigo = false;                                                                                            // inicializando o inimigo, inicial falso 
        boolean movido = false;                                                                                            // inicializando o inimigo, inicial falso 
        boolean decidido = false;
        boolean gg = false;
        System.out.println("Bem vindo ao jogo, "+nome+".\nTente chegar ao fim sem perder toda sua vida.");
        System.out.println("Use W,A,S,D para se mover.");
        System.out.println("Caso queira saber a posição do fim do jogo digite H.");
        System.out.println("Você nasceu na posição "+posicao[0]+","+posicao[1]+", o mapa vai até 10,10. Boa sorte!");
        while(vida > 0 && gg != true){
           while(movido == false){
            String movimento;
            System.out.println("-----------------------------------");                                                       //criando um desenho no output utilizando caracteres do teclado, ainda que confunda um pouco a programação, melhora um pouco o log para o jogador.
            System.out.print("Movimentação: ");
            movimento = ler.next();
            System.out.println("-----------------------------------");
            if(movimento.equals("h") || movimento.equals("H")){                                                              //if separado da movimentação caso o usuário queira a ajuda para não perder a ação
                System.out.println("*******************************************");
                System.out.println("O fim do jogo está na posição: "+fim[0]+","+fim[1]);
                System.out.println("Você está na posição "+posicao[0]+","+posicao[1]+".");
                System.out.println("*******************************************");
                System.out.println("-----------------------------------");
                System.out.println("Escolha uma direção para se mover.");                                                    
                System.out.print("Movimentação: ");
                movimento = ler.next();                                                                                      // resetando a variável para ela poder ser utilizada
                System.out.println("-----------------------------------");
            }




            if(movimento.equals("w") || movimento.equals("W")){                                                             // if de movimentação
                if(posicao[0] + 1 <= 10){
                    posicao[0]++;
                    movido = true;
                }else{
                    System.out.println("Limite do mapa!\nEscolha outra direção.");
                    System.out.println("Você está na posição "+posicao[0]+","+posicao[1]+".");
                }
            }else if(movimento.equals("s") || movimento.equals("S")){
                if(posicao[0] - 1 >= 0){
                    posicao[0]--;
                    movido = true;
                }else{
                    System.out.println("Limite do mapa!\nEscolha outra direção.");
                    System.out.println("Você está na posição "+posicao[0]+","+posicao[1]+".");
                }
            }else if(movimento.equals("a") || movimento.equals("A")){
                if(posicao[1] - 1 >= 0){
                    posicao[1]--;
                    movido = true;
                }else{
                    System.out.println("Limite do mapa!\nEscolha outra direção.");
                    System.out.println("Você está na posição "+posicao[0]+","+posicao[1]+".");
                }
            }else if(movimento.equals("d") || movimento.equals("D")){
                if(posicao[1] + 1 <= 10){
                    posicao[1]++;
                    movido = true;
                }else{
                    System.out.println("Limite do mapa!\nEscolha outra direção.");
                    System.out.println("Você está na posição "+posicao[0]+","+posicao[1]+".");
                }
            }
           }
           movido = false;
           if(posicao[0] == fim[0] && posicao[1] == fim[1]){                                                                // check para saber se o jogo terminou
               System.out.println("*************************************");
               System.out.println("*********Você chegou ao fim.*********\n**************Parabéns!**************");
               System.out.println("*************************************");
               gg = true;
               break;
           }
           System.out.println("Você está na posição "+posicao[0]+","+posicao[1]);                                            //lembrar o jogador de sua posição atual
           int rng = ((int) (Math.random()*10) + 1);                                                                        //rng para encontrar um inimigo 50/50
           if(rng < 6 || inimigo == true){
               System.out.println("**************************");
               System.out.println("Você encontrou um inimigo!");
               System.out.println("**************************");
               inimigo = true;
               int vida_inimigo = ((int) (Math.random()*100) + 1);                                                          //vida do inimigo também aleatória
               while(inimigo == true){
                   if(vida <= 0){                                                                                           //check de vida
                                System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                                System.out.println("Você morreu em batalha. Tente novamente.");
                                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                                break;
                            }
                   System.out.println("HP: "+vida);
                   System.out.println("MP: "+mana);
                   System.out.println("Vida do Inimigo: "+vida_inimigo);
                   while(decidido == false){
                        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
                        System.out.println("Você pode tentar lutar ou fugir.\nDigite 1 para lutar, ou 2 para tentar fugir.");
                        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
                        System.out.print("Sua decisão: ");
                        decisao = ler.nextInt();
                        if(decisao == 1 || decisao == 2){
                            decidido = true;
                        }
                    }
                    switch(decisao){                                                                                        //switch de decisão
                        case 2:
                            rng = ((int) (Math.random()*10) + 1);                                                           //fugir com rng
                             if(rng < 6){
                                 System.out.println("Você não consegiu fugir.");
                                 vida -= 10;
                                 System.out.println("Você foi atacado enquanto tentava fugir.");
                                 decidido = false;
                             }else{
                                 System.out.println("Você conseguiu fugir");
                                 System.out.println("Você volta a sua jornada.");
                                 inimigo = false;
                                 decidido = false;
                             }
                             break;
                        case 1:
                            System.out.println(":::::::::::::::::::::::::::::::");
                            System.out.println("Você possui as seguintes opções de ataque:\n:::1-Soco:::::\n:::2-Espada:::\n:::3-Magia::::\n:::4-Sorte::::\n:::0-Fugir::::");
                            System.out.print("Escolha: ");
                            luta = ler.nextInt();
                            switch(luta){
                                case 1:
                                    rng = ((int) (Math.random()*10) + potencia_soco);
                                    if(rng >= 9){
                                        vida_inimigo -= 70;
                                        System.out.println("Seu soco atingiu um ponto vital.");
                                        vital++;
                                    }else{
                                       vida_inimigo -= 10;
                                        System.out.println("Você deu um soco normal.");
                                        System.out.println("Seus socos aumentaram de potência.");
                                        potencia_soco += 0.3;
                                    }
                                    break;
                                case 2:
                                    vida_inimigo -= 30;
                                    System.out.println("Você cortou seu inimigo com sua espada.");
                                    break;
                                case 3:
                                    if(mana >= 20){
                                        vida_inimigo -= 70;
                                        mana -=20;
                                        System.out.println("Você gastou sua preciosa mana para causar muito dano a seu inimigo.");
                                    }else{
                                        System.out.println("Você não tem mana suficiente, você perdeu seu turno usando essa magia.");
                                    }
                                    break;
                                case 4:
                                    int sorte = ((int) (Math.random()*10) + 1);
                                    if(sorte == 10){
                                        inimigo = false;
                                        System.out.println("*****************************");
                                        System.out.println("Seu inimigo morreu por acaso.");
                                        System.out.println("*****************************");
                                        System.out.println("Você volta a sua jornada.");
                                        acaso++;
                                    }else{
                                        System.out.println("Nada aconteceu.");
                                    }
                                    break;
                                case 0:
                                    rng = ((int) (Math.random()*10) + 1);                                                           //fugir com rng
                                    if(rng < 6){
                                        System.out.println("Você não consegiu fugir.");
                                        System.out.println("Você foi atacado enquanto tentava fugir.");
                                        decisao = 0;
                                        decidido = false;
                                    }else{
                                        System.out.println("Você conseguiu fugir!");
                                        System.out.println("Você volta a sua jornada.");
                                        decisao = 0;
                                        decidido = false;
                                        inimigo = false;
                                        fugir++;
                                        break;
                                    }
                                    
                                    break;
                            }
                            if(vida <= 0){
                                System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                                System.out.println("Você morreu em batalha. Tente novamente.");
                                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                                break;
                            }
                            if(vida_inimigo < 0){
                                inimigo = false;
                                decisao = 0;
                                decidido = false;
                                System.out.println("************************");
                                System.out.println("Você matou seu inimigo.");
                                System.out.println("************************");
                                System.out.println("Você volta a sua jornada.");
                            }else if(vital > 0){
                                System.out.println("Por ter sido atacado em um ponto vital seu inimigo não conseguiu te acertar.");
                                vital--;
                            }else if(acaso > 0){
                                acaso--;
                            }else if(fugir > 0){
                                fugir--;
                            }else{
                                vida -= 10;
                                System.out.println("Você foi atacado.");
                            }
                            
                            break;
                     }
               }
            }
        }
        
    }
    
}
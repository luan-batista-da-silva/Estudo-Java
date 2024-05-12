/* 
    PUBLIC -> Significa que o escopo desse objeto é que ele é público para qualquer
                um tendo acesso a todos seus métodos
    PRIVATE -> significa ao contrátrio que não terá esse mesmo acesso, ao não ser que
                esse seja o próprio objeto

    Class -> É uma representaçaõ do OBJETO, ou seja, todos os conteúdos que fazem parte deses objeto,
                e tudo aquilo que o pertence, como os Métodos e os Atributos.
              É possível que se crie mais de uma objeto da MESMA classe, de modo que eles sejam objetos
                INDEPENDENTES, de modo que eles sejam dessa mesma classe

    MÉTODOS GET -> São usados para obter valores de uma determinada classe

    MÉTODOS SET -> São usados para atribuir valores de uma determinada classe
*/

public class Player {
    public int num = 0;
        // Só é possível acessar o num pois ele é public
    
    private int life = 0;
        // Aqui como é private só é possível acessar dentro do prório objeto

    private final int MAXLIFE = 100;

    public Player(int num) {
        this.num = num;
            // O operador THIS faz uma referência para o parâmetro da própria classe, que está dentro dela mesma
        System.out.printf("JOGADOR NÚMERO %d CRIADO!\n", num);
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        if (this.life > MAXLIFE) {
            this.life = MAXLIFE;
        }
        else if (this.life < 0) {
            this.life = 0;
        }
        else {
            this.life = life;
        }
    }

    public void addLife() {
        if (this.life < MAXLIFE) {
            
        }
    }

    public int getNum() {
        return this.num;
    }
}

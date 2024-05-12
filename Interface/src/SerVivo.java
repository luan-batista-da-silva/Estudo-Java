public interface SerVivo {
    /*
        Aqui todas as classes que implementarem essa interface são OBRIGADAS a terem os mesmos
            métodos que a interface tem.
    */

    public boolean vivo = true; // Não se pode colocar private ou protected, apenas public static ou final


    public void mover();
    public void comer(int massa);
    public void info();
}

package appaula01;

public class AppAula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instanciar = criar uma conta
        Conta c1 = new Conta();
        c1.numero = 1;
        c1.saldo = 0f;
        c1.titular = "Jeff";
        
        Conta c2 = new Conta();
        c2.numero = 2;
        c2.saldo = 0f;
        c2.titular = "Ana";
        
        relatorio(c2);
        relatorio(c1);
        
        c1.depositar(1000f);
        c2.depositar(5000f);
        
        relatorio(c2);
        relatorio(c1);
        
    }

    private static void relatorio(Conta c2) {
        System.out.println("Dados da conta");
        System.out.println("Número: "+c2.numero);
        System.out.println("Titular: "+c2.titular);
        System.out.println("Saldo: "+c2.saldo);
        
    }
    
}


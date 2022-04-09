public class Emprestimo{
    String nomeUsuario; 
    int idade; 
    double valorEmprestimo; 
    double percentualJurosMes;
    int mesesParaPagar;


    public  imprimir(){
        System.out.println("Nome do usuario " + nomeUsuario);
        System.out.println("Idade do usuario " + idade);
        System.out.println("Valor do emprestio " + valorEmprestimo);
        System.out.println("Percentual de juros ao mes " + percentualJurosMes);
        System.out.println("Mes para pagar  " + mesesParaPagar);
    }
}

package Ted1;

import Ted1.Atividade1.Atv;

public class main {
    Produto pPro = new Produto("123","mt bom",100,80,true);
    Produto pNaoPro = new Produto("123","mt bom",100,70,false);
    Vendedor v = new Vendedor("igor","V01","Logo ali");
    Venda venda = new Venda(pNaoPro,v,0.1,2,400);

    public static void main(String[] args) {
        Atv.salário();
    }
}

package aula05.liskov.exemplo2.parte2;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (OperacoesPadroesEmConta conta : contasDoBanco()) {
        	
            conta.deposita(100);
            System.out.println("Novo Saldo:" );
            System.out.println(conta.getSaldo());
        }
    }

    private static List<OperacoesPadroesEmConta> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150),
                contaUniversitaria(200));
    }

    private static OperacoesPadroesEmConta contaUniversitaria(double amount) {
        OperacoesPadroesEmConta c = new ContaUniversitaria();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }

}


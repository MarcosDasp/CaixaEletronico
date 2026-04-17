public class CaixaEletronico {

    private Logger logger;

    public CaixaEletronico(Logger logger) {
        this.logger = logger;
    }

    public String sacar(int valor) {
        if (valor % 10 != 0) {
            logger.log("Valor inválido: " + valor);
            throw new IllegalArgumentException("Valor inválido");
        }

        int[] notas = {100, 50, 20, 10};
        int restante = valor;

        StringBuilder resultado = new StringBuilder();

        for (int nota : notas) {
            int quantidade = restante / nota;
            if (quantidade > 0) {
                resultado.append(quantidade)
                         .append("x")
                         .append(nota)
                         .append(" ");
                restante = restante % nota;
            }
        }

        logger.log("Saque realizado: " + resultado.toString());

        return resultado.toString().trim();
    }
}
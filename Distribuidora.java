public class Distribuidora {
    public static void main(String[] args) {
        // Valores de faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Valor total mensal
        double total = sp + rj + mg + es + outros;

        // Percentual de representação de cada estado
        double spPerc = sp / total * 100;
        double rjPerc = rj / total * 100;
        double mgPerc = mg / total * 100;
        double esPerc = es / total * 100;
        double outrosPerc = outros / total * 100;

        // Imprime os resultados
        System.out.println("Percentual de representação de cada estado:");
        System.out.println("SP: " + String.format("%.2f", spPerc) + "%");
        System.out.println("RJ: " + String.format("%.2f", rjPerc) + "%");
        System.out.println("MG: " + String.format("%.2f", mgPerc) + "%");
        System.out.println("ES: " + String.format("%.2f", esPerc) + "%");
        System.out.println("Outros: " + String.format("%.2f", outrosPerc) + "%");
    }
}

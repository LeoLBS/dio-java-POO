public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro b: EstadoBrasileiro.values()){
            System.out.println(b.getSigla() + " - " + b.getNome());
        }

        System.out.println("--------------------");

        EstadoBrasileiro estados = EstadoBrasileiro.PARANA;  //Podendo mudar para o de SAO_PAULO

        System.out.println(estados.getSigla());
        System.out.println(estados.getNome());
        System.out.println(estados.getNomeMaiusculo());
        System.out.println(estados.getCodigoIbge());
    }
}

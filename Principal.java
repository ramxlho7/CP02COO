public class Principal {
    public static void main(String[] args) {
        try {
            Caminhao caminhao = new Caminhao("ABC1234", 500.0, 4);
            Moto moto = new Moto("XYZ9876", 50.0, true);
            
            Pacote pacote1 = new Pacote("BR999", 10.5, "Pendente");
            Pacote pacote2 = new Pacote("BR888", 2.0, "Pronto para envio");

            System.out.println("--- Iniciando Entregas do FiapDelivery ---");

            Rota rota1 = new Rota(pacote1, caminhao);
            rota1.iniciarRota();

            Rota rota2 = new Rota(pacote2, moto);
            rota2.iniciarRota();

            System.out.println("\n--- Testando a validação de segurança ---");
            Caminhao caminhaoErro = new Caminhao("ERR0000", -500.0, 2);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro bloqueado pelo sistema: " + e.getMessage());
        }
    }
}

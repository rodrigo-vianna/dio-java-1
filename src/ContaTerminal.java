public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia = "0000-0";
        String nome = "";
        double saldo = 0.0;

        System.out.println("Digite seu nome: ");
        nome = System.console().readLine();

        System.out.println("Digite o número da conta: ");
        numero = Integer.parseInt(System.console().readLine());

        System.out.println("Digite a agência: ");
        agencia = System.console().readLine();

        System.out.println("Digite o saldo: ");
        saldo = Double.parseDouble(System.console().readLine());

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

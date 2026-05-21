class Carro {
    public String modelo;
    public String marca;
    public int ano;
    public double valor;

    // Construtor
    public Carro(String modelo, String marca, int ano, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }


    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano + "Valor: " + valor);
    }

    public double getValor() {
        return valor;
    }

    public static double somaValores(Carro[] carros) {
        double soma = 0;
        for (Carro c : carros) {
            soma += c.getValor();

        }
        return soma;
    }
}
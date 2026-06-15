public class Main { public static void main(String[] args) {

    Festa festa = new Festa();

    festa.setTema("Super Heróis");
    festa.setLocal("Buffet Alegria");
    festa.setConvidados(80);
    festa.setData("10/12/2026");
    festa.setValor(3500.00);

    System.out.println("Tema: " + festa.getTema());
    System.out.println("Local: " + festa.getLocal());
    System.out.println("Convidados: " + festa.getConvidados());
    System.out.println("Data: " + festa.getData());
    System.out.println("Valor: R$ " + festa.getValor());
}
}


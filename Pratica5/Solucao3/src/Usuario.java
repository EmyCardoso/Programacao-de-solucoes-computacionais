
public class Usuario {

	public static void main(String[] args) {
		
	Usuario	condicionadorDeAr = new Usuario();
        condicionadorDeAr.getTermostato().setTemperatura(16);

        if (condicionadorDeAr.getLigar()){
            System.out.println("Temperatura: " + condicionadorDeAr.getTermostato().getTemperatura() + "°");
            condicionadorDeAr.AumentarTemperatura();
            condicionadorDeAr.AumentarTemperatura();
            condicionadorDeAr.AumentarTemperatura();

            System.out.println("Temperatura atual: " + condicionadorDeAr.getTermostato().getTemperatura() + "°");

   
}
	}

}

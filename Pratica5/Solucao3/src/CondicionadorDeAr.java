
public class CondicionadorDeAr {

	private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr(){
        this.termostato = new Termostato();
        this.ligado = false;
    }

    public Termostato getTermostato(){
        return termostato;
    }

    public boolean getLigar(){
        if(ligado == false)
        {
            ligado = true;
        }

        return ligado;
    }

    public boolean getDesligar(){
        if(ligado == true)
        {
            ligado = false;
        }

        return ligado;
    }

    public void AumentarTemperatura(){

        int limite = 28;
        int temp = getTermostato().getTemperatura();

        if (getLigar())
        {
            getTermostato().setTemperatura(temp + 1);
        }
    }

    public void ReduzirTemperatura(){
        
        int limite = 15;
        int temp = getTermostato().getTemperatura();

        if (getLigar())
        {
            getTermostato().setTemperatura(temp - 1);
        }
    }

    public int getImprimirTemperatura(){
        return termostato.getTemperatura();
    }
}


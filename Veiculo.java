public class Veiculo{
    private String MarcaVeiculo;
    private int ano;
    private String modelo;
    

    public void setMarcaVeiculo(String MarcaVeiculo){
        this.MarcaVeiculo=MarcaVeiculo;
    }

    public String getMarcaVeiculo(){
        return this.MarcaVeiculo;
    }

    public void setAno(int Ano){
        this.Ano=Ano;
    }

    public int getAno(){
        return this.Ano;
    }

    public void setModelo(String Modelo){
        this.Modelo=Modelo;
    }

    public String getModelo(){
        return this.Modelo;
    }

    public imprimirVeiculo(){
        System.out.println("Ano: "+this.Ano);
        System.out.println("Modelo: "+this.Modelo);
        System.out.println("Marca Do Veiculo: "+this.MarcaVeiculo);
    }

}

/*https://www.starwars.com/databank/clone-troopers*/
public class CloneTroopers {
    private String nome;
    private String afiliacoes;
    private float altura;
    private String veiculo;
    private String arma;
    private String ferramenta;



    public CloneTroopers(String nome, String afiliacoes, float altura, String veiculo, String arma, String ferramenta) {
        this.nome = nome;
        this.afiliacoes = afiliacoes;
        this.altura = altura;
        this.veiculo = veiculo;
        this.arma = arma;
        this.ferramenta = ferramenta;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAfiliacoes() {
        return afiliacoes;
    }

    public void setAfiliacoes(String afiliacoes) {
        this.afiliacoes = afiliacoes;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }

    @Override
    public CloneTroopers clone() throws CloneNotSupportedException {
        CloneTroopers troopersClone = (CloneTroopers) super.clone();
        return troopersClone;
    }

    @Override
    public String toString() {
        return "CloneTroopers{" +
                "nome='" + nome + '\'' +
                ", afiliacoes='" + afiliacoes + '\'' +
                ", altura=" + altura +
                ", veiculo='" + veiculo + '\'' +
                ", arma='" + arma + '\'' +
                ", ferramenta='" + ferramenta + '\'' +
                '}';
    }

}

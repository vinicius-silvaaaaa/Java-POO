public class Eevee {
    protected String nome;
    protected String tipo;
    protected double altura, HP;
    protected int peso;
  

    public Eevee(String nome, String tipo, double altura, double HP, int peso){
        this.nome=nome;
        this.tipo=tipo;
        this.altura=altura;
        this.HP=HP;
        this.peso=peso;
    }

    public String ataque(){
        return "Ataque rápido";
    }

    public String defesa(){
        return "Desvio";
    }

    public String especial(){
        return "Tri-ataque";
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double hP) {
        HP = hP;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void imprimir(){
        System.out.println(ataque());
        System.out.println(defesa());
        System.out.println(especial());
        System.out.println("Tipo:"+tipo+" "+"Altura:"+altura+" "+"HP:"+HP+" "+"Peso:"+peso);
        System.out.println("");
    }
}

public class Flareon  extends Eevee{

    private String nome;
    private String tipo;
    private double altura, HP;
    private int peso;
  

    public Flareon (String nome, String tipo, double altura, double HP, int peso){
            super(nome, tipo, altura , HP, peso);
            this.nome=nome;
            this.tipo=tipo;
            this.altura=altura;
            this.HP=HP;
            this.peso=peso;
        }

        @Override
        public String ataque(){
            return "Ataque - Ember ";
        }
        @Override
        public String defesa(){
            return "Defesa - Smog";
        }
        @Override
        public String especial(){
            return "Especial -  Flamethrower";
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
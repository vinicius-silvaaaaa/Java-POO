public class Pokedex {
    public static void main(String[] args) throws Exception {

        Eevee e = new Eevee("Eevee", "Normal", 0.3, 6.5, 55);
        Jolteon j = new Jolteon("Jolteon","Elétrico",0.8,65,24);
        Vaporeon v = new Vaporeon("Vaporeon","água",1.0,130,29);
        Espeon es = new Espeon("Espeon","Psíquico",0.9,65,26);
        Unbreon un = new Unbreon("Unbreon","Noturno",1,95,27);
        Leafeon lea = new Leafeon("Leafon","PLanta",1,65,25);
        Glaceon  gle = new Glaceon ("Glaceon ","Gelo",0.8,65,25);
        Flareon  f = new Flareon ("Flareon ","Fogo",0.9,65,25);
        Sylveon  fa= new Sylveon ("Sylveon ","Fogo",0.9,65,25);

        System.out.println("Nome:"+e.getNome());
        System.out.println();
        e.imprimir();

        System.out.println();
        System.out.println("Nome:"+j.getNome());
        System.out.println();
        j.imprimir();
        
        System.out.println("Nome:"+f.getNome());
        System.out.println();
        f.imprimir();
        
        System.out.println();
        System.out.println("Nome:"+v.getNome());
        System.out.println();
        v.imprimir();
        
        System.out.println("Nome:"+fa.getNome());
        System.out.println();
        fa.imprimir();
        
        System.out.println();
        System.out.println("Nome:"+es.getNome());
        System.out.println();
        es.imprimir();
        

        System.out.println("Nome:"+lea.getNome());
        System.out.println();
        lea.imprimir();
        
        System.out.println();
        System.out.println("Nome:"+gle.getNome());
        System.out.println();
        gle.imprimir();

        


        
        
    }
}

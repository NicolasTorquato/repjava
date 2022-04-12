class Main2 {
   private String nome;
   //construtor
   Main2(){
        System.out.println("Construtor chamado: ");
        nome = "Programa Java";
        x = 5;
        y = 6;
        z = x+y;
        }
   public static void main(String[] args){
       Main2 obj = new Main2();
       System.out.println("Qual construtor foi chamado? " + obj.nome);
       System.out.println(obj.z);
   }
}
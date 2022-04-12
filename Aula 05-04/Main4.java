class Main4 {
    int a;
    boolean b;
    private Main4(){
        a = 0;
        b = false;
    }
    public static void mian(String[] args){
        Main4 obj = new Main4();
        System.out.println("Valores padrão: ");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}
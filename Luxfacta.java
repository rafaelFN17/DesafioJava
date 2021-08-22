public class Luxfacta {
    private int n;

    public Luxfacta(int numero){
        n = numero;
    }


    public String Say(){
        if ((n%3 == 0) && (n%5 == 0)) {
            return "LuxFacta";
        } else if(n%3 == 0){
            return "Lux";
        } else if(n%5 == 0){
            return "Facta";
        }else {
            return String.valueOf(n);
        }
    }
}

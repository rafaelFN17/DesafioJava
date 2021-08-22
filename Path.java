public class Path{
    private String mCaminho;

    public Path (String inicio){
    
        if(inicio.charAt(0) == '/'){
            mCaminho = inicio;
        }else {
            System.out.println("InvalidPathException");
        }
    }

    public String changeDirectory(String comando){
        String aux = comando.toLowerCase();


        if(comando.charAt(0) == '.' && comando.charAt(1) == '.'){
            String novoCaminho = "";
            char c;
            for (int i = 0; i < mCaminho.length()-2; i++) {
                c = mCaminho.charAt(i);
                novoCaminho = novoCaminho +  c;
            }
            comando = comando.replace(".", "");
            mCaminho = novoCaminho + comando;
            return mCaminho;
        }


        if (comando.charAt(0) == '/') {
            for (int i = 1; i < aux.length(); i++) {
                if (aux.charAt(i) < 'a' || aux.charAt(i) > 'z') {
                    return "InvalidException";
                }
            }
            return mCaminho = comando;        
        }else if(aux.charAt(0) > 'a' || aux.charAt(0) < 'z'){
            mCaminho = mCaminho + '/' + comando;
        }else {
            return "InvalidException";
        }

        return mCaminho;
    }
}
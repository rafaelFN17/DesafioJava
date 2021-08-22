public class Palindromes{
    private String mPalavra;

    public Palindromes(String palavra){
        mPalavra = palavra;
    }

    public boolean isPalindrome(){
        mPalavra = mPalavra.toLowerCase();
        char letra;
        String aux = "";
        for (int i = mPalavra.length()-1; i > -1; i--) {
            letra = mPalavra.charAt(i);
            aux = aux + letra;
        }

        return aux.equals(mPalavra);
    }
}
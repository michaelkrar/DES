

public class DES {
    private int[] key;
    private int keyLength;
    public DES(){
        this.key = new int[]{0,0,0,0,0,0,0,0,0,0};
        keyLength = 10;
    }
    public DES(int[] key){
        this.key=key;
        this.keyLength=key.length;
    }
    public int[] encrypt(int[] plaintext){

        return null;
    }
    public int[] decrypt(int[] cyphertext){
        return null;
    }
    
}

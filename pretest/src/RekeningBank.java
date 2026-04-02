public class RekeningBank{
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;

        if(this.saldo >= 0){
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }
    public get saldo(){
        return this.saldo;
    }
}

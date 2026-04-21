public class PembEWallet implements Pembayaran {
    private int id;
    private String nama;
    private String nominal;
    private String eWallet;

    public PembEWallet(int id, String nama, String nominal, String eWallet) {
        this.id = id;
        this.nama = nama;
        this.nominal = nominal;
        this.eWallet = eWallet;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getNominal() {
        return nominal;
    }

    public String getEWallet() {
        return eWallet;
    }
}

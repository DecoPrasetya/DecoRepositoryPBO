public class PembBank implements Pembayaran {
    private int id;
    private String nama;
    private String nominal;
    private String bank;

    public PembBank(int id, String nama, String nominal, String bank) {
        this.id = id;
        this.nama = nama;
        this.nominal = nominal;
        this.bank = bank;
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

    public String getBank() {
        return bank;
    }
}
package Praktikum2;

public class Pegawai {
    public String nama;
    public String asal;  // Tipe data diubah menjadi String
    public String jabatan;
    public int umur = 17;  // Nilai default 17 sesuai dengan output yang diharapkan

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk asal
    public String getAsal() {
        return asal;
    }

    // Setter untuk jabatan
    public void setJabatan(String j) {
        this.jabatan = j;
    }

    // Getter untuk jabatan
    public String getJabatan() {
        return jabatan;
    }

    // Getter untuk umur
    public int getUmur() {
        return umur;
    }
}

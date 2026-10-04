package com.mycompany.smartlibrary;

public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    
    public static int totalBukuBerhasilDibuat = 0;
    
    public Buku(String judulBuku, String pengarangBuku, int tahunBuku){
        judul = judulBuku;
        pengarang =pengarangBuku;
        tahunTerbit = tahunBuku;
    }
    
    public String getJudul(){
        return this.judul;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public String getPengarang() {
    return this.pengarang;
}

public void setPengarang(String pengarang) {
    this.pengarang = pengarang;
}

public int getTahunTerbit() {
    return this.tahunTerbit;
}

public void setTahunTerbit(int tahunTerbit) {
    if (tahunTerbit > 0) {
        this.tahunTerbit = tahunTerbit;
    } else {
        System.out.println("Tahun terbit tidak valid!");
    }
}
    
    public void tampilkanInfoBuku(){
        System.out.printf("judul: %-20s | pengarang %-15s | Tahun: %d%n", judul, pengarang, tahunTerbit);
    }
    
}


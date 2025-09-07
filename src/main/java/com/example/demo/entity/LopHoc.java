package com.example.demo.entity;

public class LopHoc {
    private String maLopHoc;
    private String tenLopHoc;
    private int siSo;

    public LopHoc(String maLopHoc, String tenLopHoc, int siSo) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.siSo = siSo;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }
    public String getTenLopHoc() {
        return tenLopHoc;
    }
    public int getSiSo() {
        return siSo;
    }
    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }
    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }
    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }
    @Override
    public String toString() {
        return "ma lop: "+maLopHoc+", ten lop: "+tenLopHoc+", si so: "+siSo;
    }

}

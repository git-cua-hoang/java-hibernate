package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lop_hoc")
public class LopHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maLopHoc;

    private String tenLopHoc;
    private int siSo;

    public Long getMaLopHoc() {
        return maLopHoc;
    }
    public String getTenLopHoc() {
        return tenLopHoc;
    }
    public int getSiSo() {
        return siSo;
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

package com.example.demo.repository;


import com.example.demo.entity.LopHoc;

import java.util.ArrayList;
import java.util.List;

public class LopHocRepo {
    private List<LopHoc> danhSachLopHoc = new ArrayList<LopHoc>();

    public void save(LopHoc lopHoc) {
        danhSachLopHoc.add(lopHoc);
    }

    public List<LopHoc> findAll() {
        return danhSachLopHoc;
    }

    public LopHoc findById(String maLopHoc) {
        for(LopHoc lopHoc : danhSachLopHoc) {
            if(lopHoc.getMaLopHoc().equals(maLopHoc))
                return lopHoc;
        }
        return null;
    }

    public void xoaLopHoc(LopHoc lopHoc) {
        danhSachLopHoc.remove(lopHoc);
    }

    public boolean capNhat(LopHoc lopHoc) {
        LopHoc timLopHoc = findById(lopHoc.getMaLopHoc());
        if(timLopHoc != null) {
            timLopHoc.setTenLopHoc(lopHoc.getTenLopHoc());
            timLopHoc.setSiSo(lopHoc.getSiSo());
            return true;
        }
        return false;
    }
}

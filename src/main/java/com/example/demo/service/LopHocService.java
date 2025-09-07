package com.example.demo.service;


import com.example.demo.entity.LopHoc;
import com.example.demo.repository.LopHocRepo;

import java.util.List;

public class LopHocService {
    private LopHocRepo repo;

    public LopHocService(LopHocRepo repo) {
        this.repo = repo;
    }

    public boolean themLopHoc(String maLopHoc, String tenLopHoc, int siSo){
        if(maLopHoc != null && tenLopHoc != null && siSo != 0){
            LopHoc kiemTraLopHoc = repo.findById(maLopHoc);
            if(kiemTraLopHoc != null){
                return false;
            }else {
                LopHoc lopHoc = new LopHoc(maLopHoc, tenLopHoc, siSo);
                repo.save(lopHoc);
                return true;
            }
        }
        return false;
    }

    public boolean capNhatLopHoc(String maLopHoc, String tenLopHoc, int siSo){
        LopHoc lopHoc = new LopHoc(maLopHoc, tenLopHoc, siSo);
        return repo.capNhat(lopHoc);
    }

    public List<LopHoc> danhSachLopHoc() {
        return repo.findAll();
    }

    public LopHoc timLopHoc(String maLopHoc) {
        return repo.findById(maLopHoc);
    }

    public void xoaLopHoc(String maLopHoc) {
        LopHoc lophoc = repo.findById(maLopHoc);
        if(lophoc != null) {
            repo.xoaLopHoc(lophoc);
        }
    }
}

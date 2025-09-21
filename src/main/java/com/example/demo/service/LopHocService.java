package com.example.demo.service;


import com.example.demo.entity.LopHoc;
import com.example.demo.repository.LopHocRepo;
import com.example.demo.repository.LopHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopHocService { //SOLID

    @Autowired
    private LopHocRepository repo;

//    public LopHocService(LopHocRepository repo) {
//        this.repo = repo;
//    }

    public boolean themLopHoc( String tenLopHoc, int siSo){
        repo.saveLopHoc(tenLopHoc, siSo);
        return true;
    }
//
//    public boolean capNhatLopHoc(String maLopHoc, String tenLopHoc, int siSo){
//        LopHoc lopHoc = new LopHoc(maLopHoc, tenLopHoc, siSo);
//        return repo.capNhat(lopHoc);
//    }
//
//    public List<LopHoc> danhSachLopHoc() {
//        return repo.findAll();
//    }
//
//    public LopHoc timLopHoc(String maLopHoc) {
//        return repo.findById(maLopHoc);
//    }
//
//    public void xoaLopHoc(String maLopHoc) {
//        LopHoc lophoc = repo.findById(maLopHoc);
//        if(lophoc != null) {
//            repo.xoaLopHoc(lophoc);
//        }
//    }
}

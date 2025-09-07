package com.example.demo.view;

import com.example.demo.entity.LopHoc;
import com.example.demo.service.LopHocService;

import java.util.List;
import java.util.Scanner;

public class LopHocView {
    private LopHocService lopHocService;
    private Scanner scanner;

    public LopHocView(LopHocService service) {
        this.lopHocService = service;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int choice = 0;
        do {
            System.out.println("Quan ly lop hoc");
            System.out.println("1. Them lop hoc");
            System.out.println("2. Danh sach Lop hoc");
            System.out.println("3. Tim kiem Lop hoc");
            System.out.println("4. Cap nhat lop hoc");
            System.out.println("5. Xoa lop hoc");
            System.out.println("6. Thoat");
            System.out.println("Vui long chon: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Vui long nhap dung");
                continue;
            }

            switch(choice) {
                case 1 -> themLopHoc();
                case 2 -> hienThiDanhSach();
                case 3 -> timKiemLopHoc();
                case 4 -> capNhatLopHoc();
                case 5 -> xoaLopHoc();
                case 6 -> {
                    System.out.println("Thoat rui`");
                    return;
                }
                default -> System.out.println("Nhap sai roi");
            }
        }while(true);
    }

    private void themLopHoc() {
        System.out.println("Nhap ma lop: ");
        String maLopHoc = scanner.nextLine();
        System.out.println("Nhap ten lop: ");
        String tenLopHoc = scanner.nextLine();
        System.out.println("Nhap si so: ");
        int siso = Integer.parseInt(scanner.nextLine());

        boolean taoThanhCong = lopHocService.themLopHoc(maLopHoc, tenLopHoc, siso);

        if(taoThanhCong) {
            System.out.println("Them thanh cong");
        }else {
            System.out.println("Them that bai");
        }
    }

    private void hienThiDanhSach() {
        List<LopHoc> danhSach = lopHocService.danhSachLopHoc();

        if (danhSach.isEmpty()) {
            System.out.println("Danh sach chua co gi");
        }else {
            System.out.println("Danh sach ne: ");
            for (LopHoc lophoc: danhSach){
                System.out.println(lophoc.toString());
            }
        }
    }

    private void timKiemLopHoc(){

        System.out.println("Nhap ma lop: ");
        String maLopHoc = scanner.nextLine();

        LopHoc lopHoc = lopHocService.timLopHoc(maLopHoc);
        if(lopHoc != null) {
            System.out.println(lopHoc);
        }else {
            System.out.println("Khong tim thay roi");
        }
    }

    private void capNhatLopHoc() {
        System.out.println("Nhap ma lop: ");
        String maLopHoc = scanner.nextLine();
        System.out.println("Nhap ten lop: ");
        String tenLopHoc = scanner.nextLine();
        System.out.println("Nhap si so: ");
        int siso = Integer.parseInt(scanner.nextLine());

        boolean capNhatThanhCong = lopHocService.capNhatLopHoc(maLopHoc, tenLopHoc, siso);

        if(capNhatThanhCong) {
            System.out.println("Cap nhat thanh cong");
        }else {
            System.out.println("Cap nhat that bai");
        }
    }

    private void xoaLopHoc() {
        System.out.println("Nhap ma lop: ");
        String maLopHoc = scanner.nextLine();

        lopHocService.xoaLopHoc(maLopHoc);

        System.out.println("Xoa xong roi");
    }

}

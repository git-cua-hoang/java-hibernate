package com.example.demo.repository;

import com.example.demo.entity.LopHoc;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LopHocRepository extends JpaRepository<LopHoc, Long> {

    @Modifying
    @Transactional //ACID
    @Query(value = "INSErT INTO \"lop_hoc\"(ten_lop_hoc, si_so) VALUES(:ten, :siso)", nativeQuery = true)
    int saveLopHoc(@Param("ten") String ten, @Param("siso") int siso);

    // Xem lớp học
    // SELECT * FROM lop_hoc"
    // Sửa lớp học
    // UPDATE lop_hoc SET ten_lop_hoc = ?, si_so=? WHERE id = ?
    // Xoá lớp học
    // DELETE lop_hoc WHERE id = ?

    // SQL INJECTION   -> SELECT * FROM user WHERE acc = "hungnt" AND password = "123456"
    // SELECT * FROM user WHERE acc = "hungnt" AND password = "123456" OR "TRUE"
    // INJECTION -> 123456" OR "TRUE
    // DDOS -> Tấn công từ chối truy cập. website -> tăng người truy cập. 200 người dùng. 2000 -> sập
    // DDOS giả lập người dùng xong truy cập vào webssite làm web giật lag hoạc chết
    // CHEATER -> report page, mua tài khoản fb: 2000/ 5000/1 cái -> báo cáo xấu.

    @Modifying
    @Query(value = "DELETE FROM \"lop_hoc\" WHERE \"ma_lop_hoc\" = :ma_lop_hoc", nativeQuery = true)
    int deleteLopHoc(@Param("ma_lop_hoc") Long ma_lop_hoc);

    @Modifying
    @Query(value ="UPDATE \"lop_hoc\" SET ten_lop_hoc = :ten, si_so = :siso WHERE \"ma_lop_hoc\" =:ma_lop_hoc", nativeQuery = true)
    int updateLopHoc(@Param("ten") String ten, @Param("siso") int siso, @Param("id") Long ma_lop_hoc);

    @Query(value = "select * from lop_hoc", nativeQuery = true)
    List<LopHoc> danhsach();
}

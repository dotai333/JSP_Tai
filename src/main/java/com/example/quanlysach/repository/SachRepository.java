/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlysach.repository;

import com.example.quanlysach.model.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author PC_33
 */
public interface SachRepository extends JpaRepository<Sach, String> {

    List<Sach> findByTenSachContainingIgnoreCase(String tenSach);

    List<Sach> findByTacGiaContainingIgnoreCase(String tacGia);

    List<Sach> findByDonGiaLessThanEqual(BigDecimal donGia);
}

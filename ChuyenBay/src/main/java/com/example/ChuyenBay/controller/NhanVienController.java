package com.example.ChuyenBay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChuyenBay.entity.NhanVien;
import com.example.ChuyenBay.repository.ChuyenBayRepository;
import com.example.ChuyenBay.repository.MayBayRepository;
import com.example.ChuyenBay.repository.NhanVienRepository;
@RestController
public class NhanVienController {
	@Autowired
	
	NhanVienRepository nhanvien;
	
	@GetMapping("/cau3")
	public List<NhanVien> cau3(){
	return nhanvien.findNVLuongNH10000();
}
@GetMapping("/cau8")
public int cau8() {
	return nhanvien.TongLuongNVPhaiTra();
}
@GetMapping("/cau9")
public List<String> cau9(){
	return nhanvien.findNVLaiBoeing();
}
@GetMapping("/cau10")
public List<NhanVien> cau10(){
	return nhanvien.findNVByMaMB();
}
}

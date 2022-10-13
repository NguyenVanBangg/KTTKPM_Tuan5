package com.example.ChuyenBay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChuyenBay.entity.ChuyenBay;
import com.example.ChuyenBay.entity.MayBay;
import com.example.ChuyenBay.entity.NhanVien;
import com.example.ChuyenBay.repository.ChuyenBayRepository;
import com.example.ChuyenBay.repository.MayBayRepository;
import com.example.ChuyenBay.repository.NhanVienRepository;
@RestController
public class ChuyenBayController {
	@Autowired
	ChuyenBayRepository chuyenbay;

	@GetMapping("/cau1")
	public List<ChuyenBay> cau1(){
		return chuyenbay.findChuyenBaysDaLat();
	}
	@GetMapping("/cau4")
	public List<ChuyenBay> bai4(){
		return chuyenbay.findChuyenBaysDoDaiNH10000LH8000();
	}
	@GetMapping("/cau5")
	public List<ChuyenBay> bai5(){
		return chuyenbay.findChuyenBaysfromSGNtoBMV();
	}
	@GetMapping("/cau6")
	public int bai6(){
		return chuyenbay.CountChuyenBaysfromSG();
	}
	

}

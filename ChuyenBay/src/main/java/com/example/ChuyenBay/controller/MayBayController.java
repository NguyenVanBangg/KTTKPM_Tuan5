package com.example.ChuyenBay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChuyenBay.entity.MayBay;
import com.example.ChuyenBay.repository.ChuyenBayRepository;
import com.example.ChuyenBay.repository.MayBayRepository;
import com.example.ChuyenBay.repository.NhanVienRepository;
@RestController
public class MayBayController {
	@Autowired
	
	MayBayRepository maybay;
	@GetMapping("/cau2")
	public List<MayBay> cau2(){
		return maybay.findMayBayTamBayLH10000();
	}
	@GetMapping("/cau7")
	public int cau7(){
		return maybay.CountMayBayLoaiBoeing();
	}
}

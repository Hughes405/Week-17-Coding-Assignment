package com.promineotech.jeep.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import com.promineotech.jeep.entity.Image;

import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

public interface JeepSalesService {

	List<Jeep> fetchJeeps(JeepModel model, String trim);

	String uploadImage(MultipartFile image, Long jeepPK);

	Image retrieveImage(String imageId);




}

package com.promineotech.jeep.dao;

import java.util.List;
import java.util.Optional;

import com.promineotech.jeep.entity.Image;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;


public interface JeepSalesDao {

	List<Jeep> fetchJeeps(JeepModel model, String trim);

	void saveImage(Image image);
	

	Optional <Image> retrieveImage(String imageId);


}

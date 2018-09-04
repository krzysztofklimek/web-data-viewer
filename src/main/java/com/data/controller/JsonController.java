package com.data.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.data.model.Serie;
import com.data.repo.SerieRepository;

@RestController
public class JsonController {

	@Autowired
	SerieRepository serieRepository;

	@RequestMapping("/Json")
	public Page showJson(Pageable pageable) {

		return serieRepository.findAll(pageable);
	}
}

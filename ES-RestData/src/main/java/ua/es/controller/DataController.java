package ua.es.controller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.es.dao.DataDao;
import ua.es.model.DataModel;

@RestController
@RequestMapping("/datas")
public class DataController {

	@Autowired
	private DataDao repositorio;

	@RequestMapping(path = "/all", method=RequestMethod.GET, produces = {MediaType.APPLICATION_JSON} )
	public List<DataModel> listar() {
		return repositorio.findAll();
	}
	
}

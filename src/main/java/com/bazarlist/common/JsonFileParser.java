/**
 *
 */
package com.bazarlist.common;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.bazarlist.dto.parse.HallParse;
import com.bazarlist.model.Hall;
import com.bazarlist.service.dec.IHallService;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author JK
 *
 */
@Component
public class JsonFileParser {

	@Autowired
	private IHallService iHallService;

	@Autowired
	private DozerBeanMapper dozer;

  @Value("classpath:collectedJson/banktalar.json")
  private Resource collectedJson;

  public  void parseTest(){
    try {
      this.parse(this.collectedJson.getInputStream());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

	public void parse(InputStream inputStream) {
		List<HallParse> parseObjectList = null;
		try {
			parseObjectList = Arrays.asList(new ObjectMapper().readValue(inputStream, HallParse[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i = 0;
		for (HallParse parseObject : parseObjectList) {
			try {
				iHallService.save(dozer.map(parseObject, Hall.class));
				System.out.println(i++ + " inserted");
			} catch (Exception e) {
        System.out.println(e);
				System.out.println(i++ + " Err");
			}
		}

		// iHallService.save(dozer.map(parseObjectList.get(529), Hall.class));
	}

}

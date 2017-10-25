package com.q.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.q.model.Instrument;

@Service
public class InService {
	
	public List<Instrument> init(){
		Instrument instrument = new Instrument();
		instrument.setId(1);
		instrument.setName("ÌêĞëµ¶");
		instrument.setPrice(100);
		Instrument instrument1 = new Instrument();
		instrument1.setId(2);
		instrument1.setName("µç´µ·ç");
		instrument1.setPrice(50);
		Instrument instrument2 = new Instrument();
		instrument2.setId(3);
		instrument2.setName("³äµç±¦");
		instrument2.setPrice(25);
		List<Instrument> instruments = new ArrayList<>();
		instruments.add(instrument);
		instruments.add(instrument1);
		instruments.add(instrument2);
		return instruments;
	}
	
}

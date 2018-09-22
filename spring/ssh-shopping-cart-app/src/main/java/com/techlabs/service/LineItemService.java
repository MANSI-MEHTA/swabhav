package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.LineItem;
import com.techlabs.repository.LineItemRepository;

@Service("lineitemservice")
public class LineItemService {
	@Autowired
	LineItemRepository lineitem_repo;
//	private List<LineItem> listOfLineItems = new ArrayList<LineItem>();
//	public LineItemService() {
//
//	}
//
//	public List<LineItem> addLineItem(LineItem lineitem,List<LineItem> listfromsession) {
//	 List<LineItem> updatedlistofLineItems = new ArrayList<LineItem>();
//		if(listfromsession!=null){
//			for (LineItem item : listfromsession) {
//				updatedlistofLineItems.add(item);
//			}
//		}
//		updatedlistofLineItems.add(lineitem);
//		return updatedlistofLineItems;
//	}
//
//	public List<LineItem> getListOfLineItems() {
//		return listOfLineItems;
//	}
//
//	public void setListOfLineItems(List<LineItem> listOfLineItems) {
//		this.listOfLineItems = listOfLineItems;
//	}
//
//	public List<LineItem> getAllLineItem() {
//		return listOfLineItems;
//	}
//
//	public List<LineItem> deleteLineItemById(List<LineItem> listfromsession,long id) {
//		for (LineItem lineitem : listfromsession) {
//			if (lineitem.getId() == id) {
//				listfromsession.remove(lineitem);
//				break;
//			}
//			
//		}
//		return listfromsession;
//	}
//
//	public boolean checklineitemexist(List<LineItem> listofproductsincart,
//			int id) {
//		if (listofproductsincart == null) {
//			return false;
//		}
//		for (LineItem lineitem : listofproductsincart) {
//			if (lineitem.getProduct_id()==id) {
//				//listOfLineItems.remove(lineitem);
//				return true;
//			}
//		}
//		return false;
//
//	}
//
//	public long generateLineItemId() {
//		return Math.abs(UUID.randomUUID().getMostSignificantBits());
//	}
//
		

}

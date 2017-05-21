/**
 * 
 */
package com.timerchina.collaborative.data;

import java.util.ArrayList;

import com.timerchina.collaborative.model.Content;
import com.timerchina.collaborative.model.Item;
import com.timerchina.collaborative.model.Rating;

/**
 * Item for news dataset.
 */
public class ContentItem extends Item {
	
	/**
     * SVUID
     */
    private static final long serialVersionUID = 6349342365379966975L;
	
	public ContentItem(int id, String name, Content content) {
		super(id, name, new ArrayList<Rating>(3));
		setItemContent(content);
	}

	public ContentItem(Item val) {
		super(val.getId(),val.getName(),new ArrayList<Rating>(3));
		this.setItemContent(val.getItemContent());
	}

}

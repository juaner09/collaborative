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
public class NewsItem extends Item {
	
	/**
     * SVUID
     */
    private static final long serialVersionUID = 6349342365379966975L;
	
	public NewsItem(int id, String name, Content content) {
		super(id, name, new ArrayList<Rating>(3));
		setItemContent(content);
	}

}

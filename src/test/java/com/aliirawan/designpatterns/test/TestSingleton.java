package com.aliirawan.designpatterns.test;

import org.junit.Assert;
import org.junit.Test;

import com.aliirawan.designpatterns.singleton.Document;

public class TestSingleton {

	@Test
	public void testAll() {
	
		Document doc1 = Document.getInstance();
		Document doc2 = Document.getInstance();
		
		Assert.assertEquals(doc1, doc2);
		
		doc1.setTitle("Some title");
		
		Assert.assertEquals("Some title", doc2.getTitle());
	}
}

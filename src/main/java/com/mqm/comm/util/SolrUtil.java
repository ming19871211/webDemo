package com.mqm.comm.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.request.AbstractUpdateRequest;
import org.apache.solr.client.solrj.request.ContentStreamUpdateRequest;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;


/**
 * Solr工具类
 * @author mqm
 * @version 1.0
 *
 */
public class SolrUtil {
	
	public static final String HOST_URL_STRING ="http://localhost:8983/solr/mqm";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//query();
		importData();
		//batchImportData();
		//delAllData();
	}
	
	public static void delAllData(){
		SolrClient solr = getSolrClient();
		try {
			solr.deleteByQuery("*:*");
			solr.commit();
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void batchImportData(){
		SolrClient solr = getSolrClient();
	    ContentStreamUpdateRequest req = new ContentStreamUpdateRequest("/update");
	    String contentType="application/csv";
		try {
			req.addFile(new File("知识导入样例文件.csv"), contentType);
			req.setAction(AbstractUpdateRequest.ACTION.COMMIT, true, true);
			solr.request(req);
			QueryResponse rsp = solr.query(new SolrQuery("*:*"));
			System.out.println(rsp);
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
	
	public static void importData(){
		SolrClient solr = getSolrClient();
		SolrInputDocument input = new SolrInputDocument();
		input.addField("id", UUID.randomUUID().toString(), 1.0f);
		input.addField("title", "你好呀?");
		input.addField("content", "hello");
		input.addField("content", "您好吗？");
		input.addField("content", "好久不见，还好吧?");
		input.addField("name", "宝宝");
		input.addField("sex", "女");
		
		try {
			solr.add(input);
			solr.commit();
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void query(){
		SolrClient solr = getSolrClient();
		SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.setRequestHandler("/select");
		try {
			QueryResponse response = solr.query(query);
			SolrDocumentList list = response.getResults();
			System.out.println(list.getNumFound());
			for(SolrDocument solrDoc : list){
				System.out.println(solrDoc.size());
			}
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SolrClient getSolrClient(){
		//return SolrClient solr = new CloudSolrClient.Builder().withZkHost(HOST_URL_STRING).build();
		return new HttpSolrClient.Builder(HOST_URL_STRING).build();
	}

}

package br.com.fiap.ecommerce.bo;

import java.util.List;

import br.com.fiap.ecommerce.bean.PublisherBean;
import br.com.fiap.ecommerce.dao.PublisherDAO;

public class PublisherBO {
	public List<PublisherBean> getListPubliser() {
		PublisherDAO publisherDAO = new PublisherDAO();
		return publisherDAO.getAllPublishers();		
	}
	
	public List<PublisherBean> getListPubliser(PublisherBean publisherBean){
		PublisherDAO publisherDAO = new PublisherDAO();
		return publisherDAO.getAllPublishers(publisherBean);		
	}
	
	public void setPublisher(PublisherBean publisherBean){
		PublisherDAO publisherDAO = new PublisherDAO();
		
		publisherDAO.setPublisher(publisherBean);
	}
	
	public void deletePublisher(PublisherBean publisherBean){
		PublisherDAO publisherDAO = new PublisherDAO();
		
		publisherDAO.deletePublisher(publisherBean);
	}
	
	public PublisherBean getPublisher(PublisherBean publisherBean){
		PublisherDAO publisherDAO = new PublisherDAO();
		return publisherDAO.getPublisher(publisherBean);
	}

	public void alterPublisher(PublisherBean publisher) {
		PublisherDAO publisherDAO = new PublisherDAO();
		publisherDAO.alterPublisher(publisher);
	}	
}

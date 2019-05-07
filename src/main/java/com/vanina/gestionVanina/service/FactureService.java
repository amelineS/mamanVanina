package com.vanina.gestionVanina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vanina.gestionVanina.dao.IFactureDAO;
import com.vanina.gestionVanina.entities.Facture;

@Service
public class FactureService implements IFactureService {

	@Autowired
	private IFactureDAO dao;

	public IFactureDAO getDao() {
		return dao;
	}

	public void setDao(IFactureDAO dao) {
		this.dao = dao;
	}


	@Override
	public float totalHTRemise(Facture f) {
		// TODO Auto-generated method stub	
		return totalHTnet(f)*f.getRemise();
	}

	@Override
	public float totalTVA(Facture f) {
		// TODO Auto-generated method stub
		return totalHTRemise(f)*f.getTva();
	}

	@Override
	public float totalHTnet(Facture f) {

//		float total=0f;
//		for(Produit p : f.getOrdredecommande().getListProduits()) {
//			total+=p.getPrix()*p.getQuantiteProduit();
//		}
//		return total;
		return f.getPrixUnitaireHT()*f.getQuantite();
	}

	@Override
	public float totalTTC(Facture f) {
		// TODO Auto-generated method stub
		return totalHTnet(f)-totalHTRemise(f)+totalTVA(f);
	}


	@Override
	public float netAPayer(Facture f) {
		// TODO Auto-generated method stub
		return totalTTC(f)-f.getAccomptes();
	}

	@Override
	public List<Facture> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Facture> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return dao.findAll(sort);
	}

	@Override
	public List<Facture> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return dao.findAllById(ids);
	}

	@Override
	public <S extends Facture> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return dao.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		dao.flush();
	}

	@Override
	public <S extends Facture> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return dao.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Facture> entities) {
		// TODO Auto-generated method stub
		dao.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		dao.deleteAllInBatch();
	}

	@Override
	public Facture getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id);
	}

	@Override
	public <S extends Facture> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.findAll(example);
	}

	@Override
	public <S extends Facture> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return dao.findAll(example, sort);
	}

	@Override
	public Page<Facture> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(pageable);
	}

	@Override
	public <S extends Facture> S save(S entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Optional<Facture> findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return dao.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return dao.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public void delete(Facture entity) {
		// TODO Auto-generated method stub
		dao.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Facture> entities) {
		// TODO Auto-generated method stub
		dao.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		dao.deleteAll();
	}

	@Override
	public <S extends Facture> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.findOne(example);
	}

	@Override
	public <S extends Facture> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return dao.findAll(example, pageable);
	}

	@Override
	public <S extends Facture> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.count(example);
	}

	@Override
	public <S extends Facture> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return dao.exists(example);
	}
	
	
	
}

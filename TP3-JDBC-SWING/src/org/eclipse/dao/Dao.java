package org.eclipse.dao;

import java.util.List;

import org.eclipse.model.Utilisateur;

public interface Dao<T> {
	T save(T obj);
	void remove(T obj);
	T update(T obj);
	T findById(int id);
	List<T> getAll();
	T findByNomAndPrenom(String nom, String prenom);

}

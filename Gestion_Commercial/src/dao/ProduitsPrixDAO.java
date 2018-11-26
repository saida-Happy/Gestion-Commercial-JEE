package dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A data access object (DAO) providing persistence and search support for
 * ProduitsPrix entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see dao.ProduitsPrix
 * @author MyEclipse Persistence Tools
 */

public class ProduitsPrixDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ProduitsPrixDAO.class);
	// property constants
	public static final String NOM_PDT = "nomPdt";
	public static final String DESC_PDT = "descPdt";
	public static final String PRIX_PDT = "prixPdt";

	public void save(ProduitsPrix transientInstance) {
		log.debug("saving ProduitsPrix instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ProduitsPrix persistentInstance) {
		log.debug("deleting ProduitsPrix instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProduitsPrix findById(java.lang.Integer id) {
		log.debug("getting ProduitsPrix instance with id: " + id);
		try {
			ProduitsPrix instance = (ProduitsPrix) getSession().get(
					"dao.ProduitsPrix", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ProduitsPrix instance) {
		log.debug("finding ProduitsPrix instance by example");
		try {
			List results = getSession().createCriteria("dao.ProduitsPrix").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ProduitsPrix instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ProduitsPrix as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNomPdt(Object nomPdt) {
		return findByProperty(NOM_PDT, nomPdt);
	}

	public List findByDescPdt(Object descPdt) {
		return findByProperty(DESC_PDT, descPdt);
	}

	public List findByPrixPdt(Object prixPdt) {
		return findByProperty(PRIX_PDT, prixPdt);
	}

	public List findAll() {
		log.debug("finding all ProduitsPrix instances");
		try {
			String queryString = "from ProduitsPrix";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ProduitsPrix merge(ProduitsPrix detachedInstance) {
		log.debug("merging ProduitsPrix instance");
		try {
			ProduitsPrix result = (ProduitsPrix) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ProduitsPrix instance) {
		log.debug("attaching dirty ProduitsPrix instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProduitsPrix instance) {
		log.debug("attaching clean ProduitsPrix instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
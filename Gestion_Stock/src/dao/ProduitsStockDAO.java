package dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * ProduitsStock entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see dao.ProduitsStock
 * @author MyEclipse Persistence Tools
 */

public class ProduitsStockDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ProduitsStockDAO.class);
	// property constants
	public static final String CODE_STOCK = "codeStock";
	public static final String QTE_PDT = "qtePdt";

	public void save(ProduitsStock transientInstance) {
		log.debug("saving ProduitsStock instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ProduitsStock persistentInstance) {
		log.debug("deleting ProduitsStock instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProduitsStock findById(java.lang.Integer id) {
		log.debug("getting ProduitsStock instance with id: " + id);
		try {
			ProduitsStock instance = (ProduitsStock) getSession().get(
					"dao.ProduitsStock", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ProduitsStock instance) {
		log.debug("finding ProduitsStock instance by example");
		try {
			List results = getSession().createCriteria("dao.ProduitsStock")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ProduitsStock instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ProduitsStock as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCodeStock(Object codeStock) {
		return findByProperty(CODE_STOCK, codeStock);
	}

	public List findByQtePdt(Object qtePdt) {
		return findByProperty(QTE_PDT, qtePdt);
	}

	public List findAll() {
		log.debug("finding all ProduitsStock instances");
		try {
			String queryString = "from ProduitsStock";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ProduitsStock merge(ProduitsStock detachedInstance) {
		log.debug("merging ProduitsStock instance");
		try {
			ProduitsStock result = (ProduitsStock) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ProduitsStock instance) {
		log.debug("attaching dirty ProduitsStock instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProduitsStock instance) {
		log.debug("attaching clean ProduitsStock instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
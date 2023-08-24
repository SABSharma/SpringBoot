package com.springboot.Practice.Service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Practice.Dao.MobileDao;
import com.springboot.Practice.Entity.Mobile;

@Service
public class MobileServiceImpl implements MobileService {
    
	@Autowired
	private MobileDao mobileDao;

	public MobileServiceImpl(MobileDao mobileDao) {
		this.mobileDao = mobileDao;
	}

	@Override
	public Mobile addmobile( Mobile mobile) {
		// TODO Auto-generated method stub
		
		Mobile save = mobileDao.save(mobile);
		return save;
	}
	
	@Override
	public Optional<Mobile> deletemobile(int id) {
		// TODO Auto-generated method stub
		
//		Optional<Mobile> optional = Optional.ofNullable(mobileDao.getById(id));
//		if(optional.isEmpty()) {
//			return null;
//		}
		mobileDao.deleteById(id);
		
		return null;
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
	    
		
	     
	     mobileDao.deleteById(id);

		return "Mobile id got deleted";
	}

	@Override
	public List<Mobile> getallMObiles() {

		List<Mobile> all = mobileDao.findAll();
		return all;
	}

}

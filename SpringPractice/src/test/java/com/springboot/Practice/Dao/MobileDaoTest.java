package com.springboot.Practice.Dao;

import com.springboot.Practice.Entity.Mobile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MobileDaoTest {

    @Autowired
    private MobileDao mobileDao;

    @Test
    public void findmobile_by_id(){

        Optional<Mobile> mobile =mobileDao.findById(304);
        Mobile mobile1= new Mobile(304,"poco","14000");

        assertEquals(304,mobile.get().getId());
        assertEquals(mobile1,mobile.get());

    }

    @Test
    public void  saveMobileTest(){
        Mobile mobile1= new Mobile(303,"iphone","150000");
        Mobile save = mobileDao.save(mobile1);

        assertEquals(mobile1, save);
    }

}
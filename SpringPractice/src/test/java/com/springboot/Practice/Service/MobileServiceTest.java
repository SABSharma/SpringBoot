package com.springboot.Practice.Service;

import com.springboot.Practice.Dao.MobileDao;
import com.springboot.Practice.Entity.Mobile;
import org.aspectj.weaver.patterns.IVerificationRequired;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MobileServiceTest {

    @Mock
    private MobileDao mobileDao;

   @InjectMocks
    private MobileServiceImpl mobileService;

//    @BeforeEach
//    public void setUP(){
//        this.mobileService=new MobileServiceImpl(this.mobileDao);
//    }

   // Working on this delte option
//    @Test
//    public  void deleteMobileID(){
//
//        Mockito.when(mobileDao.deleteById()).thenReturn("Mobile id got deleted");
//        String delete = mobileService.delete(10);
//        assertEquals("Mobile id got deleted" ,delete);
//
//    }

    @Test
    public void getAllMobiles(){

        //Testing Purpose  // Successfullly pass
//        List<Mobile>  mobiless=new ArrayList<>();
//        mobiless.add(new Mobile(1,"iphone","100000"));
        List<Mobile>  mobiles=new ArrayList<>();
        mobiles.add(new Mobile(1,"iphone","100000"));
        mobiles.add(new Mobile(2,"pocox2","14000"));

        Mockito.when(mobileDao.findAll()).thenReturn(mobiles);


        List<Mobile> mobiles1 = mobileService.getallMObiles();

        assertEquals(mobiles, mobiles1);
        Mockito.verify(mobileDao).findAll();

    }

}
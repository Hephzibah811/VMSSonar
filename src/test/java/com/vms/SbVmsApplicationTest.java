//package com.vms;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.vms.bean.Vehicle;
//import com.vms.controller.VMSController;
//
//@TestMethodOrder(OrderAnnotation.class)
//@SpringBootTest
//class SbVmsApplicationTests {
//    
//    @Autowired
//    VMSController controller;
//    
//    String insert;
//    String update;
//    String delete;
//    String result;
//    String result1;
//    List<Vehicle> list = new ArrayList<Vehicle>();
//    List<Vehicle> list1 = new ArrayList<Vehicle>();
//    Vehicle veh = new Vehicle(111,"Poco","XUltra","TN65K1123","Heph");
//    Vehicle veh1 = new Vehicle(121,"Poco","XUltra","TN65K1123","Heph");
//    Vehicle veh2;
//    Vehicle veh3;
//    
//        
//    @Test
//    @Order(1)
//    void contextLoads() {
//    
//    }
//    
//    @Test
//    @Order(2)    
//    public void testPerformInsert() {
//        insert="Inserted";
//        result=controller.performInsert(veh1);
//        assertEquals(insert,result);
//    }
//    
//    @Test
//    @Order(3)
//    public void testPerformUpdate() {
//        update="Updated";
//        result=controller.performUpdate(veh1);
//        assertEquals(update,result);
//    }
//    
//    @Test
//    @Order(4)
//    public void testPerformDelete() {
//        delete="Deleted";
//        result=controller.performDelete(723);
//        result1=controller.performDelete(301);
//        assertEquals(delete,result);
//    }
//    
//    @Test
//    @Order(5)
//    public void testgetAllMobile() {
//        list= controller .getAllVehicle();
//        veh2 = new Vehicle(101,"Poco","XUltra","TN65K1123","Heph");
//        veh3 = new Vehicle(101,"iPhone","Ultra","TN65K1123","Mad");
//        list1.add(veh2);
//        list1.add(veh3);
//        list.equals(list1);
//    }
//
//}
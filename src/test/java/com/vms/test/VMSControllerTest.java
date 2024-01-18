//package com.vms.test;
//
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.vms.bean.Vehicle;
//import com.vms.dao.VehicleDAO;
//
//class VMSControllerTest {
//
//    @Autowired
//    VehicleDAO dao;
//
//    public Vehicle vehicle;
//
//   @Before
//    public void setUp() throws Exception {
//        // Code executed before each test method
//        vehicle = new Vehicle();
//        vehicle.setId(123);
//        vehicle.setType("Four Wheeler");
//        vehicle.setName("Hyundai");
//        vehicle.setNum("TN84KL6427");
//        vehicle.setOwner("Sara");
//       
//    }
//
//    @Test
//    public void testPerformInsert() {
//        // Test if the mobile object is saved to the database
//        dao.save(vehicle);
//        assertNotNull(vehicle.getId());
//    }
//
//    @Test
//    public void testGetAll() {
//        // Test if the getAll() method returns a list of vehicles
//        List<Vehicle> mobiles = (List<Vehicle>) dao.findAll();
//        assertNotNull(mobiles);
//    }
//
//    @Test
//    public void testPerformUpdate() {
//        // Test if the mobile object is updated in the database
//        dao.save(vehicle);
//        vehicle.setNum("TN84KL6429");
//        dao.save(vehicle);
//        Vehicle updatedNumber = dao.findById(vehicle.getId()).orElse(null);
//        assertEquals(updatedNumber.getNumber(),"TN84KL1187");
//    }
//
//    @Test
//    public void testPerformDelete() {
//        // Test if the mobile object is deleted from the database
//        dao.save(vehicle);
//        dao.deleteById(vehicle.getId());
//        Vehicle deletedMobile = dao.findById(vehicle.getId()).orElse(null);
//        assertEquals(deletedMobile, null);
//    }
//}
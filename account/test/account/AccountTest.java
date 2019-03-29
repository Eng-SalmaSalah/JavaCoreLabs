/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salma
 */
public class AccountTest {
    private Account account;
    private static double balance;
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        balance=100;
        System.out.println("Before Class");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        account=new Account(balance);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBalance method, of class Account.
     */
    //@Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Account instance = null;
        double expResult = 0.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBalance method, of class Account.
     */
    //@Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balance = 0.0;
        Account instance = null;
        instance.setBalance(balance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class Account.
     */
   // @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double withdrawAmount = 0.0;
        Account instance = null;
        instance.withdraw(withdrawAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class Account.
     */
    //@Test
    public void testDeposit() {
        System.out.println("deposit");
        double depositAmount = 0.0;
        Account instance = null;
        instance.deposit(depositAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void balanceForAccount(){
    Assert.assertEquals("Test balance",account.getBalance(),balance,0);
    System.out.println("Test balance.Balance:"+account.getBalance());
    }
    /**
     * Test of main method, of class Account.
     */
    @Test
    public void testOneDeposits(){
        account.deposit(20);
        Assert.assertEquals("Test deposit",account.getBalance(),balance,20);
        System.out.println("Test deposit , balance:" + account.getBalance());
    } 
    
        @Test
    public void testManyDeposits(){
        account.deposit(20);
        account.deposit(10);
        Assert.assertEquals("Test many deposit",account.getBalance(),balance,30);
        System.out.println("Test deposit , balance:" + account.getBalance());
    }
    
       @Test
    public void testOnewithdraw(){
        account.withdraw(20);
        Assert.assertEquals("Test withdraw",account.getBalance(),balance,20);
        System.out.println("Test withdraw , balance:" + account.getBalance());
    } 
    
        @Test
    public void testManywithdraw(){
        account.withdraw(20);
        account.withdraw(10);
        Assert.assertEquals("Test many withdraw",account.getBalance(),balance,30);
        System.out.println("Test withdraw , balance:" + account.getBalance());
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Account.main(args);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}

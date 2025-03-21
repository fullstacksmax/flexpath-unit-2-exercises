import org.example.Account;
import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTests {
    @Test
    void TestBalance() {
        var balance = new Account(20.0);
        assertEquals(20, balance.getBalance());
    }

    @Test
    void TestDeposit() {
        var balance = new Account(20.0);
        balance.deposit(10.0);
        assertEquals(30.0,balance.getBalance());
    }
    @Test
    void TestWithdrawal() {
        var balance = new Account(20.0);
        balance.withdraw(10.0);
        assertEquals(10.0,balance.getBalance());
    }
    @Test
    void TestWithdrawAndDeposit() {
        var balance = new Account(20.0);
        balance.deposit(100.0);
        assertEquals(120.0, balance.getBalance());
        balance.withdraw(20.0);
        assertEquals(100.0, balance.getBalance());

    }
    @Test
    void TestOverdraw() {
        var balance = new Account(20.0);
        assertTrue(balance.withdraw(20.0));
        assertFalse(balance.withdraw(30.0));


    }
}

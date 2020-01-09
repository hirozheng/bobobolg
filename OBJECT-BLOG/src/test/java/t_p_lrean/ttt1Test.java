package t_p_lrean;

import java.util.List;

import static org.junit.Assert.*;

public class ttt1Test {
    @org.junit.Test
    public void teee() throws Exception {
        ttt1 ttt1 = new ttt1();
        List teee = ttt1.teee();
        for (Object student :teee)
        {
            System.out.println(student.toString());
        }
    }
}
import org.junit.*;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class RealtorLogImplSpec {
//
//    @Test
//    public void shouldAddRealtorToEmptyLog() {
//        Realtor realtor = new Realtor(1234);
//        RealtorLog log = new RealtorLog(new ArrayList<Realtor>());
//
//        // ACT
//        log.add(realtor);
//
//        assertThat(log.getRealtorList(), contains(realtor));
//    }
//
//    @Test
//    public void shouldAddRealtorWhenListIsNull() {
//        Realtor realtor = new Realtor(1234);
//        RealtorLog log = new RealtorLog(null);
//
//        // ACT
//        log.add(realtor);
//
//        assertThat(log.getRealtorList(), contains(realtor));
//    }
//
    @Test
    public void canAddRealtorToMiddleOfSortedLog() {
        Realtor realtor1 = new Realtor(1);
        Realtor realtor3 = new Realtor(3);
        Realtor realtor5 = new Realtor(5);
        Realtor realtor7 = new Realtor(7);

        ArrayList<Realtor> realtorList = new ArrayList<Realtor>();
        realtorList.add(realtor1);
        realtorList.add(realtor3);
        realtorList.add(realtor5);
        realtorList.add(realtor7);

        RealtorLog realtorLog = new RealtorLog(realtorList);

        Realtor realtor4 = new Realtor(4);

        // ACT
        realtorLog.add(realtor4);

        assertThat(realtorLog.getRealtorList(), contains(realtor1, realtor3, realtor4, realtor5, realtor7));
    }
    @Test
    public void canAddDuplicateValueAppropriately() {
        Realtor realtor1 = new Realtor(1);
        Realtor realtor3 = new Realtor(3);
        Realtor realtor5 = new Realtor(5);
        Realtor realtor7 = new Realtor(7);

        ArrayList<Realtor> realtorList = new ArrayList<Realtor>();
        realtorList.add(realtor1);
        realtorList.add(realtor3);
        realtorList.add(realtor5);
        realtorList.add(realtor7);

        RealtorLog realtorLog = new RealtorLog(realtorList);

        Realtor realtor3prime = new Realtor(3);

        // ACT
        realtorLog.add(realtor3prime);
        System.out.println(realtorList);

        assertThat(realtorLog.getRealtorList(), contains(realtor1, realtor3, realtor3prime, realtor5, realtor7));
    }

}

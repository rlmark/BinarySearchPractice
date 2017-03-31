import org.junit.*;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class RealtorLogImplSpec {

    @Test
    public void shouldAddRealtorToEmptyLog() {
        Realtor realtor = new Realtor(1234);
        RealtorLog log = new RealtorLog(new ArrayList<Realtor>());

        // ACT
        log.add(realtor);

        assertThat(log.getRealtorList(), contains(realtor));
    }

    @Test
    public void canAddRealtorToMiddleOfSortedLog() {

    }

}

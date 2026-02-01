package n3;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.experimental.theories.d;
import org.junit.experimental.theories.e;

/* loaded from: classes2.dex */
public class b extends e {
    @Override // org.junit.experimental.theories.e
    public List<PotentialAssignment> a(d dVar) {
        ArrayList arrayList = new ArrayList();
        for (int i4 : ((a) dVar.g(a.class)).ints()) {
            arrayList.add(PotentialAssignment.a("ints", Integer.valueOf(i4)));
        }
        return arrayList;
    }
}

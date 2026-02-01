package J1;

import com.google.firebase.components.C1792f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.components.j;
import com.google.firebase.components.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements l {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C1792f c1792f, g gVar) {
        try {
            c.b(str);
            return c1792f.g().a(gVar);
        } finally {
            c.a();
        }
    }

    @Override // com.google.firebase.components.l
    public List<C1792f<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C1792f<?> c1792f : componentRegistrar.getComponents()) {
            final String h4 = c1792f.h();
            if (h4 != null) {
                c1792f = c1792f.v(new j() { // from class: J1.a
                    @Override // com.google.firebase.components.j
                    public final Object a(g gVar) {
                        Object c4;
                        c4 = b.c(h4, c1792f, gVar);
                        return c4;
                    }
                });
            }
            arrayList.add(c1792f);
        }
        return arrayList;
    }
}

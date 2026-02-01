package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Map<String, Integer> f15477a = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean a(@l3.d String name, int i4) {
        int i5;
        kotlin.jvm.internal.F.p(name, "name");
        Integer num = this.f15477a.get(name);
        boolean z3 = false;
        if (num != null) {
            i5 = num.intValue();
        } else {
            i5 = 0;
        }
        if ((i5 & i4) != 0) {
            z3 = true;
        }
        this.f15477a.put(name, Integer.valueOf(i4 | i5));
        return !z3;
    }
}

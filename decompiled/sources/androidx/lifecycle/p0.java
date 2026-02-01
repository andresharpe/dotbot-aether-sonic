package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Map<String, j0> f15699a = new LinkedHashMap();

    public final void a() {
        Iterator<j0> it = this.f15699a.values().iterator();
        while (it.hasNext()) {
            it.next().p();
        }
        this.f15699a.clear();
    }

    @l3.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final j0 b(@l3.d String key) {
        kotlin.jvm.internal.F.p(key, "key");
        return this.f15699a.get(key);
    }

    @l3.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> c() {
        return new HashSet(this.f15699a.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void d(@l3.d String key, @l3.d j0 viewModel) {
        kotlin.jvm.internal.F.p(key, "key");
        kotlin.jvm.internal.F.p(viewModel, "viewModel");
        j0 put = this.f15699a.put(key, viewModel);
        if (put != null) {
            put.s();
        }
    }
}

package androidx.fragment.app;

import androidx.lifecycle.p0;
import java.util.Collection;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private final Collection<Fragment> f15350a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private final Map<String, t> f15351b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private final Map<String, p0> f15352c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(@androidx.annotation.P Collection<Fragment> collection, @androidx.annotation.P Map<String, t> map, @androidx.annotation.P Map<String, p0> map2) {
        this.f15350a = collection;
        this.f15351b = map;
        this.f15352c = map2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Map<String, t> a() {
        return this.f15351b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Collection<Fragment> b() {
        return this.f15350a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public Map<String, p0> c() {
        return this.f15352c;
    }

    boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f15350a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}

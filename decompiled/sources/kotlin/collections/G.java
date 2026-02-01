package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class G implements Map, Serializable, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    public static final G f51832E = new G();

    /* renamed from: F, reason: collision with root package name */
    private static final long f51833F = 8246714829545688274L;

    private G() {
    }

    private final Object m() {
        return f51832E;
    }

    public boolean c(@l3.d Void value) {
        kotlin.jvm.internal.F.p(value, "value");
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(@l3.e Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return c((Void) obj);
    }

    @Override // java.util.Map
    @l3.e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void get(@l3.e Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return h();
    }

    @Override // java.util.Map
    public boolean equals(@l3.e Object obj) {
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @l3.d
    public Set<Map.Entry> h() {
        return EmptySet.f51829E;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @l3.d
    public Set<Object> i() {
        return EmptySet.f51829E;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    public int j() {
        return 0;
    }

    @l3.d
    public Collection k() {
        return EmptyList.f51827E;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return i();
    }

    public Void l(Object obj, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return j();
    }

    @l3.d
    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return k();
    }
}

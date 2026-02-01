package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.P
    private final Map<String, Object> f15655E;

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.P
    private final Set<Closeable> f15656F;

    /* renamed from: G, reason: collision with root package name */
    private volatile boolean f15657G;

    public j0() {
        this.f15655E = new HashMap();
        this.f15656F = new LinkedHashSet();
        this.f15657G = false;
    }

    private static void q(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public void o(@androidx.annotation.N Closeable closeable) {
        Set<Closeable> set = this.f15656F;
        if (set != null) {
            synchronized (set) {
                this.f15656F.add(closeable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.K
    public final void p() {
        this.f15657G = true;
        Map<String, Object> map = this.f15655E;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator<Object> it = this.f15655E.values().iterator();
                    while (it.hasNext()) {
                        q(it.next());
                    }
                } finally {
                }
            }
        }
        Set<Closeable> set = this.f15656F;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator<Closeable> it2 = this.f15656F.iterator();
                    while (it2.hasNext()) {
                        q(it2.next());
                    }
                } finally {
                }
            }
        }
        s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T r(String str) {
        T t3;
        Map<String, Object> map = this.f15655E;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t3 = (T) this.f15655E.get(str);
        }
        return t3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T t(String str, T t3) {
        Object obj;
        synchronized (this.f15655E) {
            try {
                obj = this.f15655E.get(str);
                if (obj == 0) {
                    this.f15655E.put(str, t3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            t3 = obj;
        }
        if (this.f15657G) {
            q(t3);
        }
        return t3;
    }

    public j0(@androidx.annotation.N Closeable... closeableArr) {
        this.f15655E = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f15656F = linkedHashSet;
        this.f15657G = false;
        linkedHashSet.addAll(Arrays.asList(closeableArr));
    }
}

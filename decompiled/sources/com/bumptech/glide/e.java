package com.bumptech.glide;

import androidx.annotation.P;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, b> f25469a;

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, b> f25470a = new HashMap();

        a b(b bVar) {
            this.f25470a.put(bVar.getClass(), bVar);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public e c() {
            return new e(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a d(b bVar, boolean z3) {
            if (z3) {
                b(bVar);
            } else {
                this.f25470a.remove(bVar.getClass());
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
    }

    e(a aVar) {
        this.f25469a = Collections.unmodifiableMap(new HashMap(aVar.f25470a));
    }

    @P
    <T extends b> T a(Class<T> cls) {
        return (T) this.f25469a.get(cls);
    }

    public boolean b(Class<? extends b> cls) {
        return this.f25469a.containsKey(cls);
    }
}

package com.bumptech.glide.provider;

import androidx.annotation.N;
import com.bumptech.glide.load.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f26715a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f26716b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f26717a;

        /* renamed from: b, reason: collision with root package name */
        final Class<R> f26718b;

        /* renamed from: c, reason: collision with root package name */
        final g<T, R> f26719c;

        public a(@N Class<T> cls, @N Class<R> cls2, g<T, R> gVar) {
            this.f26717a = cls;
            this.f26718b = cls2;
            this.f26719c = gVar;
        }

        public boolean a(@N Class<?> cls, @N Class<?> cls2) {
            if (this.f26717a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f26718b)) {
                return true;
            }
            return false;
        }
    }

    @N
    private synchronized List<a<?, ?>> c(@N String str) {
        List<a<?, ?>> list;
        try {
            if (!this.f26715a.contains(str)) {
                this.f26715a.add(str);
            }
            list = this.f26716b.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f26716b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized <T, R> void a(@N String str, @N g<T, R> gVar, @N Class<T> cls, @N Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, gVar));
    }

    @N
    public synchronized <T, R> List<g<T, R>> b(@N Class<T> cls, @N Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f26715a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f26716b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f26719c);
                    }
                }
            }
        }
        return arrayList;
    }

    @N
    public synchronized <T, R> List<Class<R>> d(@N Class<T> cls, @N Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f26715a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f26716b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f26718b)) {
                        arrayList.add(aVar.f26718b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void e(@N String str, @N g<T, R> gVar, @N Class<T> cls, @N Class<R> cls2) {
        c(str).add(0, new a<>(cls, cls2, gVar));
    }

    public synchronized void f(@N List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f26715a);
            this.f26715a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f26715a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f26715a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

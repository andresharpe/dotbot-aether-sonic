package com.airbnb.lottie;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private boolean f22016a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f22017b = new androidx.collection.c();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, com.airbnb.lottie.utils.h> f22018c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<androidx.core.util.q<String, Float>> f22019d = new a();

    /* loaded from: classes.dex */
    class a implements Comparator<androidx.core.util.q<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(androidx.core.util.q<String, Float> qVar, androidx.core.util.q<String, Float> qVar2) {
            float floatValue = qVar.f13026b.floatValue();
            float floatValue2 = qVar2.f13026b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f4);
    }

    public void a(b bVar) {
        this.f22017b.add(bVar);
    }

    public void b() {
        this.f22018c.clear();
    }

    public List<androidx.core.util.q<String, Float>> c() {
        if (!this.f22016a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f22018c.size());
        for (Map.Entry<String, com.airbnb.lottie.utils.h> entry : this.f22018c.entrySet()) {
            arrayList.add(new androidx.core.util.q(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.f22019d);
        return arrayList;
    }

    public void d() {
        if (!this.f22016a) {
            return;
        }
        List<androidx.core.util.q<String, Float>> c4 = c();
        Log.d(e.f21418b, "Render times:");
        for (int i4 = 0; i4 < c4.size(); i4++) {
            androidx.core.util.q<String, Float> qVar = c4.get(i4);
            Log.d(e.f21418b, String.format("\t\t%30s:%.2f", qVar.f13025a, qVar.f13026b));
        }
    }

    public void e(String str, float f4) {
        if (!this.f22016a) {
            return;
        }
        com.airbnb.lottie.utils.h hVar = this.f22018c.get(str);
        if (hVar == null) {
            hVar = new com.airbnb.lottie.utils.h();
            this.f22018c.put(str, hVar);
        }
        hVar.a(f4);
        if (str.equals("__container")) {
            Iterator<b> it = this.f22017b.iterator();
            while (it.hasNext()) {
                it.next().a(f4);
            }
        }
    }

    public void f(b bVar) {
        this.f22017b.remove(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z3) {
        this.f22016a = z3;
    }
}

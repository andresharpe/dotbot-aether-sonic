package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<Model> implements n<Model, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final n<com.bumptech.glide.load.model.g, InputStream> f26358a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final m<Model, com.bumptech.glide.load.model.g> f26359b;

    protected a(n<com.bumptech.glide.load.model.g, InputStream> nVar) {
        this(nVar, null);
    }

    private static List<com.bumptech.glide.load.c> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.bumptech.glide.load.model.g(it.next()));
        }
        return arrayList;
    }

    @Override // com.bumptech.glide.load.model.n
    @P
    public n.a<InputStream> b(@N Model model, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        com.bumptech.glide.load.model.g gVar;
        m<Model, com.bumptech.glide.load.model.g> mVar = this.f26359b;
        if (mVar != null) {
            gVar = mVar.b(model, i4, i5);
        } else {
            gVar = null;
        }
        if (gVar == null) {
            String f4 = f(model, i4, i5, fVar);
            if (TextUtils.isEmpty(f4)) {
                return null;
            }
            com.bumptech.glide.load.model.g gVar2 = new com.bumptech.glide.load.model.g(f4, e(model, i4, i5, fVar));
            m<Model, com.bumptech.glide.load.model.g> mVar2 = this.f26359b;
            if (mVar2 != null) {
                mVar2.c(model, i4, i5, gVar2);
            }
            gVar = gVar2;
        }
        List<String> d4 = d(model, i4, i5, fVar);
        n.a<InputStream> b4 = this.f26358a.b(gVar, i4, i5, fVar);
        if (b4 != null && !d4.isEmpty()) {
            return new n.a<>(b4.f26326a, c(d4), b4.f26328c);
        }
        return b4;
    }

    protected List<String> d(Model model, int i4, int i5, com.bumptech.glide.load.f fVar) {
        return Collections.emptyList();
    }

    @P
    protected com.bumptech.glide.load.model.h e(Model model, int i4, int i5, com.bumptech.glide.load.f fVar) {
        return com.bumptech.glide.load.model.h.f26304b;
    }

    protected abstract String f(Model model, int i4, int i5, com.bumptech.glide.load.f fVar);

    protected a(n<com.bumptech.glide.load.model.g, InputStream> nVar, @P m<Model, com.bumptech.glide.load.model.g> mVar) {
        this.f26358a = nVar;
        this.f26359b = mVar;
    }
}

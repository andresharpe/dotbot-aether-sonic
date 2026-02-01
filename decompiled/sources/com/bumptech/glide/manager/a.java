package com.bumptech.glide.manager;

import androidx.annotation.N;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class a implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Set<m> f26663a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private boolean f26664b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26665c;

    @Override // com.bumptech.glide.manager.l
    public void a(@N m mVar) {
        this.f26663a.add(mVar);
        if (this.f26665c) {
            mVar.d();
        } else if (this.f26664b) {
            mVar.b();
        } else {
            mVar.a();
        }
    }

    @Override // com.bumptech.glide.manager.l
    public void b(@N m mVar) {
        this.f26663a.remove(mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f26665c = true;
        Iterator it = com.bumptech.glide.util.n.k(this.f26663a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f26664b = true;
        Iterator it = com.bumptech.glide.util.n.k(this.f26663a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f26664b = false;
        Iterator it = com.bumptech.glide.util.n.k(this.f26663a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).a();
        }
    }
}

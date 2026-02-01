package com.google.android.gms.common.data;

import androidx.annotation.N;
import com.google.android.gms.common.data.d;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements d, d.a {

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f28530a = new HashSet<>();

    @Override // com.google.android.gms.common.data.d
    public void a(int i4, int i5) {
        Iterator<d> it = this.f28530a.iterator();
        while (it.hasNext()) {
            it.next().a(i4, i5);
        }
    }

    @Override // com.google.android.gms.common.data.d
    public void b(int i4, int i5, int i6) {
        Iterator<d> it = this.f28530a.iterator();
        while (it.hasNext()) {
            it.next().b(i4, i5, i6);
        }
    }

    @Override // com.google.android.gms.common.data.d
    public void c(int i4, int i5) {
        Iterator<d> it = this.f28530a.iterator();
        while (it.hasNext()) {
            it.next().c(i4, i5);
        }
    }

    @Override // com.google.android.gms.common.data.d
    public void d(int i4, int i5) {
        Iterator<d> it = this.f28530a.iterator();
        while (it.hasNext()) {
            it.next().d(i4, i5);
        }
    }

    @Override // com.google.android.gms.common.data.d.a
    public void e(@N d dVar) {
        this.f28530a.remove(dVar);
    }

    @Override // com.google.android.gms.common.data.d.a
    public void f(@N d dVar) {
        this.f28530a.add(dVar);
    }

    @Override // com.google.android.gms.common.data.d
    public void g() {
        Iterator<d> it = this.f28530a.iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    public void h() {
        this.f28530a.clear();
    }

    public boolean i() {
        if (!this.f28530a.isEmpty()) {
            return true;
        }
        return false;
    }
}

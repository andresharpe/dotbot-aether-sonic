package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.h0;
import com.google.android.material.internal.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@h0
/* renamed from: com.google.android.material.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1780a<T extends j<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, T> f32532a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set<Integer> f32533b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private b f32534c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32535d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32536e;

    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0287a implements j.a<T> {
        C0287a() {
        }

        @Override // com.google.android.material.internal.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(T t3, boolean z3) {
            if (z3) {
                if (!C1780a.this.g(t3)) {
                    return;
                }
            } else {
                C1780a c1780a = C1780a.this;
                if (!c1780a.t(t3, c1780a.f32536e)) {
                    return;
                }
            }
            C1780a.this.n();
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(@N Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(@N j<T> jVar) {
        int id = jVar.getId();
        if (this.f32533b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t3 = this.f32532a.get(Integer.valueOf(k()));
        if (t3 != null) {
            t(t3, false);
        }
        boolean add = this.f32533b.add(Integer.valueOf(id));
        if (!jVar.isChecked()) {
            jVar.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        b bVar = this.f32534c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(@N j<T> jVar, boolean z3) {
        int id = jVar.getId();
        if (!this.f32533b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z3 && this.f32533b.size() == 1 && this.f32533b.contains(Integer.valueOf(id))) {
            jVar.setChecked(true);
            return false;
        }
        boolean remove = this.f32533b.remove(Integer.valueOf(id));
        if (jVar.isChecked()) {
            jVar.setChecked(false);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(T t3) {
        this.f32532a.put(Integer.valueOf(t3.getId()), t3);
        if (t3.isChecked()) {
            g(t3);
        }
        t3.setInternalOnCheckedChangeListener(new C0287a());
    }

    public void f(@androidx.annotation.D int i4) {
        T t3 = this.f32532a.get(Integer.valueOf(i4));
        if (t3 != null && g(t3)) {
            n();
        }
    }

    public void h() {
        boolean z3 = !this.f32533b.isEmpty();
        Iterator<T> it = this.f32532a.values().iterator();
        while (it.hasNext()) {
            t(it.next(), false);
        }
        if (z3) {
            n();
        }
    }

    @N
    public Set<Integer> i() {
        return new HashSet(this.f32533b);
    }

    @N
    public List<Integer> j(@N ViewGroup viewGroup) {
        Set<Integer> i4 = i();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if ((childAt instanceof j) && i4.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @androidx.annotation.D
    public int k() {
        if (this.f32535d && !this.f32533b.isEmpty()) {
            return this.f32533b.iterator().next().intValue();
        }
        return -1;
    }

    public boolean l() {
        return this.f32536e;
    }

    public boolean m() {
        return this.f32535d;
    }

    public void o(T t3) {
        t3.setInternalOnCheckedChangeListener(null);
        this.f32532a.remove(Integer.valueOf(t3.getId()));
        this.f32533b.remove(Integer.valueOf(t3.getId()));
    }

    public void p(@P b bVar) {
        this.f32534c = bVar;
    }

    public void q(boolean z3) {
        this.f32536e = z3;
    }

    public void r(boolean z3) {
        if (this.f32535d != z3) {
            this.f32535d = z3;
            h();
        }
    }

    public void s(@androidx.annotation.D int i4) {
        T t3 = this.f32532a.get(Integer.valueOf(i4));
        if (t3 != null && t(t3, this.f32536e)) {
            n();
        }
    }
}

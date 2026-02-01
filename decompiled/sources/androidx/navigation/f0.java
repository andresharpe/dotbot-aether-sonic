package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.H0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k0;
import kotlinx.coroutines.flow.C2284k;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final ReentrantLock f16424a = new ReentrantLock(true);

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.flow.t<List<r>> f16425b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.flow.t<Set<r>> f16426c;

    /* renamed from: d, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private boolean f16427d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.flow.H<List<r>> f16428e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.flow.H<Set<r>> f16429f;

    public f0() {
        List H3;
        Set k4;
        H3 = CollectionsKt__CollectionsKt.H();
        kotlinx.coroutines.flow.t<List<r>> a4 = kotlinx.coroutines.flow.J.a(H3);
        this.f16425b = a4;
        k4 = kotlin.collections.j0.k();
        kotlinx.coroutines.flow.t<Set<r>> a5 = kotlinx.coroutines.flow.J.a(k4);
        this.f16426c = a5;
        this.f16428e = C2284k.m(a4);
        this.f16429f = C2284k.m(a5);
    }

    @l3.d
    public abstract r a(@l3.d F f4, @l3.e Bundle bundle);

    @l3.d
    public final kotlinx.coroutines.flow.H<List<r>> b() {
        return this.f16428e;
    }

    @l3.d
    public final kotlinx.coroutines.flow.H<Set<r>> c() {
        return this.f16429f;
    }

    public final boolean d() {
        return this.f16427d;
    }

    public void e(@l3.d r entry) {
        Set<r> y3;
        kotlin.jvm.internal.F.p(entry, "entry");
        kotlinx.coroutines.flow.t<Set<r>> tVar = this.f16426c;
        y3 = k0.y(tVar.getValue(), entry);
        tVar.setValue(y3);
    }

    @InterfaceC0566i
    public void f(@l3.d r backStackEntry) {
        Object p32;
        List q4;
        List<r> E4;
        kotlin.jvm.internal.F.p(backStackEntry, "backStackEntry");
        kotlinx.coroutines.flow.t<List<r>> tVar = this.f16425b;
        List<r> value = tVar.getValue();
        p32 = kotlin.collections.D.p3(this.f16425b.getValue());
        q4 = kotlin.collections.D.q4(value, p32);
        E4 = kotlin.collections.D.E4(q4, backStackEntry);
        tVar.setValue(E4);
    }

    public void g(@l3.d r popUpTo, boolean z3) {
        kotlin.jvm.internal.F.p(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f16424a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.t<List<r>> tVar = this.f16425b;
            List<r> value = tVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (!(!kotlin.jvm.internal.F.g((r) obj, popUpTo))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            tVar.setValue(arrayList);
            H0 h02 = H0.f51801a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void h(@l3.d r popUpTo, boolean z3) {
        Set<r> D3;
        r rVar;
        Set<r> D4;
        kotlin.jvm.internal.F.p(popUpTo, "popUpTo");
        kotlinx.coroutines.flow.t<Set<r>> tVar = this.f16426c;
        D3 = k0.D(tVar.getValue(), popUpTo);
        tVar.setValue(D3);
        List<r> value = this.f16428e.getValue();
        ListIterator<r> listIterator = value.listIterator(value.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                rVar = listIterator.previous();
                r rVar2 = rVar;
                if (!kotlin.jvm.internal.F.g(rVar2, popUpTo) && b().getValue().lastIndexOf(rVar2) < b().getValue().lastIndexOf(popUpTo)) {
                    break;
                }
            } else {
                rVar = null;
                break;
            }
        }
        r rVar3 = rVar;
        if (rVar3 != null) {
            kotlinx.coroutines.flow.t<Set<r>> tVar2 = this.f16426c;
            D4 = k0.D(tVar2.getValue(), rVar3);
            tVar2.setValue(D4);
        }
        g(popUpTo, z3);
    }

    public void i(@l3.d r backStackEntry) {
        List<r> E4;
        kotlin.jvm.internal.F.p(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f16424a;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.flow.t<List<r>> tVar = this.f16425b;
            E4 = kotlin.collections.D.E4(tVar.getValue(), backStackEntry);
            tVar.setValue(E4);
            H0 h02 = H0.f51801a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j(@l3.d r backStackEntry) {
        Object v3;
        Set<r> D3;
        Set<r> D4;
        kotlin.jvm.internal.F.p(backStackEntry, "backStackEntry");
        v3 = kotlin.collections.D.v3(this.f16428e.getValue());
        r rVar = (r) v3;
        if (rVar != null) {
            kotlinx.coroutines.flow.t<Set<r>> tVar = this.f16426c;
            D4 = k0.D(tVar.getValue(), rVar);
            tVar.setValue(D4);
        }
        kotlinx.coroutines.flow.t<Set<r>> tVar2 = this.f16426c;
        D3 = k0.D(tVar2.getValue(), backStackEntry);
        tVar2.setValue(D3);
        i(backStackEntry);
    }

    public final void k(boolean z3) {
        this.f16427d = z3;
    }
}

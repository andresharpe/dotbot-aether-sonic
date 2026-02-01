package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.c0;
import com.google.firebase.remoteconfig.u;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C2108v;

@c0.b("navigation")
@kotlin.E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/navigation/N;", "Landroidx/navigation/c0;", "Landroidx/navigation/J;", "Landroidx/navigation/r;", "entry", "Landroidx/navigation/T;", "navOptions", "Landroidx/navigation/c0$a;", "navigatorExtras", "Lkotlin/H0;", "m", "(Landroidx/navigation/r;Landroidx/navigation/T;Landroidx/navigation/c0$a;)V", "l", "()Landroidx/navigation/J;", "", u.c.f37791i0, "e", "(Ljava/util/List;Landroidx/navigation/T;Landroidx/navigation/c0$a;)V", "Landroidx/navigation/d0;", "c", "Landroidx/navigation/d0;", "navigatorProvider", "<init>", "(Landroidx/navigation/d0;)V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class N extends c0<J> {

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final d0 f16314c;

    public N(@l3.d d0 navigatorProvider) {
        kotlin.jvm.internal.F.p(navigatorProvider, "navigatorProvider");
        this.f16314c = navigatorProvider;
    }

    private final void m(r rVar, T t3, c0.a aVar) {
        F V3;
        List<r> k4;
        J j4 = (J) rVar.g();
        Bundle e4 = rVar.e();
        int c02 = j4.c0();
        String d02 = j4.d0();
        if (c02 == 0 && d02 == null) {
            throw new IllegalStateException(kotlin.jvm.internal.F.C("no start destination defined via app:startDestination for ", j4.q()).toString());
        }
        if (d02 != null) {
            V3 = j4.X(d02, false);
        } else {
            V3 = j4.V(c02, false);
        }
        if (V3 != null) {
            c0 f4 = this.f16314c.f(V3.v());
            k4 = C2108v.k(b().a(V3, V3.k(e4)));
            f4.e(k4, t3, aVar);
        } else {
            throw new IllegalArgumentException("navigation destination " + j4.a0() + " is not a direct child of this NavGraph");
        }
    }

    @Override // androidx.navigation.c0
    public void e(@l3.d List<r> entries, @l3.e T t3, @l3.e c0.a aVar) {
        kotlin.jvm.internal.F.p(entries, "entries");
        Iterator<r> it = entries.iterator();
        while (it.hasNext()) {
            m(it.next(), t3, aVar);
        }
    }

    @Override // androidx.navigation.c0
    @l3.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public J a() {
        return new J(this);
    }
}

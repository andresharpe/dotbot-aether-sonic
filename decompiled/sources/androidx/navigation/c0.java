package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.InterfaceC0566i;
import androidx.navigation.F;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.H0;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes.dex */
public abstract class c0<D extends F> {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private f0 f16409a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16410b;

    /* loaded from: classes.dex */
    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @P2.c(AnnotationRetention.RUNTIME)
    @Retention(RetentionPolicy.RUNTIME)
    @P2.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    /* loaded from: classes.dex */
    public @interface b {
        String value();
    }

    /* loaded from: classes.dex */
    static final class c extends Lambda implements X2.l<r, r> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ c0<D> f16411F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ T f16412G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ a f16413H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c0<D> c0Var, T t3, a aVar) {
            super(1);
            this.f16411F = c0Var;
            this.f16412G = t3;
            this.f16413H = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X2.l
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r C(@l3.d r backStackEntry) {
            F d4;
            kotlin.jvm.internal.F.p(backStackEntry, "backStackEntry");
            F g4 = backStackEntry.g();
            if (!(g4 instanceof F)) {
                g4 = null;
            }
            if (g4 != null && (d4 = this.f16411F.d(g4, backStackEntry.e(), this.f16412G, this.f16413H)) != null) {
                if (!kotlin.jvm.internal.F.g(d4, g4)) {
                    return this.f16411F.b().a(d4, d4.k(backStackEntry.e()));
                }
                return backStackEntry;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class d extends Lambda implements X2.l<U, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f16414F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(U u3) {
            c(u3);
            return H0.f51801a;
        }

        public final void c(@l3.d U navOptions) {
            kotlin.jvm.internal.F.p(navOptions, "$this$navOptions");
            navOptions.m(true);
        }
    }

    @l3.d
    public abstract D a();

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final f0 b() {
        f0 f0Var = this.f16409a;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean c() {
        return this.f16410b;
    }

    @l3.e
    public F d(@l3.d D destination, @l3.e Bundle bundle, @l3.e T t3, @l3.e a aVar) {
        kotlin.jvm.internal.F.p(destination, "destination");
        return destination;
    }

    public void e(@l3.d List<r> entries, @l3.e T t3, @l3.e a aVar) {
        kotlin.sequences.m A12;
        kotlin.sequences.m k12;
        kotlin.sequences.m v02;
        kotlin.jvm.internal.F.p(entries, "entries");
        A12 = kotlin.collections.D.A1(entries);
        k12 = SequencesKt___SequencesKt.k1(A12, new c(this, t3, aVar));
        v02 = SequencesKt___SequencesKt.v0(k12);
        Iterator it = v02.iterator();
        while (it.hasNext()) {
            b().i((r) it.next());
        }
    }

    @InterfaceC0566i
    public void f(@l3.d f0 state) {
        kotlin.jvm.internal.F.p(state, "state");
        this.f16409a = state;
        this.f16410b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(@l3.d r backStackEntry) {
        kotlin.jvm.internal.F.p(backStackEntry, "backStackEntry");
        F g4 = backStackEntry.g();
        if (!(g4 instanceof F)) {
            g4 = null;
        }
        if (g4 == null) {
            return;
        }
        d(g4, null, V.a(d.f16414F), null);
        b().f(backStackEntry);
    }

    public void h(@l3.d Bundle savedState) {
        kotlin.jvm.internal.F.p(savedState, "savedState");
    }

    @l3.e
    public Bundle i() {
        return null;
    }

    public void j(@l3.d r popUpTo, boolean z3) {
        kotlin.jvm.internal.F.p(popUpTo, "popUpTo");
        List<r> value = b().b().getValue();
        if (value.contains(popUpTo)) {
            ListIterator<r> listIterator = value.listIterator(value.size());
            r rVar = null;
            while (k()) {
                rVar = listIterator.previous();
                if (kotlin.jvm.internal.F.g(rVar, popUpTo)) {
                    break;
                }
            }
            if (rVar != null) {
                b().g(rVar, z3);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
    }

    public boolean k() {
        return true;
    }
}

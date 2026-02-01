package androidx.activity.contextaware;

import X2.l;
import android.content.Context;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.r;
import l3.d;
import l3.e;

/* loaded from: classes.dex */
public final class ContextAwareKt {

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<R> f4487a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Context, R> f4488b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC2333q<? super R> interfaceC2333q, l<? super Context, ? extends R> lVar) {
            this.f4487a = interfaceC2333q;
            this.f4488b = lVar;
        }

        @Override // androidx.activity.contextaware.c
        public void a(@d Context context) {
            Object b4;
            F.p(context, "context");
            kotlin.coroutines.c cVar = this.f4487a;
            l<Context, R> lVar = this.f4488b;
            try {
                Result.a aVar = Result.f51807F;
                b4 = Result.b(lVar.C(context));
            } catch (Throwable th) {
                Result.a aVar2 = Result.f51807F;
                b4 = Result.b(W.a(th));
            }
            cVar.x(b4);
        }
    }

    @e
    public static final <R> Object a(@d androidx.activity.contextaware.a aVar, @d l<? super Context, ? extends R> lVar, @d kotlin.coroutines.c<? super R> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        Context m4 = aVar.m();
        if (m4 == null) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            r rVar = new r(e4, 1);
            rVar.T();
            a aVar2 = new a(rVar, lVar);
            aVar.z(aVar2);
            rVar.u(new ContextAwareKt$withContextAvailable$2$1(aVar, aVar2));
            Object z3 = rVar.z();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                f.c(cVar);
            }
            return z3;
        }
        return lVar.C(m4);
    }

    private static final <R> Object b(androidx.activity.contextaware.a aVar, l<? super Context, ? extends R> lVar, kotlin.coroutines.c<? super R> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        Context m4 = aVar.m();
        if (m4 != null) {
            return lVar.C(m4);
        }
        C.e(0);
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r rVar = new r(e4, 1);
        rVar.T();
        a aVar2 = new a(rVar, lVar);
        aVar.z(aVar2);
        rVar.u(new ContextAwareKt$withContextAvailable$2$1(aVar, aVar2));
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            f.c(cVar);
        }
        C.e(1);
        return z3;
    }
}

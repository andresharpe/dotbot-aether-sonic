package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.H0;
import kotlin.Result;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.H;
import kotlinx.coroutines.flow.internal.c;

/* loaded from: classes2.dex */
public abstract class a<S extends c<?>> {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private S[] f54127E;

    /* renamed from: F, reason: collision with root package name */
    private int f54128F;

    /* renamed from: G, reason: collision with root package name */
    private int f54129G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private w f54130H;

    public static final /* synthetic */ int d(a aVar) {
        return aVar.f54128F;
    }

    public static final /* synthetic */ c[] e(a aVar) {
        return aVar.f54127E;
    }

    protected static /* synthetic */ void r() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final S g() {
        S s4;
        w wVar;
        synchronized (this) {
            try {
                S[] sArr = this.f54127E;
                if (sArr == null) {
                    sArr = m(2);
                    this.f54127E = sArr;
                } else if (this.f54128F >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    F.o(copyOf, "copyOf(this, newSize)");
                    this.f54127E = (S[]) ((c[]) copyOf);
                    sArr = (S[]) ((c[]) copyOf);
                }
                int i4 = this.f54129G;
                do {
                    s4 = sArr[i4];
                    if (s4 == null) {
                        s4 = l();
                        sArr[i4] = s4;
                    }
                    i4++;
                    if (i4 >= sArr.length) {
                        i4 = 0;
                    }
                } while (!s4.a(this));
                this.f54129G = i4;
                this.f54128F++;
                wVar = this.f54130H;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wVar != null) {
            wVar.h0(1);
        }
        return s4;
    }

    @l3.d
    public final H<Integer> k() {
        w wVar;
        synchronized (this) {
            wVar = this.f54130H;
            if (wVar == null) {
                wVar = new w(this.f54128F);
                this.f54130H = wVar;
            }
        }
        return wVar;
    }

    @l3.d
    protected abstract S l();

    @l3.d
    protected abstract S[] m(int i4);

    protected final void n(@l3.d X2.l<? super S, H0> lVar) {
        c[] cVarArr;
        if (this.f54128F != 0 && (cVarArr = this.f54127E) != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    lVar.C(cVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(@l3.d S s4) {
        w wVar;
        int i4;
        kotlin.coroutines.c<H0>[] b4;
        synchronized (this) {
            try {
                int i5 = this.f54128F - 1;
                this.f54128F = i5;
                wVar = this.f54130H;
                if (i5 == 0) {
                    this.f54129G = 0;
                }
                b4 = s4.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.c<H0> cVar : b4) {
            if (cVar != null) {
                Result.a aVar = Result.f51807F;
                cVar.x(Result.b(H0.f51801a));
            }
        }
        if (wVar != null) {
            wVar.h0(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int p() {
        return this.f54128F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.e
    public final S[] q() {
        return this.f54127E;
    }
}

package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;

@kotlin.E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", androidx.exifinterface.media.a.f5, "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "block", "completion", "Lkotlin/H0;", "e", "(LX2/l;Lkotlin/coroutines/c;)V", "R", "Lkotlin/Function2;", "Lkotlin/u;", "receiver", "f", "(LX2/p;Ljava/lang/Object;Lkotlin/coroutines/c;)V", "", "g", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52917a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
            f52917a = iArr;
        }
    }

    @G0
    public static /* synthetic */ void i() {
    }

    @G0
    public final <T> void e(@l3.d X2.l<? super kotlin.coroutines.c<? super T>, ? extends Object> lVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        int i4 = a.f52917a[ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    j3.b.a(lVar, cVar);
                    return;
                }
            }
            kotlin.coroutines.e.h(lVar, cVar);
            return;
        }
        j3.a.c(lVar, cVar);
    }

    @G0
    public final <R, T> void f(@l3.d X2.p<? super R, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, R r4, @l3.d kotlin.coroutines.c<? super T> cVar) {
        int i4 = a.f52917a[ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    j3.b.b(pVar, r4, cVar);
                    return;
                }
            }
            kotlin.coroutines.e.i(pVar, r4, cVar);
            return;
        }
        j3.a.f(pVar, r4, cVar, null, 4, null);
    }

    public final boolean g() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }
}

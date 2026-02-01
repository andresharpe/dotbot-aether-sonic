package kotlinx.coroutines.flow.internal;

import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.U;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;
import kotlinx.coroutines.internal.N;

/* loaded from: classes2.dex */
public final class SafeCollector_commonKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements X2.p<Integer, f.b, Integer> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ SafeCollector<?> f54122F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SafeCollector<?> safeCollector) {
            super(2);
            this.f54122F = safeCollector;
        }

        @l3.d
        public final Integer c(int i4, @l3.d f.b bVar) {
            int i5;
            f.c<?> key = bVar.getKey();
            f.b a4 = this.f54122F.f54117I.a(key);
            if (key != L0.f52941w) {
                if (bVar != a4) {
                    i5 = Integer.MIN_VALUE;
                } else {
                    i5 = i4 + 1;
                }
                return Integer.valueOf(i5);
            }
            L0 l02 = (L0) a4;
            L0 b4 = SafeCollector_commonKt.b((L0) bVar, l02);
            if (b4 == l02) {
                if (l02 != null) {
                    i4++;
                }
                return Integer.valueOf(i4);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b4 + ", expected child of " + l02 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ Integer c0(Integer num, f.b bVar) {
            return c(num.intValue(), bVar);
        }
    }

    @W2.i(name = "checkContext")
    public static final void a(@l3.d SafeCollector<?> safeCollector, @l3.d kotlin.coroutines.f fVar) {
        if (((Number) fVar.i(0, new a(safeCollector))).intValue() == safeCollector.f54118J) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.f54117I + ",\n\t\tbut emission happened in " + fVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @l3.e
    public static final L0 b(@l3.e L0 l02, @l3.e L0 l03) {
        while (l02 != null) {
            if (l02 == l03) {
                return l02;
            }
            if (!(l02 instanceof N)) {
                return l02;
            }
            l02 = ((N) l02).J1();
        }
        return null;
    }

    @l3.d
    @U
    public static final <T> InterfaceC2282i<T> c(@InterfaceC2084c @l3.d X2.p<? super InterfaceC2283j<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar) {
        return new SafeCollector_commonKt$unsafeFlow$1(pVar);
    }
}

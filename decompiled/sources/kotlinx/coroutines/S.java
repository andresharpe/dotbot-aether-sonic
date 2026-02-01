package kotlinx.coroutines;

import kotlin.coroutines.f;
import kotlin.jvm.internal.C2197u;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* loaded from: classes2.dex */
public final class S extends kotlin.coroutines.a implements p1<String> {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    public static final a f52956G = new a(null);

    /* renamed from: F, reason: collision with root package name */
    private final long f52957F;

    /* loaded from: classes2.dex */
    public static final class a implements f.c<S> {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public S(long j4) {
        super(f52956G);
        this.f52957F = j4;
    }

    public static /* synthetic */ S j1(S s4, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = s4.f52957F;
        }
        return s4.i1(j4);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S) && this.f52957F == ((S) obj).f52957F;
    }

    public final long h1() {
        return this.f52957F;
    }

    public int hashCode() {
        return Long.hashCode(this.f52957F);
    }

    @l3.d
    public final S i1(long j4) {
        return new S(j4);
    }

    public final long k1() {
        return this.f52957F;
    }

    @Override // kotlinx.coroutines.p1
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void B0(@l3.d kotlin.coroutines.f fVar, @l3.d String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.p1
    @l3.d
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public String a1(@l3.d kotlin.coroutines.f fVar) {
        String str;
        int D3;
        T t3 = (T) fVar.a(T.f52972G);
        if (t3 == null || (str = t3.k1()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        D3 = kotlin.text.A.D3(name, " @", 0, false, 6, null);
        if (D3 < 0) {
            D3 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + D3 + 10);
        String substring = name.substring(0, D3);
        kotlin.jvm.internal.F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f52957F);
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    @l3.d
    public String toString() {
        return "CoroutineId(" + this.f52957F + ')';
    }
}

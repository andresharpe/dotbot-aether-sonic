package kotlin.coroutines;

import X2.p;
import java.io.Serializable;
import kotlin.E;
import kotlin.H0;
import kotlin.Y;
import kotlin.coroutines.f;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0015B\u0017\u0012\u0006\u0010'\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "h", "()I", "Lkotlin/coroutines/f$b;", "element", "", "e", "(Lkotlin/coroutines/f$b;)Z", "context", "g", "(Lkotlin/coroutines/CombinedContext;)Z", "", "l", "()Ljava/lang/Object;", androidx.exifinterface.media.a.U4, "Lkotlin/coroutines/f$c;", "key", "a", "(Lkotlin/coroutines/f$c;)Lkotlin/coroutines/f$b;", "R", "initial", "Lkotlin/Function2;", "operation", "i", "(Ljava/lang/Object;LX2/p;)Ljava/lang/Object;", com.harman.log.b.f47574c, "(Lkotlin/coroutines/f$c;)Lkotlin/coroutines/f;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/f;", "left", "F", "Lkotlin/coroutines/f$b;", "<init>", "(Lkotlin/coroutines/f;Lkotlin/coroutines/f$b;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@Y(version = "1.3")
@U({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
/* loaded from: classes2.dex */
public final class CombinedContext implements f, Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final f f52033E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final f.b f52034F;

    @U({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12720#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    /* loaded from: classes2.dex */
    private static final class a implements Serializable {

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        public static final C0461a f52035F = new C0461a(null);

        /* renamed from: G, reason: collision with root package name */
        private static final long f52036G = 0;

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final f[] f52037E;

        /* renamed from: kotlin.coroutines.CombinedContext$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0461a {
            public /* synthetic */ C0461a(C2197u c2197u) {
                this();
            }

            private C0461a() {
            }
        }

        public a(@l3.d f[] elements) {
            F.p(elements, "elements");
            this.f52037E = elements;
        }

        private final Object b() {
            f[] fVarArr = this.f52037E;
            f fVar = EmptyCoroutineContext.f52041E;
            for (f fVar2 : fVarArr) {
                fVar = fVar.A(fVar2);
            }
            return fVar;
        }

        @l3.d
        public final f[] a() {
            return this.f52037E;
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements p<String, f.b, String> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f52038F = new b();

        b() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String c0(@l3.d String acc, @l3.d f.b element) {
            F.p(acc, "acc");
            F.p(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements p<H0, f.b, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ f[] f52039F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f52040G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f[] fVarArr, Ref.IntRef intRef) {
            super(2);
            this.f52039F = fVarArr;
            this.f52040G = intRef;
        }

        public final void c(@l3.d H0 h02, @l3.d f.b element) {
            F.p(h02, "<anonymous parameter 0>");
            F.p(element, "element");
            f[] fVarArr = this.f52039F;
            Ref.IntRef intRef = this.f52040G;
            int i4 = intRef.f52299E;
            intRef.f52299E = i4 + 1;
            fVarArr[i4] = element;
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(H0 h02, f.b bVar) {
            c(h02, bVar);
            return H0.f51801a;
        }
    }

    public CombinedContext(@l3.d f left, @l3.d f.b element) {
        F.p(left, "left");
        F.p(element, "element");
        this.f52033E = left;
        this.f52034F = element;
    }

    private final boolean e(f.b bVar) {
        return F.g(a(bVar.getKey()), bVar);
    }

    private final boolean g(CombinedContext combinedContext) {
        while (e(combinedContext.f52034F)) {
            f fVar = combinedContext.f52033E;
            if (fVar instanceof CombinedContext) {
                combinedContext = (CombinedContext) fVar;
            } else {
                F.n(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return e((f.b) fVar);
            }
        }
        return false;
    }

    private final int h() {
        int i4 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            f fVar = combinedContext.f52033E;
            if (fVar instanceof CombinedContext) {
                combinedContext = (CombinedContext) fVar;
            } else {
                combinedContext = null;
            }
            if (combinedContext == null) {
                return i4;
            }
            i4++;
        }
    }

    private final Object l() {
        int h4 = h();
        f[] fVarArr = new f[h4];
        Ref.IntRef intRef = new Ref.IntRef();
        i(H0.f51801a, new c(fVarArr, intRef));
        if (intRef.f52299E == h4) {
            return new a(fVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public f A(@l3.d f fVar) {
        return f.a.a(this, fVar);
    }

    @Override // kotlin.coroutines.f
    @l3.e
    public <E extends f.b> E a(@l3.d f.c<E> key) {
        F.p(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e4 = (E) combinedContext.f52034F.a(key);
            if (e4 != null) {
                return e4;
            }
            f fVar = combinedContext.f52033E;
            if (fVar instanceof CombinedContext) {
                combinedContext = (CombinedContext) fVar;
            } else {
                return (E) fVar.a(key);
            }
        }
    }

    @Override // kotlin.coroutines.f
    @l3.d
    public f b(@l3.d f.c<?> key) {
        F.p(key, "key");
        if (this.f52034F.a(key) != null) {
            return this.f52033E;
        }
        f b4 = this.f52033E.b(key);
        if (b4 == this.f52033E) {
            return this;
        }
        if (b4 == EmptyCoroutineContext.f52041E) {
            return this.f52034F;
        }
        return new CombinedContext(b4, this.f52034F);
    }

    public boolean equals(@l3.e Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.h() != h() || !combinedContext.g(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f52033E.hashCode() + this.f52034F.hashCode();
    }

    @Override // kotlin.coroutines.f
    public <R> R i(R r4, @l3.d p<? super R, ? super f.b, ? extends R> operation) {
        F.p(operation, "operation");
        return operation.c0((Object) this.f52033E.i(r4, operation), this.f52034F);
    }

    @l3.d
    public String toString() {
        return '[' + ((String) i("", b.f52038F)) + ']';
    }
}

package kotlin.properties;

import X2.q;
import kotlin.H0;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f52417a = new a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    @U({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,73:1\n*E\n"})
    /* renamed from: kotlin.properties.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0468a<T> extends c<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q<n<?>, T, T, H0> f52418b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0468a(T t3, q<? super n<?>, ? super T, ? super T, H0> qVar) {
            super(t3);
            this.f52418b = qVar;
        }

        @Override // kotlin.properties.c
        protected void c(@l3.d n<?> property, T t3, T t4) {
            F.p(property, "property");
            this.f52418b.z(property, t3, t4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @U({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,73:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b<T> extends c<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q<n<?>, T, T, Boolean> f52419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t3, q<? super n<?>, ? super T, ? super T, Boolean> qVar) {
            super(t3);
            this.f52419b = qVar;
        }

        @Override // kotlin.properties.c
        protected boolean d(@l3.d n<?> property, T t3, T t4) {
            F.p(property, "property");
            return this.f52419b.z(property, t3, t4).booleanValue();
        }
    }

    private a() {
    }

    @l3.d
    public final <T> f<Object, T> a() {
        return new kotlin.properties.b();
    }

    @l3.d
    public final <T> f<Object, T> b(T t3, @l3.d q<? super n<?>, ? super T, ? super T, H0> onChange) {
        F.p(onChange, "onChange");
        return new C0468a(t3, onChange);
    }

    @l3.d
    public final <T> f<Object, T> c(T t3, @l3.d q<? super n<?>, ? super T, ? super T, Boolean> onChange) {
        F.p(onChange, "onChange");
        return new b(t3, onChange);
    }
}

package kotlin;

/* loaded from: classes2.dex */
class D extends C {
    @kotlin.internal.f
    private static final <T> T d(A<? extends T> a4, Object obj, kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.F.p(a4, "<this>");
        kotlin.jvm.internal.F.p(property, "property");
        return a4.getValue();
    }

    @l3.d
    public static final <T> A<T> e(T t3) {
        return new InitializedLazyImpl(t3);
    }
}

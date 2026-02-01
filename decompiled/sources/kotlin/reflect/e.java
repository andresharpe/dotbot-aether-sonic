package kotlin.reflect;

import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@W2.i(name = "KClasses")
@U({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
/* loaded from: classes2.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.h
    @l3.d
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final <T> T a(@l3.d d<T> dVar, @l3.e Object obj) {
        F.p(dVar, "<this>");
        if (dVar.g0(obj)) {
            F.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    @kotlin.internal.h
    @K0(markerClass = {kotlin.r.class})
    @Y(version = "1.4")
    public static final <T> T b(@l3.d d<T> dVar, @l3.e Object obj) {
        F.p(dVar, "<this>");
        if (dVar.g0(obj)) {
            F.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return obj;
        }
        return null;
    }
}

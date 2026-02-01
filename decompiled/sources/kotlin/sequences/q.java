package kotlin.sequences;

import java.util.Iterator;
import kotlin.H0;
import kotlin.InterfaceC2084c;
import kotlin.Y;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f52640a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f52641b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f52642c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f52643d = 3;

    /* renamed from: e, reason: collision with root package name */
    private static final int f52644e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f52645f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,680:1\n26#2:681\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.p f52646a;

        public a(X2.p pVar) {
            this.f52646a = pVar;
        }

        @Override // kotlin.sequences.m
        @l3.d
        public Iterator<T> iterator() {
            Iterator<T> a4;
            a4 = q.a(this.f52646a);
            return a4;
        }
    }

    @l3.d
    @Y(version = "1.3")
    public static <T> Iterator<T> a(@InterfaceC2084c @l3.d X2.p<? super o<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> block) {
        kotlin.coroutines.c<? super H0> c4;
        F.p(block, "block");
        n nVar = new n();
        c4 = IntrinsicsKt__IntrinsicsJvmKt.c(block, nVar, nVar);
        nVar.p(c4);
        return nVar;
    }

    @l3.d
    @Y(version = "1.3")
    public static <T> m<T> b(@InterfaceC2084c @l3.d X2.p<? super o<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> block) {
        F.p(block, "block");
        return new a(block);
    }
}

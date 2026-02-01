package kotlin.collections;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX WARN: Incorrect field signature: TK; */
@kotlin.E(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {androidx.exifinterface.media.a.f5, "", "K", "it", "", "c", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
@kotlin.jvm.internal.U({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,522:1\n*E\n"})
/* loaded from: classes2.dex */
public final class CollectionsKt__CollectionsKt$binarySearchBy$1<T> extends Lambda implements X2.l<T, Integer> {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.l<T, K> f51820F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ Comparable f51821G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX2/l<-TT;+TK;>;TK;)V */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(X2.l lVar, Comparable comparable) {
        super(1);
        this.f51820F = lVar;
        this.f51821G = comparable;
    }

    @Override // X2.l
    @l3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Integer C(T t3) {
        int l4;
        l4 = kotlin.comparisons.g.l((Comparable) this.f51820F.C(t3), this.f51821G);
        return Integer.valueOf(l4);
    }
}

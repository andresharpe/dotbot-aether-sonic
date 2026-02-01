package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.E(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f5, "R", "", "c", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes2.dex */
final class FlowKt__ZipKt$combine$6$1<T> extends Lambda implements X2.a<T[]> {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ InterfaceC2282i<T>[] f54018F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$6$1(InterfaceC2282i<T>[] interfaceC2282iArr) {
        super(0);
        this.f54018F = interfaceC2282iArr;
    }

    @Override // X2.a
    @l3.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final T[] n() {
        int length = this.f54018F.length;
        kotlin.jvm.internal.F.y(0, "T?");
        return (T[]) new Object[length];
    }
}

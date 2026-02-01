package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2178a extends kotlin.collections.r {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final boolean[] f52328E;

    /* renamed from: F, reason: collision with root package name */
    private int f52329F;

    public C2178a(@l3.d boolean[] array) {
        F.p(array, "array");
        this.f52328E = array;
    }

    @Override // kotlin.collections.r
    public boolean c() {
        try {
            boolean[] zArr = this.f52328E;
            int i4 = this.f52329F;
            this.f52329F = i4 + 1;
            return zArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f52329F--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f52329F < this.f52328E.length) {
            return true;
        }
        return false;
    }
}

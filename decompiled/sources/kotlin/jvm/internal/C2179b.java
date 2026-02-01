package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC2105s;

/* renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2179b extends AbstractC2105s {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final byte[] f52330E;

    /* renamed from: F, reason: collision with root package name */
    private int f52331F;

    public C2179b(@l3.d byte[] array) {
        F.p(array, "array");
        this.f52330E = array;
    }

    @Override // kotlin.collections.AbstractC2105s
    public byte c() {
        try {
            byte[] bArr = this.f52330E;
            int i4 = this.f52331F;
            this.f52331F = i4 + 1;
            return bArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f52331F--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f52331F < this.f52330E.length) {
            return true;
        }
        return false;
    }
}

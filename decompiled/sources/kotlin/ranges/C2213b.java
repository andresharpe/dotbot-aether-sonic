package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC2106t;
import kotlin.jvm.internal.F;

/* renamed from: kotlin.ranges.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2213b extends AbstractC2106t {

    /* renamed from: E, reason: collision with root package name */
    private final int f52451E;

    /* renamed from: F, reason: collision with root package name */
    private final int f52452F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f52453G;

    /* renamed from: H, reason: collision with root package name */
    private int f52454H;

    public C2213b(char c4, char c5, int i4) {
        this.f52451E = i4;
        this.f52452F = c5;
        boolean z3 = true;
        if (i4 <= 0 ? F.t(c4, c5) < 0 : F.t(c4, c5) > 0) {
            z3 = false;
        }
        this.f52453G = z3;
        this.f52454H = z3 ? c4 : c5;
    }

    @Override // kotlin.collections.AbstractC2106t
    public char c() {
        int i4 = this.f52454H;
        if (i4 == this.f52452F) {
            if (this.f52453G) {
                this.f52453G = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f52454H = this.f52451E + i4;
        }
        return (char) i4;
    }

    public final int d() {
        return this.f52451E;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52453G;
    }
}

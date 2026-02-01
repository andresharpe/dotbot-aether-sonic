package com.harman.sdk.utils;

import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/harman/sdk/utils/Color;", "Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", com.harman.log.b.f47574c, "c", "red", "green", "blue", "d", "(III)Lcom/harman/sdk/utils/Color;", "", "toString", "()Ljava/lang/String;", androidx.exifinterface.media.a.U4, "I", "h", "F", "g", "G", "f", "<init>", "(III)V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class Color implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private final int f48412E;

    /* renamed from: F, reason: collision with root package name */
    private final int f48413F;

    /* renamed from: G, reason: collision with root package name */
    private final int f48414G;

    public Color(int i4, int i5, int i6) {
        this.f48412E = i4;
        this.f48413F = i5;
        this.f48414G = i6;
    }

    public static /* synthetic */ Color e(Color color, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i4 = color.f48412E;
        }
        if ((i7 & 2) != 0) {
            i5 = color.f48413F;
        }
        if ((i7 & 4) != 0) {
            i6 = color.f48414G;
        }
        return color.d(i4, i5, i6);
    }

    public final int a() {
        return this.f48412E;
    }

    public final int b() {
        return this.f48413F;
    }

    public final int c() {
        return this.f48414G;
    }

    @l3.d
    public final Color d(int i4, int i5, int i6) {
        return new Color(i4, i5, i6);
    }

    public boolean equals(@l3.e Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!F.g(Color.class, cls)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.sdk.utils.Color");
        Color color = (Color) obj;
        if (this.f48412E == color.f48412E && this.f48413F == color.f48413F && this.f48414G == color.f48414G) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f48414G;
    }

    public final int g() {
        return this.f48413F;
    }

    public final int h() {
        return this.f48412E;
    }

    public int hashCode() {
        return (((this.f48412E * 31) + this.f48413F) * 31) + this.f48414G;
    }

    @l3.d
    public String toString() {
        return "Color(red=" + this.f48412E + ", green=" + this.f48413F + ", blue=" + this.f48414G + ")";
    }
}

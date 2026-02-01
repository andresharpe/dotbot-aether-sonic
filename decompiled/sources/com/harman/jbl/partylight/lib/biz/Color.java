package com.harman.jbl.partylight.lib.biz;

import com.harman.log.b;
import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.d;
import l3.e;

@E(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0004¨\u0006 "}, d2 = {"Lcom/harman/jbl/partylight/lib/biz/Color;", "Ljava/io/Serializable;", "", b.f47574c, "()I", "c", "d", "red", "green", "blue", "e", "(III)Lcom/harman/jbl/partylight/lib/biz/Color;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "I", "i", "F", "h", "G", "g", "<init>", "(III)V", "H", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class Color implements Serializable {

    /* renamed from: H, reason: collision with root package name */
    @d
    public static final a f46223H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    @d
    private static final Color f46224I = new Color(255, 255, 255);

    /* renamed from: E, reason: collision with root package name */
    private final int f46225E;

    /* renamed from: F, reason: collision with root package name */
    private final int f46226F;

    /* renamed from: G, reason: collision with root package name */
    private final int f46227G;

    @U({"SMAP\nTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Types.kt\ncom/harman/jbl/partylight/lib/biz/Color$Companion\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,240:1\n125#2,17:241\n*S KotlinDebug\n*F\n+ 1 Types.kt\ncom/harman/jbl/partylight/lib/biz/Color$Companion\n*L\n140#1:241,17\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @d
        public final Color a() {
            return Color.f46224I;
        }

        @d
        public final Color b(@d String color) {
            F.p(color, "color");
            int parseColor = android.graphics.Color.parseColor(color);
            return new Color((parseColor >> 16) & 255, (parseColor >> 8) & 255, parseColor & 255);
        }

        private a() {
        }
    }

    public Color(int i4, int i5, int i6) {
        this.f46225E = i4;
        this.f46226F = i5;
        this.f46227G = i6;
    }

    public static /* synthetic */ Color f(Color color, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i4 = color.f46225E;
        }
        if ((i7 & 2) != 0) {
            i5 = color.f46226F;
        }
        if ((i7 & 4) != 0) {
            i6 = color.f46227G;
        }
        return color.e(i4, i5, i6);
    }

    public final int b() {
        return this.f46225E;
    }

    public final int c() {
        return this.f46226F;
    }

    public final int d() {
        return this.f46227G;
    }

    @d
    public final Color e(int i4, int i5, int i6) {
        return new Color(i4, i5, i6);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Color)) {
            return false;
        }
        Color color = (Color) obj;
        return this.f46225E == color.f46225E && this.f46226F == color.f46226F && this.f46227G == color.f46227G;
    }

    public final int g() {
        return this.f46227G;
    }

    public final int h() {
        return this.f46226F;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f46225E) * 31) + Integer.hashCode(this.f46226F)) * 31) + Integer.hashCode(this.f46227G);
    }

    public final int i() {
        return this.f46225E;
    }

    @d
    public String toString() {
        return "Color(red=" + this.f46225E + ", green=" + this.f46226F + ", blue=" + this.f46227G + ")";
    }
}

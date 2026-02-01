package com.harman.sdk.utils;

import androidx.constraintlayout.core.motion.utils.v;
import java.io.Serializable;
import kotlin.E;
import kotlin.jvm.internal.F;

@E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\n¨\u0006$"}, d2 = {"Lcom/harman/sdk/utils/CustomLightPattern;", "Ljava/io/Serializable;", "Lcom/harman/sdk/utils/LightElements;", "a", "()Lcom/harman/sdk/utils/LightElements;", "", com.harman.log.b.f47574c, "()I", "Lcom/harman/sdk/utils/Color;", "c", "()Lcom/harman/sdk/utils/Color;", "lightElements", "motionValue", v.b.f7402d, "d", "(Lcom/harman/sdk/utils/LightElements;ILcom/harman/sdk/utils/Color;)Lcom/harman/sdk/utils/CustomLightPattern;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", androidx.exifinterface.media.a.U4, "Lcom/harman/sdk/utils/LightElements;", "g", "F", "I", "h", "G", "Lcom/harman/sdk/utils/Color;", "f", "<init>", "(Lcom/harman/sdk/utils/LightElements;ILcom/harman/sdk/utils/Color;)V", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CustomLightPattern implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final LightElements f48415E;

    /* renamed from: F, reason: collision with root package name */
    private final int f48416F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final Color f48417G;

    public CustomLightPattern(@l3.d LightElements lightElements, int i4, @l3.d Color color) {
        F.p(lightElements, "lightElements");
        F.p(color, "color");
        this.f48415E = lightElements;
        this.f48416F = i4;
        this.f48417G = color;
    }

    public static /* synthetic */ CustomLightPattern e(CustomLightPattern customLightPattern, LightElements lightElements, int i4, Color color, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lightElements = customLightPattern.f48415E;
        }
        if ((i5 & 2) != 0) {
            i4 = customLightPattern.f48416F;
        }
        if ((i5 & 4) != 0) {
            color = customLightPattern.f48417G;
        }
        return customLightPattern.d(lightElements, i4, color);
    }

    @l3.d
    public final LightElements a() {
        return this.f48415E;
    }

    public final int b() {
        return this.f48416F;
    }

    @l3.d
    public final Color c() {
        return this.f48417G;
    }

    @l3.d
    public final CustomLightPattern d(@l3.d LightElements lightElements, int i4, @l3.d Color color) {
        F.p(lightElements, "lightElements");
        F.p(color, "color");
        return new CustomLightPattern(lightElements, i4, color);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomLightPattern)) {
            return false;
        }
        CustomLightPattern customLightPattern = (CustomLightPattern) obj;
        return this.f48415E == customLightPattern.f48415E && this.f48416F == customLightPattern.f48416F && F.g(this.f48417G, customLightPattern.f48417G);
    }

    @l3.d
    public final Color f() {
        return this.f48417G;
    }

    @l3.d
    public final LightElements g() {
        return this.f48415E;
    }

    public final int h() {
        return this.f48416F;
    }

    public int hashCode() {
        return (((this.f48415E.hashCode() * 31) + Integer.hashCode(this.f48416F)) * 31) + this.f48417G.hashCode();
    }

    @l3.d
    public String toString() {
        return "CustomLightPattern(lightElements=" + this.f48415E + ", motionValue=" + this.f48416F + ", color=" + this.f48417G + ")";
    }
}

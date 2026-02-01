package com.airbnb.lottie.model;

import androidx.annotation.InterfaceC0569l;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class DocumentData {

    /* renamed from: a, reason: collision with root package name */
    public final String f21562a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21563b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21564c;

    /* renamed from: d, reason: collision with root package name */
    public final Justification f21565d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21566e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21567f;

    /* renamed from: g, reason: collision with root package name */
    public final float f21568g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC0569l
    public final int f21569h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC0569l
    public final int f21570i;

    /* renamed from: j, reason: collision with root package name */
    public final float f21571j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21572k;

    /* loaded from: classes.dex */
    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f4, Justification justification, int i4, float f5, float f6, @InterfaceC0569l int i5, @InterfaceC0569l int i6, float f7, boolean z3) {
        this.f21562a = str;
        this.f21563b = str2;
        this.f21564c = f4;
        this.f21565d = justification;
        this.f21566e = i4;
        this.f21567f = f5;
        this.f21568g = f6;
        this.f21569h = i5;
        this.f21570i = i6;
        this.f21571j = f7;
        this.f21572k = z3;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f21562a.hashCode() * 31) + this.f21563b.hashCode()) * 31) + this.f21564c)) * 31) + this.f21565d.ordinal()) * 31) + this.f21566e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f21567f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f21569h;
    }
}

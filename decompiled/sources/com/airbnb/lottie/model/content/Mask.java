package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class Mask {

    /* renamed from: a, reason: collision with root package name */
    private final MaskMode f21604a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f21605b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f21606c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21607d;

    /* loaded from: classes.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, com.airbnb.lottie.model.animatable.h hVar, com.airbnb.lottie.model.animatable.d dVar, boolean z3) {
        this.f21604a = maskMode;
        this.f21605b = hVar;
        this.f21606c = dVar;
        this.f21607d = z3;
    }

    public MaskMode a() {
        return this.f21604a;
    }

    public com.airbnb.lottie.model.animatable.h b() {
        return this.f21605b;
    }

    public com.airbnb.lottie.model.animatable.d c() {
        return this.f21606c;
    }

    public boolean d() {
        return this.f21607d;
    }
}

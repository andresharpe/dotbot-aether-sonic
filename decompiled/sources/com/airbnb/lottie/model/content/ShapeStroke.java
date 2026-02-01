package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.P;
import com.airbnb.lottie.animation.content.s;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeStroke implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f21621a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.model.animatable.b f21622b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f21623c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.a f21624d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f21625e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f21626f;

    /* renamed from: g, reason: collision with root package name */
    private final LineCapType f21627g;

    /* renamed from: h, reason: collision with root package name */
    private final LineJoinType f21628h;

    /* renamed from: i, reason: collision with root package name */
    private final float f21629i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f21630j;

    /* loaded from: classes.dex */
    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int i4 = a.f21631a[ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes.dex */
    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int i4 = a.f21632b[ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21631a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21632b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f21632b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21632b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21632b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f21631a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21631a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21631a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @P com.airbnb.lottie.model.animatable.b bVar, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f4, boolean z3) {
        this.f21621a = str;
        this.f21622b = bVar;
        this.f21623c = list;
        this.f21624d = aVar;
        this.f21625e = dVar;
        this.f21626f = bVar2;
        this.f21627g = lineCapType;
        this.f21628h = lineJoinType;
        this.f21629i = f4;
        this.f21630j = z3;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar) {
        return new s(jVar, bVar, this);
    }

    public LineCapType b() {
        return this.f21627g;
    }

    public com.airbnb.lottie.model.animatable.a c() {
        return this.f21624d;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f21622b;
    }

    public LineJoinType e() {
        return this.f21628h;
    }

    public List<com.airbnb.lottie.model.animatable.b> f() {
        return this.f21623c;
    }

    public float g() {
        return this.f21629i;
    }

    public String h() {
        return this.f21621a;
    }

    public com.airbnb.lottie.model.animatable.d i() {
        return this.f21625e;
    }

    public com.airbnb.lottie.model.animatable.b j() {
        return this.f21626f;
    }

    public boolean k() {
        return this.f21630j;
    }
}

package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.P;
import androidx.constraintlayout.core.motion.utils.v;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    private static final float f21994a = 100.0f;

    /* renamed from: c, reason: collision with root package name */
    private static androidx.collection.m<WeakReference<Interpolator>> f21996c;

    /* renamed from: b, reason: collision with root package name */
    private static final Interpolator f21995b = new LinearInterpolator();

    /* renamed from: d, reason: collision with root package name */
    static JsonReader.a f21997d = JsonReader.a.a("t", "s", "e", "o", "i", "h", v.h.f7540d, "ti");

    /* renamed from: e, reason: collision with root package name */
    static JsonReader.a f21998e = JsonReader.a.a("x", "y");

    t() {
    }

    @P
    private static WeakReference<Interpolator> a(int i4) {
        WeakReference<Interpolator> i5;
        synchronized (t.class) {
            i5 = g().i(i4);
        }
        return i5;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        Interpolator linearInterpolator;
        pointF.x = com.airbnb.lottie.utils.i.c(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.i.c(pointF.y, -100.0f, f21994a);
        pointF2.x = com.airbnb.lottie.utils.i.c(pointF2.x, -1.0f, 1.0f);
        float c4 = com.airbnb.lottie.utils.i.c(pointF2.y, -100.0f, f21994a);
        pointF2.y = c4;
        int i4 = com.airbnb.lottie.utils.j.i(pointF.x, pointF.y, pointF2.x, c4);
        WeakReference<Interpolator> a4 = a(i4);
        if (a4 != null) {
            interpolator = a4.get();
        } else {
            interpolator = null;
        }
        if (a4 == null || interpolator == null) {
            try {
                linearInterpolator = androidx.core.view.animation.b.b(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e4) {
                if ("The Path cannot loop back on itself.".equals(e4.getMessage())) {
                    linearInterpolator = androidx.core.view.animation.b.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                h(i4, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> com.airbnb.lottie.value.a<T> c(JsonReader jsonReader, com.airbnb.lottie.g gVar, float f4, M<T> m4, boolean z3, boolean z4) throws IOException {
        if (z3 && z4) {
            return e(gVar, jsonReader, f4, m4);
        }
        if (z3) {
            return d(gVar, jsonReader, f4, m4);
        }
        return f(jsonReader, f4, m4);
    }

    private static <T> com.airbnb.lottie.value.a<T> d(com.airbnb.lottie.g gVar, JsonReader jsonReader, float f4, M<T> m4) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t3;
        jsonReader.c();
        PointF pointF = null;
        T t4 = null;
        T t5 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f5 = 0.0f;
        boolean z3 = false;
        PointF pointF4 = null;
        while (jsonReader.i()) {
            switch (jsonReader.A(f21997d)) {
                case 0:
                    f5 = (float) jsonReader.k();
                    break;
                case 1:
                    t5 = m4.a(jsonReader, f4);
                    break;
                case 2:
                    t4 = m4.a(jsonReader, f4);
                    break;
                case 3:
                    pointF = s.e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.m() == 1) {
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                case 6:
                    pointF2 = s.e(jsonReader, f4);
                    break;
                case 7:
                    pointF3 = s.e(jsonReader, f4);
                    break;
                default:
                    jsonReader.F();
                    break;
            }
        }
        jsonReader.f();
        if (z3) {
            interpolator2 = f21995b;
            t3 = t5;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = b(pointF, pointF4);
            } else {
                interpolator = f21995b;
            }
            interpolator2 = interpolator;
            t3 = t4;
        }
        com.airbnb.lottie.value.a<T> aVar = new com.airbnb.lottie.value.a<>(gVar, t5, t3, interpolator2, f5, null);
        aVar.f23325o = pointF2;
        aVar.f23326p = pointF3;
        return aVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0023. Please report as an issue. */
    private static <T> com.airbnb.lottie.value.a<T> e(com.airbnb.lottie.g gVar, JsonReader jsonReader, float f4, M<T> m4) throws IOException {
        Interpolator interpolator;
        Interpolator b4;
        Interpolator b5;
        T t3;
        PointF pointF;
        com.airbnb.lottie.value.a<T> aVar;
        PointF pointF2;
        float f5;
        PointF pointF3;
        float f6;
        jsonReader.c();
        PointF pointF4 = null;
        boolean z3 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t4 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f7 = 0.0f;
        PointF pointF11 = null;
        T t5 = null;
        while (jsonReader.i()) {
            switch (jsonReader.A(f21997d)) {
                case 0:
                    pointF2 = pointF4;
                    f7 = (float) jsonReader.k();
                    pointF4 = pointF2;
                    break;
                case 1:
                    pointF2 = pointF4;
                    t4 = m4.a(jsonReader, f4);
                    pointF4 = pointF2;
                    break;
                case 2:
                    pointF2 = pointF4;
                    t5 = m4.a(jsonReader, f4);
                    pointF4 = pointF2;
                    break;
                case 3:
                    pointF2 = pointF4;
                    f5 = f7;
                    PointF pointF12 = pointF11;
                    if (jsonReader.v() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.c();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (jsonReader.i()) {
                            int A3 = jsonReader.A(f21998e);
                            if (A3 != 0) {
                                if (A3 != 1) {
                                    jsonReader.F();
                                } else {
                                    JsonReader.Token v3 = jsonReader.v();
                                    JsonReader.Token token = JsonReader.Token.NUMBER;
                                    if (v3 == token) {
                                        f11 = (float) jsonReader.k();
                                        f9 = f11;
                                    } else {
                                        jsonReader.b();
                                        f9 = (float) jsonReader.k();
                                        if (jsonReader.v() == token) {
                                            f11 = (float) jsonReader.k();
                                        } else {
                                            f11 = f9;
                                        }
                                        jsonReader.d();
                                    }
                                }
                            } else {
                                JsonReader.Token v4 = jsonReader.v();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (v4 == token2) {
                                    f10 = (float) jsonReader.k();
                                    f8 = f10;
                                } else {
                                    jsonReader.b();
                                    f8 = (float) jsonReader.k();
                                    if (jsonReader.v() == token2) {
                                        f10 = (float) jsonReader.k();
                                    } else {
                                        f10 = f8;
                                    }
                                    jsonReader.d();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f8, f9);
                        PointF pointF14 = new PointF(f10, f11);
                        jsonReader.f();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f7 = f5;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF5 = s.e(jsonReader, f4);
                        f7 = f5;
                        pointF11 = pointF12;
                        pointF4 = pointF2;
                    }
                case 4:
                    if (jsonReader.v() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.c();
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        while (jsonReader.i()) {
                            PointF pointF15 = pointF11;
                            int A4 = jsonReader.A(f21998e);
                            if (A4 != 0) {
                                pointF3 = pointF4;
                                if (A4 != 1) {
                                    jsonReader.F();
                                } else {
                                    JsonReader.Token v5 = jsonReader.v();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (v5 == token3) {
                                        f15 = (float) jsonReader.k();
                                        f7 = f7;
                                        f13 = f15;
                                    } else {
                                        float f16 = f7;
                                        jsonReader.b();
                                        float k4 = (float) jsonReader.k();
                                        if (jsonReader.v() == token3) {
                                            f6 = (float) jsonReader.k();
                                        } else {
                                            f6 = k4;
                                        }
                                        jsonReader.d();
                                        f7 = f16;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f15 = f6;
                                        f13 = k4;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f17 = f7;
                                JsonReader.Token v6 = jsonReader.v();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (v6 == token4) {
                                    f14 = (float) jsonReader.k();
                                    f7 = f17;
                                    f12 = f14;
                                } else {
                                    jsonReader.b();
                                    f12 = (float) jsonReader.k();
                                    if (jsonReader.v() == token4) {
                                        f14 = (float) jsonReader.k();
                                    } else {
                                        f14 = f12;
                                    }
                                    jsonReader.d();
                                    f7 = f17;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f5 = f7;
                        PointF pointF16 = new PointF(f12, f13);
                        PointF pointF17 = new PointF(f14, f15);
                        jsonReader.f();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f7 = f5;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = s.e(jsonReader, f4);
                        pointF4 = pointF2;
                    }
                case 5:
                    if (jsonReader.m() == 1) {
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                case 6:
                    pointF11 = s.e(jsonReader, f4);
                    break;
                case 7:
                    pointF4 = s.e(jsonReader, f4);
                    break;
                default:
                    jsonReader.F();
                    break;
            }
        }
        PointF pointF18 = pointF4;
        float f18 = f7;
        PointF pointF19 = pointF11;
        jsonReader.f();
        if (z3) {
            interpolator = f21995b;
            t3 = t4;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else {
                if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                    b4 = b(pointF7, pointF9);
                    b5 = b(pointF8, pointF10);
                    t3 = t5;
                    interpolator = null;
                    if (b4 == null && b5 != null) {
                        pointF = pointF19;
                        aVar = new com.airbnb.lottie.value.a<>(gVar, t4, t3, b4, b5, f18, null);
                    } else {
                        pointF = pointF19;
                        aVar = new com.airbnb.lottie.value.a<>(gVar, t4, t3, interpolator, f18, null);
                    }
                    aVar.f23325o = pointF;
                    aVar.f23326p = pointF18;
                    return aVar;
                }
                interpolator = f21995b;
            }
            t3 = t5;
        }
        b4 = null;
        b5 = null;
        if (b4 == null) {
        }
        pointF = pointF19;
        aVar = new com.airbnb.lottie.value.a<>(gVar, t4, t3, interpolator, f18, null);
        aVar.f23325o = pointF;
        aVar.f23326p = pointF18;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a<T> f(JsonReader jsonReader, float f4, M<T> m4) throws IOException {
        return new com.airbnb.lottie.value.a<>(m4.a(jsonReader, f4));
    }

    private static androidx.collection.m<WeakReference<Interpolator>> g() {
        if (f21996c == null) {
            f21996c = new androidx.collection.m<>();
        }
        return f21996c;
    }

    private static void h(int i4, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f21996c.p(i4, weakReference);
        }
    }
}

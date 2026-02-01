package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.InterfaceC0569l;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21992a = JsonReader.a.a("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21993a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f21993a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21993a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21993a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private s() {
    }

    private static PointF a(JsonReader jsonReader, float f4) throws IOException {
        jsonReader.b();
        float k4 = (float) jsonReader.k();
        float k5 = (float) jsonReader.k();
        while (jsonReader.v() != JsonReader.Token.END_ARRAY) {
            jsonReader.F();
        }
        jsonReader.d();
        return new PointF(k4 * f4, k5 * f4);
    }

    private static PointF b(JsonReader jsonReader, float f4) throws IOException {
        float k4 = (float) jsonReader.k();
        float k5 = (float) jsonReader.k();
        while (jsonReader.i()) {
            jsonReader.F();
        }
        return new PointF(k4 * f4, k5 * f4);
    }

    private static PointF c(JsonReader jsonReader, float f4) throws IOException {
        jsonReader.c();
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21992a);
            if (A3 != 0) {
                if (A3 != 1) {
                    jsonReader.D();
                    jsonReader.F();
                } else {
                    f6 = g(jsonReader);
                }
            } else {
                f5 = g(jsonReader);
            }
        }
        jsonReader.f();
        return new PointF(f5 * f4, f6 * f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0569l
    public static int d(JsonReader jsonReader) throws IOException {
        jsonReader.b();
        int k4 = (int) (jsonReader.k() * 255.0d);
        int k5 = (int) (jsonReader.k() * 255.0d);
        int k6 = (int) (jsonReader.k() * 255.0d);
        while (jsonReader.i()) {
            jsonReader.F();
        }
        jsonReader.d();
        return Color.argb(255, k4, k5, k6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF e(JsonReader jsonReader, float f4) throws IOException {
        int i4 = a.f21993a[jsonReader.v().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return c(jsonReader, f4);
                }
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.v());
            }
            return a(jsonReader, f4);
        }
        return b(jsonReader, f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> f(JsonReader jsonReader, float f4) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.b();
        while (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
            arrayList.add(e(jsonReader, f4));
            jsonReader.d();
        }
        jsonReader.d();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(JsonReader jsonReader) throws IOException {
        JsonReader.Token v3 = jsonReader.v();
        int i4 = a.f21993a[v3.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                jsonReader.b();
                float k4 = (float) jsonReader.k();
                while (jsonReader.i()) {
                    jsonReader.F();
                }
                jsonReader.d();
                return k4;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + v3);
        }
        return (float) jsonReader.k();
    }
}

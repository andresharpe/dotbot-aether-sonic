package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1015g implements M<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1015g f21877a = new C1015g();

    private C1015g() {
    }

    @Override // com.airbnb.lottie.parser.M
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f4) throws IOException {
        boolean z3;
        double d4;
        if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            jsonReader.b();
        }
        double k4 = jsonReader.k();
        double k5 = jsonReader.k();
        double k6 = jsonReader.k();
        if (jsonReader.v() == JsonReader.Token.NUMBER) {
            d4 = jsonReader.k();
        } else {
            d4 = 1.0d;
        }
        if (z3) {
            jsonReader.d();
        }
        if (k4 <= 1.0d && k5 <= 1.0d && k6 <= 1.0d) {
            k4 *= 255.0d;
            k5 *= 255.0d;
            k6 *= 255.0d;
            if (d4 <= 1.0d) {
                d4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d4, (int) k4, (int) k5, (int) k6));
    }
}

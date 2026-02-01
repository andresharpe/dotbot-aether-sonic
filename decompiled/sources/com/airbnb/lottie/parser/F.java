package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class F implements M<com.airbnb.lottie.value.k> {

    /* renamed from: a, reason: collision with root package name */
    public static final F f21860a = new F();

    private F() {
    }

    @Override // com.airbnb.lottie.parser.M
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k a(JsonReader jsonReader, float f4) throws IOException {
        boolean z3;
        if (jsonReader.v() == JsonReader.Token.BEGIN_ARRAY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            jsonReader.b();
        }
        float k4 = (float) jsonReader.k();
        float k5 = (float) jsonReader.k();
        while (jsonReader.i()) {
            jsonReader.F();
        }
        if (z3) {
            jsonReader.d();
        }
        return new com.airbnb.lottie.value.k((k4 / 100.0f) * f4, (k5 / 100.0f) * f4);
    }
}

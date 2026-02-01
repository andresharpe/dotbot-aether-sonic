package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1022n {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21984a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    private C1022n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.b a(JsonReader jsonReader) throws IOException {
        jsonReader.c();
        String str = null;
        String str2 = null;
        float f4 = 0.0f;
        String str3 = null;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21984a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        if (A3 != 3) {
                            jsonReader.D();
                            jsonReader.F();
                        } else {
                            f4 = (float) jsonReader.k();
                        }
                    } else {
                        str2 = jsonReader.p();
                    }
                } else {
                    str3 = jsonReader.p();
                }
            } else {
                str = jsonReader.p();
            }
        }
        jsonReader.f();
        return new com.airbnb.lottie.model.b(str, str3, str2, f4);
    }
}

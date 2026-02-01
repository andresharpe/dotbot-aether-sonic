package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1010b {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21870a = JsonReader.a.a("a");

    /* renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f21871b = JsonReader.a.a("fc", "sc", "sw", "t");

    private C1010b() {
    }

    public static com.airbnb.lottie.model.animatable.k a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        com.airbnb.lottie.model.animatable.k kVar = null;
        while (jsonReader.i()) {
            if (jsonReader.A(f21870a) != 0) {
                jsonReader.D();
                jsonReader.F();
            } else {
                kVar = b(jsonReader, gVar);
            }
        }
        jsonReader.f();
        if (kVar == null) {
            return new com.airbnb.lottie.model.animatable.k(null, null, null, null);
        }
        return kVar;
    }

    private static com.airbnb.lottie.model.animatable.k b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.a aVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21871b);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        if (A3 != 3) {
                            jsonReader.D();
                            jsonReader.F();
                        } else {
                            bVar2 = C1012d.e(jsonReader, gVar);
                        }
                    } else {
                        bVar = C1012d.e(jsonReader, gVar);
                    }
                } else {
                    aVar2 = C1012d.c(jsonReader, gVar);
                }
            } else {
                aVar = C1012d.c(jsonReader, gVar);
            }
        }
        jsonReader.f();
        return new com.airbnb.lottie.model.animatable.k(aVar, aVar2, bVar, bVar2);
    }
}

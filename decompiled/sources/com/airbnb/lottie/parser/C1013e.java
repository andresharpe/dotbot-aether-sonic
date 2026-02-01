package com.airbnb.lottie.parser;

import androidx.annotation.P;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1013e {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21874a = JsonReader.a.a("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final JsonReader.a f21875b = JsonReader.a.a("ty", "v");

    C1013e() {
    }

    @P
    private static com.airbnb.lottie.model.content.a a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        jsonReader.c();
        com.airbnb.lottie.model.content.a aVar = null;
        while (true) {
            boolean z3 = false;
            while (jsonReader.i()) {
                int A3 = jsonReader.A(f21875b);
                if (A3 != 0) {
                    if (A3 != 1) {
                        jsonReader.D();
                        jsonReader.F();
                    } else if (z3) {
                        aVar = new com.airbnb.lottie.model.content.a(C1012d.e(jsonReader, gVar));
                    } else {
                        jsonReader.F();
                    }
                } else if (jsonReader.m() == 0) {
                    z3 = true;
                }
            }
            jsonReader.f();
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public static com.airbnb.lottie.model.content.a b(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        com.airbnb.lottie.model.content.a aVar = null;
        while (jsonReader.i()) {
            if (jsonReader.A(f21874a) != 0) {
                jsonReader.D();
                jsonReader.F();
            } else {
                jsonReader.b();
                while (jsonReader.i()) {
                    com.airbnb.lottie.model.content.a a4 = a(jsonReader, gVar);
                    if (a4 != null) {
                        aVar = a4;
                    }
                }
                jsonReader.d();
            }
        }
        return aVar;
    }
}

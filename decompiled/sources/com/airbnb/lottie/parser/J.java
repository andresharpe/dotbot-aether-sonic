package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    static JsonReader.a f21865a = JsonReader.a.a("nm", "ind", "ks", "hd");

    private J() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.l a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String str = null;
        int i4 = 0;
        boolean z3 = false;
        com.airbnb.lottie.model.animatable.h hVar = null;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21865a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        if (A3 != 3) {
                            jsonReader.F();
                        } else {
                            z3 = jsonReader.j();
                        }
                    } else {
                        hVar = C1012d.k(jsonReader, gVar);
                    }
                } else {
                    i4 = jsonReader.m();
                }
            } else {
                str = jsonReader.p();
            }
        }
        return new com.airbnb.lottie.model.content.l(str, i4, hVar, z3);
    }
}

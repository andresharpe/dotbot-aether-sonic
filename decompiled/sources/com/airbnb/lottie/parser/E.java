package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21859a = JsonReader.a.a("nm", "c", "o", "tr", "hd");

    private E() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.h a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        boolean z3 = false;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21859a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        if (A3 != 3) {
                            if (A3 != 4) {
                                jsonReader.F();
                            } else {
                                z3 = jsonReader.j();
                            }
                        } else {
                            lVar = C1011c.g(jsonReader, gVar);
                        }
                    } else {
                        bVar2 = C1012d.f(jsonReader, gVar, false);
                    }
                } else {
                    bVar = C1012d.f(jsonReader, gVar, false);
                }
            } else {
                str = jsonReader.p();
            }
        }
        return new com.airbnb.lottie.model.content.h(str, bVar, bVar2, lVar, z3);
    }
}

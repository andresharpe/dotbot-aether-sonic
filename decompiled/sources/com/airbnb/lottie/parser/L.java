package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21868a = JsonReader.a.a("s", "e", "o", "nm", "m", "hd");

    private L() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ShapeTrimPath a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String str = null;
        ShapeTrimPath.Type type = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        boolean z3 = false;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21868a);
            if (A3 != 0) {
                if (A3 != 1) {
                    if (A3 != 2) {
                        if (A3 != 3) {
                            if (A3 != 4) {
                                if (A3 != 5) {
                                    jsonReader.F();
                                } else {
                                    z3 = jsonReader.j();
                                }
                            } else {
                                type = ShapeTrimPath.Type.b(jsonReader.m());
                            }
                        } else {
                            str = jsonReader.p();
                        }
                    } else {
                        bVar3 = C1012d.f(jsonReader, gVar, false);
                    }
                } else {
                    bVar2 = C1012d.f(jsonReader, gVar, false);
                }
            } else {
                bVar = C1012d.f(jsonReader, gVar, false);
            }
        }
        return new ShapeTrimPath(str, type, bVar, bVar2, bVar3, z3);
    }
}

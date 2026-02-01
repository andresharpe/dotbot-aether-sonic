package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonReader.a f21858a = JsonReader.a.a("nm", "p", "s", "r", "hd");

    private D() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.g a(JsonReader jsonReader, com.airbnb.lottie.g gVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        boolean z3 = false;
        while (jsonReader.i()) {
            int A3 = jsonReader.A(f21858a);
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
                            bVar = C1012d.e(jsonReader, gVar);
                        }
                    } else {
                        fVar = C1012d.i(jsonReader, gVar);
                    }
                } else {
                    mVar = C1009a.b(jsonReader, gVar);
                }
            } else {
                str = jsonReader.p();
            }
        }
        return new com.airbnb.lottie.model.content.g(str, mVar, fVar, bVar, z3);
    }
}
